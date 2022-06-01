import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class TestPersonaXML {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
        PersonaXML p1 = new PersonaXML("Carmen", "Garcia", 18, "20945685G", "Castellon");
        p1.generarXML();
    }
}
