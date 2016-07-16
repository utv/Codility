package XSLT;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;


public class XslTransform {
    public XslTransform() {

    }

    private static void tranform(File dataXML, File inputXSL, String outputHTML) throws TransformerConfigurationException, TransformerException
    {

        StreamSource source = new StreamSource(dataXML);
        StreamSource stylesource = new StreamSource(inputXSL);

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(stylesource);

        StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);

    }

    public static void main(String[] args) {
        try {
            File xml = new File("/Users/Amata/MyJavaWork/src/XSLT/tictactoe.xml");
            File xsl = new File("/Users/Amata/MyJavaWork/src/XSLT/tictactoe.xsl");

            tranform(xml, xsl, "output.html");
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
