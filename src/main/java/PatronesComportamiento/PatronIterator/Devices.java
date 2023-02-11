package PatronesComportamiento.PatronIterator;

import java.util.ArrayList;

public class Devices implements DeviceIterator {

    private ArrayList<Device> devices = new ArrayList<>();
    private int index = 0;

    public void create (Device device) {
        devices.add(device);
    }


    @Override
    public Device next() {
        Device device = devices.get(index);
        index ++;
        return device;
    }

    @Override
    public boolean haveMore() {
        return index < devices.size();
    }

    @Override
    public void restart() {
        index = 0;

    }

}
