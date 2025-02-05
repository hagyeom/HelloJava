package practice.bluemarble;

public abstract class PurchasableTile extends Tile {
    protected int price;

    protected int toll;

    protected Player owner;

    public PurchasableTile(String name) {
        super(name);
    }

    {
        // 가격 정의
        switch (name) {
            case "타이베이": // City extends PurchasableTile
                price = 50_000;
                break;
            case "베이징":
            case "마닐라":
                price = 80_000;
                break;
            case "콩코드여객기": // Vehicle extends PurchasableTile 통행료 고정(탈 것, 제주도)
                price = 200_000;
                break;
        }
    }

    public abstract int getToll() throws RuntimeException;
}
