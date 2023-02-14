package PatronesDiseño.Singelton;

/** SINGLETON
 * El patron Singleton nos permite crear una única instancia de una clase al llamarla multiples veces.
 */

public class Singleton {
    private static Singleton singleton;
    int contador;

    private Singleton() {}

    /**
     *
     * @return nos devuelve un objeto singleton, si ya esta creado nos devuelve el mismo y si no lo crea,
     * pero sólo se creará una instancia del mismo en el uso de la aplicación.
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
