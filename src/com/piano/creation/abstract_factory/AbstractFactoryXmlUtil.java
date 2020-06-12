package com.piano.creation.abstract_factory;

import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * xml 工具类，用于获取 xml 配置的具体工厂类的对象
 */
class AbstractFactoryXmlUtil {
    //该方法用于从 xml 配置文件中提取具体类的类名，并返回一个实例对象
    static Object getBean() {
        try {
            //创建 DOM 文档对象
            DocumentBuilderFactory builderFactory = new DocumentBuilderFactoryImpl();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src\\com\\piano\\creation\\abstract_factory\\builder.xml"));

            NodeList nodeList = document.getElementsByTagName("className");
            Node item = nodeList.item(0).getFirstChild();
            String className = item.getNodeValue();
            //通过反射创建对象
            return Class.forName(className.trim()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
