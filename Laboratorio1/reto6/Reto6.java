 import java.util.*;

public class Reto6 {
    
    public static void ejecutarComando(String comando) {
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("La máquina canta: 01010101");
                break;
            case "DANZAR":
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
                break;
            default:
                System.out.println("Comando no reconocido: " + comando);
                break;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Comandos de Estudiante A ===");
        ejecutarComando("SALUDAR");
        ejecutarComando("DESPEDIR");
        ejecutarComando("CANTAR");
        ejecutarComando("DANZAR");
    }
}