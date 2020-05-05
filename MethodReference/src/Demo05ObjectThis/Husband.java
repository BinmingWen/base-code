package Demo05ObjectThis;

public class Husband {
    public void buyhouse(){
        System.out.println("在广州天河买了一套房");
    }
    public void mary(Richable r) {
        r.buy();
    }
    public void soHappy(){
      /*  mary(()->{
            this.buyhouse();
        });*/
        mary(this::buyhouse);

    }

    public static void main(String[] args) {
        new Husband().buyhouse();
    }

}
