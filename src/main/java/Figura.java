public abstract class Figura implements Dibujable, Comparable<Figura>{

    // Atributos
    private int id;
    private String borde;
    private String relleno;
    private Punto origen;

    //Constructor
    public Figura(int id, String borde, String relleno, Punto origen) {
        this.id = id;
        this.borde = borde;
        this.relleno = relleno;
        this.origen = origen;
    }

    //Metodos
    abstract double area();

    abstract double perimetro();

    public double distancia(Figura f) {
        return Math.sqrt(Math.pow(f.origen.getX() - this.origen.getX(), 2) + Math.pow(f.origen.getY() - this.origen.getY(), 2));
    }

    abstract void escalar(int porcentaje);

    public void mover(Punto p){
        this.setOrigen(p);
    }

    public void desplazarh(double x){
        this.setOrigen(new Punto((x+this.getOrigen().getX()), origen.getY()));
    }

    public void desplazarv(double y){
        this.setOrigen(new Punto(origen.getX(),y+this.getOrigen().getY()));
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorde() {
        return borde;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    @Override
    public int compareTo(Figura figura) {
        return (int) (this.area()-figura.area());
    }

    public int compareToPerimetro(Figura figura) {
        return (int) (this.perimetro()-figura.perimetro());
    }

    public int compareToDistancia(Figura figura) {
        return (int) (this.distancia(figura)-figura.distancia(this));
    }

}
