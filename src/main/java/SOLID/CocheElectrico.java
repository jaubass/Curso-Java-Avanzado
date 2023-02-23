package SOLID;

public class CocheElectrico extends Coche {

    private String bateria;
    public CocheElectrico(String marca, String modelo, String bateria) {
        super(marca, modelo);
        this.bateria = bateria;
    }
}
