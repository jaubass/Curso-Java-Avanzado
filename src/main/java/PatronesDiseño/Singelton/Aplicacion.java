package PatronesDiseño.Singelton;

public class Aplicacion {
    public static Aplicacion aplicacion;
    boolean isRunnig = false;

    private Aplicacion() {}

    public static Aplicacion getInstance() {
        if (aplicacion == null) {
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    public void Run() {
        if (!isRunnig) {
            isRunnig = true;
        } else {
            System.out.println("La aplicacion ya esta en ejecucion");
        }
    }
}
