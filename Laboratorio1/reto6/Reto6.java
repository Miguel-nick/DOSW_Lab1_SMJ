import java.util.*;

public class Reto6 {
    // Método de Estudiante B con switch-case
    public static void ejecutarComando(String comando) {
        switch (comando.toUpperCase()) {
            case "BROMEAR":
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
                break;
            case "GRITAR":
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("La máquina susurra: Shhh… los bugs están dormidos");
                break;
            case "ANALIZAR":
                System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("Comando no reconocido: " + comando);
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("=== Comandos de Estudiante B ===");
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");
    }
}
