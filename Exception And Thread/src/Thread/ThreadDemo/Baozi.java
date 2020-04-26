package Thread.ThreadDemo;

public class Baozi {
    //包子皮
    private String pi;
    //包子馅
    private String xian;

    public Baozi() {
    }

    //判断当前是否有包子,true为有包子，false没有包子
    private boolean flag;

    public Baozi(String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
