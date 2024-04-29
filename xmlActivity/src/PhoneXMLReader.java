import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class PhoneXMLReader{
    public static void main(String[] args) {
        try{
            File input = new File("phone.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            //parses files
            Document doc = builder.parse(input);

            //gets root of document
            System.out.println("Root element: "+ doc.getDocumentElement().getNodeName());

            NodeList phoneList = doc.getElementsByTagName("phone");

            for(int i = 0; i < phoneList.getLength(); i++){
                Node node = phoneList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;

                    System.out.println("ID: "+ element.getAttribute("id"));
                    System.out.println("OS: "+ element.getElementsByTagName("os").item(0));
                    System.out.println("model: "+ element.getElementsByTagName("model").item(0).getTextContent());
                    System.out.println("year: "+ element.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println();
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}