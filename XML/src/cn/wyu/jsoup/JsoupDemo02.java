package cn.wyu.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.MalformedURLException;
import java.net.URL;

public class JsoupDemo02 {
    public static void main(String[] args) throws Exception {
        //1.获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //2.获取document对象
        URL url = new URL("https://www.avforums.com/");
        Document d = Jsoup.parse(url,100000);
        System.out.println(d);
    }
}
