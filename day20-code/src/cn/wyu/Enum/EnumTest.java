package cn.wyu.Enum;

public class EnumTest {
    public void judge(SeasonEnum s) {

        switch (s) {
            case SPRING:
                System.out.println("春暖花开，正好踏青");
                break;
            case SUMMER:
                System.out.println("夏日炎炎，适合游泳");
                break;
            case FALL:
                System.out.println("秋高气爽，进补及时");
                break;
            case WINTER:
                System.out.println("冬日雪飘，围炉赏雪");
                break;
        }
    }
    public static void main(String[] args) {

        /*for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s);
           // System.out.println(s.toString());
            //System.out.println(s.ordinal());
            //System.out.println(s.name());
        }*/
        //SeasonEnum st = SeasonEnum.values();
       // System.out.println(st.toString());
       // System.out.println(SeasonEnum.);

    }
}
