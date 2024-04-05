package ejercicio1;
import java.util.Scanner;
public class main {


        public static void main(String[] args) {
            Registro_de_notas registro = new Registro_de_notas();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Registrar nota");
                System.out.println("2. Mostrar personas");
                System.out.println("3. Mostrar notas por persona");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la persona: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido de la persona: ");
                        String apellido = scanner.nextLine();
                        persona persona = new persona(nombre, apellido);

                        System.out.print("Nombre de la materia: ");
                        String materiaNombre = scanner.nextLine();
                        Materia materia = new Materia(materiaNombre);

                        System.out.print("Nota: ");
                        double nota = scanner.nextDouble();
                        registro.registrarNota(persona, materia, nota);
                        break;
                    case 2:
                        registro.mostrarPersonas();
                        break;
                    case 3:
                        System.out.print("Nombre de la persona: ");
                        String nombrePersona = scanner.nextLine();
                        persona personaBuscada = new persona(nombrePersona, "perez"); // Asumiendo que solo se busca por nombre
                        registro.mostrarNotasPorPersona(personaBuscada);
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opción invalida Intente de nuevo.");
                }
            }
        }
    }

