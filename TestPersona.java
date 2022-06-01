import java.io.IOException;

public class TestPersona {
    public static void main(String[] args) throws IOException {
        Persona persona1 = new Persona("Carmen", "Garcia", 18, "20918780J", "Castellon");
        persona1.serializar();
        System.out.println(persona1);
        Persona persona2 = new Persona("Maria", "Magdalena", 118, "20847561K", "Jerusalen");
        persona2.serializar();
        System.out.println(persona2);
    }
}

