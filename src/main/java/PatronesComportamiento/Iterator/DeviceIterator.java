package PatronesComportamiento.Iterator;

public interface DeviceIterator {

    boolean haveMore();

    void restart();

    Device next();

}
