package PatronesDiseño.Singelton;

public class Main {

    public static void main(String []args) {
        System.out.println("Instacio por primera vez el objeto");
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Valor: " + singleton.getContador() + ", posicion en memoria: " + singleton);
        System.out.println("Valor: " + singleton2.getContador() + ", posicion en memoria: " + singleton2);

        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();

        app.Run();
        app2.Run();

    }


}
