import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Crea una clase "Persona" con los siguientes atributos:
 * 
 * Nombre
 * Apellidos
 * Edad
 * DNI
 * Domicilio
 * 
 * Los atributos no deben ser visibles desde fuera de la clase.
 * 
 * Crea el constructor adecuado.
 * 
 * Crea los getters y setters para todos los atributos.
 * 
 * Crea el método adecuado para que Java pueda manejar un objeto de la clase
 * Persona como una cadena de texto.
 * 
 * Crea un método "serializar" que escriba el objeto serializado en un fichero
 * cuyo nombre debe ser el resultado de unir nombre y apellidos sin espacios. El
 * fichero también tiene que tener una extensión ".persona".
 * 
 * Crea una clase TestPersona.java en la que se construyan dos objetos y se
 * llame al método "serializar" de los mismos.
 */
public class Persona {
    // ATRIBUTOS
    private String nombre, apellidos, dni, domicilio;
    private int edad;

    // CONSTRUCTOR
    public Persona(String nombre, String apellidos, int edad, String dni, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.domicilio = domicilio;
        this.edad = edad;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // METODOS
    /**
     * * Crea el método adecuado para que Java pueda manejar un objeto de la clase
     * * Persona como una cadena de texto.
     */

    @Override
    public String toString() {
        return this.nombre + " " + this.apellidos + " " + this.edad + " " + this.dni + " " + this.domicilio;
    }

    /**
     * * Crea un método "serializar" que escriba el objeto serializado en un fichero
     * * cuyo nombre debe ser el resultado de unir nombre y apellidos sin espacios. El
     * * fichero también tiene que tener una extensión ".persona".
     * @throws IOException
     */

     public void serializar() throws IOException{
        File file = new File("persona.persona");
        if(!file.exists()){
            file.createNewFile();
        }
        try (DataOutputStream writer = new DataOutputStream(
            new FileOutputStream(file));
            ObjectOutputStream salida = new ObjectOutputStream(writer)){
                    salida.writeObject(getNombre()+""+ getApellidos());   
                writer.close();
        } catch (Exception e) {
        // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
     }
}
