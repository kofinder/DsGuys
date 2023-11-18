package design_patterns.adaptor;

interface GermanPlugConnector {
    void giveElectricity();
}

class GermanElectricalSocket {
    void plugIn(GermanPlugConnector plug) {
        plug.giveElectricity();
    }
}

interface UKPlugConnector {
    void provideElectricity();
}

class UKElectricalSocket {

    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}

class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

    private GermanPlugConnector plug;

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }

}

public class ElectricalDeviceAdoptionDemo {
    public static void main(String[] args) {
        GermanPlugConnector plugConnector = new GermanPlugConnector() {
            @Override
            public void giveElectricity() {
                System.out.println("Wow, You got there!");
            }
        };
        UKElectricalSocket electricalSocket = new UKElectricalSocket();
        UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plugConnector);
        electricalSocket.plugIn(ukAdapter);

    }
}
