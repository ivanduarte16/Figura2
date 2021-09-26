import java.util.ArrayList;
import java.util.Collections;

public class Lienzo {

    private static ArrayList<Figura> figuras = new ArrayList<>();

    public static void Aleatorio(){
        String[] colores = {"rojo", "amarillo", "verde", "azul", "blanco", "negro"};
        for (int i = 0; i < 10; i++) {
            switch ((int) Math.random()*3){
                case 0:
                    Cuadrado cua = new Cuadrado(i, colores[(int) (Math.random()*6)],colores[(int) (Math.random()*6)],new Punto(Math.random()*10,Math.random()*10), (int) (Math.random()*10));
                    figuras.add(cua);
                    break;
                case 1:
                    Rectangulo rec = new Rectangulo(i, colores[(int) (Math.random()*6)],colores[(int) (Math.random()*6)],new Punto(Math.random()*10,Math.random()*10), (int) (Math.random()*10),(int) (Math.random()*10));
                    figuras.add(rec);
                    break;
                case 2:
                    Triangulo tria = new Triangulo(i, colores[(int) (Math.random()*6)],colores[(int) (Math.random()*6)],new Punto(Math.random()*10,Math.random()*10), (int) (Math.random()*10),(int) (Math.random()*10));
                    figuras.add(tria);
                    break;
                case 3:
                    Circulo cir = new Circulo(i, colores[(int) (Math.random()*6)],colores[(int) (Math.random()*6)],new Punto(Math.random()*10,Math.random()*10), (int) (Math.random()*10));
                    figuras.add(cir);
            }
        }
    }

    public static void dibujar() {
        for (Figura f : figuras) {
            f.dibujar();
        }
    }

    public static void area() {
        for (Figura f : figuras) {
            f.area();
        }
    }

    public static void perimetro() {
        for (Figura f : figuras) {
            f.perimetro();
        }
    }

    public static void distancia(int id) {
        Figura fig = buscarID(id);
        for (Figura f : figuras) {
            f.dibujar();
        }
    }

    public static void listar() {
        for (Figura f : figuras) {
            System.out.println(f);
        }
    }

    public static void escalar(int id, int porcentaje) {
        Figura fig = buscarID(id);
        fig.escalar(porcentaje);
    }

    public static void mover(int id, Punto p) {
        Figura fig = buscarID(id);
        fig.mover(p);
    }

    public static void desplazarh(int id, int x) {
        Figura fig = buscarID(id);
        fig.desplazarh(x);
    }

    public static void desplazarv(int id, int y) {
        Figura fig = buscarID(id);
        fig.desplazarv(y);
    }

    public static Figura buscarID(int id) {
        for (Figura i : figuras) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static void Orden() {
        System.out.println("Porque criterio quieres ordenar?");
        System.out.println();
        System.out.println("1. Area");
        System.out.println("2. Perimetro");
        System.out.println("3. Posicion");
        int respuestaOrdenar = Leer.leerEntero("Elige la opcion: ");
        ClearConsole();
        switch (respuestaOrdenar) {
            case 1:
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int repu = Leer.leerEntero("Elige una opcion: ");
                ClearConsole();
                switch (repu) {
                    case 1:
                        Collections.sort(figuras, Figura::compareTo);
                        break;
                    case 2:
                        Collections.sort(figuras, Figura::compareTo);
                        Collections.reverse(figuras);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        Lienzo.area();
                }
                break;
            case 2:
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int respu = Leer.leerEntero("Elige una opcion: ");
                ClearConsole();
                switch (respu) {
                    case 1:
                        Collections.sort(figuras,Figura::compareToPerimetro);
                        break;
                    case 2:
                        Collections.sort(figuras, Figura::compareToPerimetro);
                        Collections.reverse(figuras);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        Lienzo.perimetro();
                }
                break;
            case 3:
                System.out.println("1. Ascendente");
                System.out.println("2. Descendente");
                int rep = Leer.leerEntero("Elige una opcion: ");
                ClearConsole();
                switch (rep){
                    case 1:
                        Collections.sort(figuras, Figura::compareToDistancia);
                        break;
                    case 2:
                        Collections.sort(figuras, Figura::compareToDistancia);
                        Collections.reverse(figuras);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
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
