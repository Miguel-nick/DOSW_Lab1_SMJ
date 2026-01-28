import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Reto1 {

    // Objeto Estudiante
    static class Estudiante {
        private final String nombre;
        private final String correo;
        private final int edad;
        private final int semestre;

        public Estudiante(String nombre, String correo, int edad, int semestre) {
            this.nombre = nombre;
            this.correo = correo;
            this.edad = edad;
            this.semestre = semestre;
        }

        public String getNombre() { return nombre; }
        public String getCorreo() { return correo; }
        public int getEdad() { return edad; }
        public int getSemestre() { return semestre; }
    }

    // Objeto MensajeBienvenida
    static class MensajeBienvenida {
        public String crear(List<Estudiante> estudiantes) {
            String personas = estudiantes.stream()
                    .map(e -> e.getNombre() + ", estudiante de la escuela de " + e.getSemestre() +
                            "° semestre de " + e.getEdad() + " años")
                    .collect(Collectors.joining(", y "));

            String correos = estudiantes.stream()
                    .map(Estudiante::getCorreo)
                    .collect(Collectors.joining(" y "));

            return "¡Hola, bienvenidos! Nosotros somos la pareja conformada por " + personas +
                    ". Nuestros correos institucionales son " + correos + ".";
        }
    }

    public static void main(String[] args) {
        List<Estudiante> estudiantes = List.of(
                new Estudiante("Juan Angel", "juan.salas-g@mai.escuelaing.edu.co", 20, 6),
                new Estudiante("Sebastian A", "sebastian.aurela-m@mail.escuelaing.edu.co", 21, 6),
                new Estudiante("Miguel A", "miguel.sandoval-l@mail.escuelaing.edu.co", 20, 6)
        );

        MensajeBienvenida mensaje = new MensajeBienvenida();

        // Expresión lambda para imprimir el saludo
        Consumer<String> imprimir = s -> System.out.println(s);
        imprimir.accept(mensaje.crear(estudiantes));
    }
}
