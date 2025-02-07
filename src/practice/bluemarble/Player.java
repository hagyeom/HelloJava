package practice.bluemarble;

import practice.bluemarble.exception.BankruptPlayerViolation;
import practice.bluemarble.exception.PlayerHasNoMoneyViolation;

import java.util.Scanner;

public class Player extends Payable {
    private String playerName;

    private int loanCount;

    public Player(String playerName) {
        this.playerName = playerName;
        this.cash = 2_000;
        this.loanCount = 0;
    }

    @Override
    protected void minusAmount(int amount) throws PlayerHasNoMoneyViolation {
        // 0 밑으로 내려가지 않도록 Exception 필요
        // 돈은 마이너스가 될수 없음
        if (this.cash < amount) {
            throw new PlayerHasNoMoneyViolation(playerName);
        } else {
            super.minusAmount(amount);
        }
    }

    protected void loan() {
        loanCount++;

        if (loanCount > 4) {
            throw new BankruptPlayerViolation(playerName);
        } else {
            this.cash = 10_000;
        }
    }

    public void payAmountTo(Payable receiver, int amount) {
        try {
            minusAmount(amount); // 예외가 발생하면 밑에 plusAmount는 수행되지 않음

            receiver.plusAmount(amount);
        } catch (PlayerHasNoMoneyViolation e) {
            Scanner sc = new Scanner(System.in);
            System.out.println("대출을 수행하시겠습니까? y/n");

            if ("y".equals(sc.nextLine())) {
                loan();
                payAmountTo(receiver, amount);
            } else {
                payAllAssetsTo(receiver);
                throw new BankruptPlayerViolation(playerName);
            }
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}
