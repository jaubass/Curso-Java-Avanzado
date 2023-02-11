package PatronesComportamiento.Iterator;

public class Device {

    private String Maker;
    private String Model;
    private int year;
    private int capacity;
    private String software;

    private Device() {}

    public Device(String maker, String model, int year, int capacity, String software) {
        Maker = maker;
        Model = model;
        this.year = year;
        this.capacity = capacity;
        this.software = software;
    }

    public String getMaker() {
        return Maker;
    }

    public void setMaker(String maker) {
        Maker = maker;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }


}
