package SOLID;

public class CocheHibrido extends Coche {
    String autonomia;
    public CocheHibrido(String marca, String modelo, String autonomia) {
        super(marca, modelo);
        this.autonomia = autonomia;
    }
}
