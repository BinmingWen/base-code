package Exception;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : MyCloseable  //类名
 * @date 2020/10/29 11:50
 */
public class MyCloseable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("execute MyCloseable Close Method");
    }
    public void doInit(){
        System.out.println("execute MyCloseable");
    }

    public static void main(String[] args) {
        try(MyCloseable myCloseable = new MyCloseable()) {
            myCloseable.doInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
