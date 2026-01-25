import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {

    public static String construir(Estudiante e1, Estudiante e2, Estudiante e3) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        List<String> lineas = estudiantes.stream()
                .map(e -> "- " + e.getNombre() + " (" + e.getEdad() + " años), "
                        + e.getCorreo() + ", semestre " + e.getSemestre())
                .collect(Collectors.toList());

        return "Hola, bienvenidos! Nosotros somos el grupo de 3 personas conformado por:\n"
                + String.join("\n", lineas);
    }
}
