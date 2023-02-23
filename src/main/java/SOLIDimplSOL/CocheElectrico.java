package SOLIDimplSOL;

public class CocheElectrico extends Coche {

    private String bateria;
    public CocheElectrico(String marca, String modelo, String bateria) {
        super(marca, modelo);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "marca'" + getMarca() + '\'' + " " +
                "modelo'" + getModelo() + '\'' + " " +
                "bateria='" + bateria + '\'' + " " +
                '}';
    }
}
