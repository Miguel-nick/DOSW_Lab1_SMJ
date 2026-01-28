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
        System.out.println("=== Máquina de Decisiones - Todos los Comandos ===\n");
        
        // Comandos de Estudiante A
        ejecutarComando("SALUDAR");
        ejecutarComando("DESPEDIR");
        ejecutarComando("CANTAR");
        ejecutarComando("DANZAR");
        
        System.out.println(); 
        
        // Comandos de Estudiante B
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");
    }
}
