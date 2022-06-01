import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.lang.model.element.Element;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Node;

public class PersonaXML extends Persona implements GenerableXML {

    public PersonaXML(String nombre, String apellidos, int edad, String dni, String domicilio) {
        super(nombre, apellidos, edad, dni, domicilio);

    }

    /**
     * * El método implementado debe permitir generar en un fichero el XML
     * correspondiente a todos los campos del objeto PersonaXML. El nombre del
     * fichero generado debe ser el resultado de concatenar el nombre y la edad sin
     * espacios. La extensión del fichero debe ser ".xml".
     * @throws IOException
     * @throws TransformerFactoryConfigurationError
     * @throws FileNotFoundException
     * @throws ParserConfigurationException
     * @throws TransformerException
     * @throws ClassNotFoundException
     */

    @Override
    public void generarXML() throws FileNotFoundException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException, ClassNotFoundException{
        try {
        // TODO Auto-generated method stub
        // Leemos el fichero con los objetos que queremos poner en el XML
        ObjectInputStream fichero = new ObjectInputStream(
            new FileInputStream("persona.persona"));
        // Creamos el doc que empezara con el nodo raiz
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element persona = createElement("persona");
        doc.appendChild((Node) persona);
        // creamos la variable persona donde iremos metiendo los persona 1 a 1
        Persona personita;
            while (true) {
                // Leemos los datos del fichero que hemos cogido anteriormente y lo guardamos en
                // persona
                personita = (Persona) fichero.readObject();

                // creamos el nombre del nodo padre , y le ponemos un atributo al cual le
                // ponemos texto (El id en este caso)
                Element perElement = (Element) doc.createElement("persona");
                
                // creamos los hijos del nodo padre y les ponemos texto, luego los añadiremos al
                // nodo padre para decir que son hijos de ese nodo y no de otro padre
                Element hijo = (Element) doc.createElement("nombre");
                ((Node) hijo).appendChild(doc.createTextNode(personita.getNombre()));
                ((Node) perElement).appendChild((Node) hijo);

                Element hijo2 = (Element) doc.createElement("apellidos");
                ((Node) hijo2).appendChild(doc.createTextNode(personita.getApellidos()));
                ((Node) perElement).appendChild((Node) hijo2);

                Element hijo3 = (Element) doc.createElement("dni");
                ((Node) hijo3).appendChild(doc.createTextNode(personita.getDni()));
                ((Node) perElement).appendChild((Node) hijo3);

                Element hijo4 = (Element) doc.createElement("domicilio");
                ((Node) hijo4).appendChild(doc.createTextNode(personita.getDomicilio()));
                ((Node) perElement).appendChild((Node) hijo4);

                // Guarda todos los nodos del persona creado y asi cuando pase al siguiente
                // persona se mantendran almacenados en vez de superponerse
                ((Node) persona).appendChild((Node) perElement);
                // Creamos el transformador, el source y el Stream que seran los encargados de
                // escribir todo lo que hayamos hecho anteriormente.
                Transformer transformador = TransformerFactory.newInstance().newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult resultado = new StreamResult(new FileOutputStream(getNombre() + "" + getEdad() + ".xml"));

                transformador.transform(source, resultado);    
                fichero.close();   
        }
        } catch (EOFException eof) {
            // TODO: handle exception
            
        }}

    private Element createElement(String string) {
        return null;
    }
}
