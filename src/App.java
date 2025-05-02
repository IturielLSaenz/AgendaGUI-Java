import java.util.ArrayList;
import java.util.List;
/*
    Archivo ejecutable para el programa
    Aquí se implementa la gui y todo el funcionamiento
    Autor: Ituriel Liebes Saenz
    Gracias gente de stackoverflow por la ayuda, gente divina.
    Tecnologías: Java, JFrame.
*/
public class App {
    public static void main(String[] args) {
        // Crear contacto principal (el dueño de la agenda) <- reemplazar por el usuario!
        Person owner = new Person("Ituriel", "12345678", "iliebes@anahuac.mx");

        // Crear agenda y agregar un evento opcional
        Agenda agenda = new Agenda(owner);

        // Lista compartida de contactos
        List<Person> contacts = new ArrayList<>();
        contacts.add(owner); // Puedes iniciar con uno o más contactos

        // Crear GUI en el hilo de la interfaz
        javax.swing.SwingUtilities.invokeLater(() -> {
            new AgendaForm(agenda, contacts).setVisible(true);
        });
    }
}
