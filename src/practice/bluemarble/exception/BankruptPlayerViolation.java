package practice.bluemarble.exception;

public class BankruptPlayerViolation extends RuntimeException {
    public BankruptPlayerViolation(String playerName) {
        super("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
                + playerName + "님이 파산하셨습니다."
                + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
}
