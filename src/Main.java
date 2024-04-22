import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        ListinProfesores profes =new ListinProfesores();
        menu(profes);
    }

    public static void menu(ListinProfesores profes)
    {
        profes.cargarProfesores();
        int opcion;
        Scanner entrada=new Scanner(System.in);
        do {
            String cadena = """
                Bienvenido al menu
                \t[1]Ver listado de profesores 
                \t[2]Ver profesores titulares
                \t[3]Ver profesores interinos
                \t[4]Sueldo total profesores
                \t[0]Salir
                """;
            System.out.println(cadena);
          opcion =entrada.nextInt();
            switch (opcion)
            {
                case 1: {
                    System.out.println(profes.mostrarProfesores());
                    break;
                }
                case 2:
                {
                    System.out.println(profes.mostrarTitulares());
                    break;
                }
                case 3:
                {
                    System.out.println(profes.mostrarInterinos());
                    break;
                }
                case 4:
                {
                    System.out.println("La suma de todos los sueldos de los profesores es : "+ profes.importeTotalNominaProfesorado());
                    break;
                }
                case 0:{
                    break;
                }
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion!=0);

    }
}
