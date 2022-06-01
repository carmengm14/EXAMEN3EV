import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Crea un fichero "DobleByte.java"
 * 
 * Debes crear un programa que duplique byte a byte un fichero cuyo nombre debe
 * pasarse por la línea de comandos. El fichero de salida debe añadir al final
 * del nombre la extensión ".doble". El fichero original debe permanecer
 * inalterado.
 */
public class DobleByte {
    public static void main(String[] args) throws IOException {

        try {
            FileInputStream leerFichero = new FileInputStream("ficheroDoubleByte.txt");
            FileOutputStream escribirFichero = new FileOutputStream("ficheroDoubleByte.doble");
            int primerByte = leerFichero.read();
            while (primerByte != -1) {
                escribirFichero.write((char) primerByte);
                escribirFichero.write((char) primerByte);
                primerByte = leerFichero.read();
            }
            leerFichero.close();
            escribirFichero.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
    }
}
