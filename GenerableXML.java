import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

/**
 * Crea una interfaz "GenerableXML" con el siguiente método:
 * 
 * > public void generarXML()
 * 
 * Crea una clase PersonaXML que herede de Persona (del ejercicio anterior).
 * Esta clase debe implementar la interfaz "GenerableXML"
 * 
 * El método implementado debe permitir generar en un fichero el XML
 * correspondiente a todos los campos del objeto PersonaXML. El nombre del
 * fichero generado debe ser el resultado de concatenar el nombre y la edad sin
 * espacios. La extensión del fichero debe ser ".xml".
 * 
 * No hay limitación en las clases que debes usar para generar el XML.
 * 
 * Crea la clase TestPersonaXML y prueba con un objeto.
 */
public interface GenerableXML {
    void generarXML() throws TransformerException, FileNotFoundException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError, ClassNotFoundException;
}
