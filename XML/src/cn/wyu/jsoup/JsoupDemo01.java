package cn.wyu.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //2.获取document对象
        Document d = Jsoup.parse(path,"UTF-8");
        System.out.println(d);
       /* //3.获取元素Element对象
        Elements names = d.getElementsByTag("name");
        System.out.println(names.size());
        Element name = names.get(0);
        String text = name.text();
        System.out.println(text);*/
    }

}
