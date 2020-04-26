package Demo12Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01PersionSerializable {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("person.txt"));
        os.writeObject(new Person(22, "嘉义"));
        os.close();
    }
}
