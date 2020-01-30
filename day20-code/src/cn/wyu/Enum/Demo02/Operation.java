package cn.wyu.Enum.Demo02;

public enum Operation {
    PLUS{
        @Override
        public double eval(double x, double y) {
            return x+y;
        }
    },
    MINUS{
        @Override
        public double eval(double x, double y) {
            return x-y;
        }
    },
    TIMES{
        @Override
        public double eval(double x, double y) {
            return x*y;
        }
    },
    DIVIDE{
        @Override
        public double eval(double x, double y) {
            return x/y;
        }
    };
    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(2, 4));
        System.out.println(Operation.MINUS.eval(8, 9));
        System.out.println(Operation.TIMES.eval(4, 5));
        System.out.println(Operation.DIVIDE.eval(4,2));
    }
}
