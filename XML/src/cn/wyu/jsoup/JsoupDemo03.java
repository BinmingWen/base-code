package cn.wyu.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo03 {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //2.获取document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        System.out.println("------------");
        Element ele_student = document.getElementsByTag("student").get(0);
        Elements ele_name = ele_student.getElementsByTag("name");
        String number = ele_name.attr("number");
        System.out.println(number);
        System.out.println("==========");
        System.out.println(ele_name.size());
        System.out.println("========");
        String text = ele_name.text();
        System.out.println(text);
        System.out.println("========");
        String html = ele_name.html();
        System.out.println(html);
    }
}
