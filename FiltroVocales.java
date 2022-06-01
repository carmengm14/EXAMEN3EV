
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
public class FiltroVocales {
    public static void main(String[] args) throws IOException {
        FileReader lector = new FileReader("ficheroFiltroVocales.txt");
        int longitud = lector.read();
        char letra = (char)longitud;

        File ficheroSalida = new File("ficheroFiltroVocales.filtrado");
        FileWriter writer = new FileWriter(ficheroSalida);
     
        for (int i = 0; i <= longitud; i++) {
            if (esVocal(letra) == true) {
                writer.write(i + "\n");
                
            }
        }
        writer.close();
        lector.close();
    }
    public static char esVocal(char caracter){
        if (caracter == 'á') {
            return 'a';
        }else if  (caracter == 'é'){
            return 'e';
        }else if (caracter == 'í'){
            return 'i';
        }else if (caracter == 'ó'){
            return 'o';
        }else if (caracter == 'ú'){
            return 'u';
        }
        }
    }

}
