
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Crea un fichero "FiltroVocales.java"
 * 
 * Debes crear un programa que elimine las vocales sin acentuar de un fichero.
 * El fichero de salida debe añadir la extensión ".filtrado" al nombre del
 * fichero original.
 */
public class FiltroVocales2 {
    public static void main(String[] args) throws IOException {
        String cadena;
        FileReader lector = new FileReader("ficheroFiltroVocales.txt");
        int longitud = lector.read();
        while (longitud != -1) {
            cadena = lector.read();
        }

        File ficheroSalida = new File("ficheroFiltroVocales.filtrado");
        FileWriter writer = new FileWriter(ficheroSalida);

        for (int i = 0; i <= longitud; i++) {
            if (esVocal(cadena)) {

            } else {
                writer.write((char)i);
            }
        }
        writer.close();
        lector.close();
    }

    public static String esVocal(String cadena) {
        char caracter;
        String cadenaNoVocals = " ";
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u'){

            }else{
                cadenaNoVocals += caracter;
            }
        }
        return cadenaNoVocals;
    }
}
