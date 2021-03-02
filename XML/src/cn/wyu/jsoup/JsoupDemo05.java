package cn.wyu.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsoupDemo05 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        //2.获取document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.根据Document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        List<Object> stu_nodes = jxDocument.sel("//student");
        stu_nodes.forEach((o -> System.out.println(o)));
        System.out.println("-------");
        List<Object> name_nodes = jxDocument.sel("//student/name");
        name_nodes.forEach((o -> System.out.println(o)));
        System.out.println("==========");
        List<Object> id_nodes = jxDocument.sel("//student/name[@id]");
        id_nodes.forEach((o -> System.out.println(o)));
        System.out.println("==========");
        List<Object> id_value = jxDocument.sel("//student/name[@id='wyu']");
        id_value.forEach((o -> System.out.println(o)));

    }
}
