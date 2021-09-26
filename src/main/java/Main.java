import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Boolean principal = true;
        Lienzo.Aleatorio();
        do {
            Boolean ordenacion = true;
            System.out.println("1. Listar");
            System.out.println("2. Dibujar");
            System.out.println("3. Perimetros");
            System.out.println("4. Areas");
            System.out.println("5. Escalar");
            System.out.println("6. Mover");
            System.out.println("7. Desplazar");
            System.out.println("8. Ordenar");
            System.out.println("9. Salir");
            System.out.println();
            int respuestaPrincipal = Leer.leerEntero("Elige la opcion: ");
            ClearConsole();
            switch (respuestaPrincipal){
                case 1:
                    System.out.println("Estas son las figuras: ");
                    System.out.println();
                    Lienzo.listar();
                    break;
                case 2:
                    System.out.println("Estas son las figuras: ");
                    System.out.println();
                    Lienzo.dibujar();
                    break;
                case 3:
                    System.out.println("Estos son los perimetros: ");
                    System.out.println();
                    Lienzo.perimetro();
                    break;
                case 4:
                    System.out.println("Estas son las areas: ");
                    System.out.println();
                    Lienzo.area();
                    break;
                case 5:
                    int id = Leer.leerEntero("Dime el id: ");
                    int porcentaje = Leer.leerEntero("Dime el porcentaje: ");
                    Lienzo.escalar(id, porcentaje);
                    break;
                case 6:
                    int idd = Leer.leerEntero("Dime el id: ");
                    Punto p = new Punto(Leer.leerDouble("Dime la posicion x: "), Leer.leerDouble("Dime la posicion y: "));
                    Lienzo.mover(idd, p);
                    break;
                case 7:
                    int codi = Leer.leerEntero("Dime el id: ");
                    int x = Leer.leerEntero("Dime cuanto deseas desplazar verticalmente: ");
                    int y = Leer.leerEntero("Dime cuanto deseas desplazar horizontalmente: ");
                    Lienzo.desplazarh(codi,y);
                    Lienzo.desplazarv(codi,x);
                    break;
                case 8:
                   Lienzo.Orden();
                    break;
                case 9:
                    principal = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (principal);
    }

    public static void ClearConsole() {
        try {
            String operatingSystem; //Check the current operating system
            operatingSystem = System.getProperty("os.name");

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
