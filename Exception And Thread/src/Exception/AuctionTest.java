package Exception;

public class AuctionTest {
    private double initPrice = 30.0;

    public void bid(String string) throws AuctionException {
        double d = 0.0;
        try {
            d = Double.parseDouble(string);
        } catch (Exception e) {
            e.printStackTrace();
            throw new AuctionException("竞拍必须是数值，不能是其他字符");
        }
        if (initPrice > d) {
            throw new AuctionException("低于竞拍价格，不能竞拍");
        }
        initPrice = d;

    }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try {
            at.bid("at");
        } catch (AuctionException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
