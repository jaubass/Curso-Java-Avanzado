package PatronesComportamiento.PatronIterator;

public interface DeviceIterator {

    boolean haveMore();

    void restart();

    Device next();

}
