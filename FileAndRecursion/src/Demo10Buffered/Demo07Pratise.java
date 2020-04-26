package Demo10Buffered;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Demo07Pratise {
    public static void main(String[] args) throws IOException {
        //对文本进行排序，并保存在文件中
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\Demo10Buffered\\f.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\intellij idea\\base-code\\FileAndRecursion\\src\\Demo10Buffered\\g.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
           // System.out.println(split.length);
            //System.out.println(Arrays.toString(split));
            map.put(split[0], split[1]);
        }
        br.close();
        System.out.println(map);
        for (String key : map.keySet()) {
            String value = map.get(key);
            bw.write(key + "." + value);
            bw.newLine();
        }
        bw.close();
    }
}
