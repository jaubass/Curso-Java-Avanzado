package SOLIDimplSOL;

abstract class Coche {
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) { this.marca = marca; this.modelo = modelo; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
