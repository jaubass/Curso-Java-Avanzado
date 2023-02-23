package SOLID;

public class CocheCombustible extends Coche {
    String tipoCombustible;
    public CocheCombustible(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }
}
