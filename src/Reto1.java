public class Reto1 {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan Angel ", 20, "juan.salas-g@mail.escuelaing.edu.co", 6);
        Estudiante e2 = new Estudiante("Sebastian Barrera", 21, "sebastian.barrera-m@mail.escuela.ing.edu.co", 6);
        Estudiante e3 = new Estudiante("Miguel", 20, "miguel.sandoval-l@mail.escuelaing.edu.co", 6);

        System.out.println(MensajeBienvenida.construir(e1, e2, e3));
    }
}
