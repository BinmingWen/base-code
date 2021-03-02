package cn.wyu.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo04 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //2.获取document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("------------");
        Elements elements1 = document.select("#wyu");
        System.out.println(elements1);
        System.out.println("---------");
        Elements elements2 = document.select("student[number=\"001\"]");
        System.out.println(elements2);
        System.out.println("---------");
        Elements elements3 = document.select("student[number=\"001\"]>age");
        System.out.println(elements3);
    }
}
