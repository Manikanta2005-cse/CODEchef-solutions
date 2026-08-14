// Interface declaration
interface ElectronicDevice {
    void powerOn();
    void powerOff();
}

// Class Television implementing ElectronicDevice interface
class Television implements ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Television is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Television is OFF");
    }
}

// Class Smartphone implementing ElectronicDevice interface
class Smartphone implements ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Smartphone is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone is OFF");
    }
}

// Main class
class Codechef {
    public static void main(String[] args) {
        ElectronicDevice myTelevision = new Television();
        ElectronicDevice mySmartphone = new Smartphone();

        myTelevision.powerOn();
        myTelevision.powerOff();

        mySmartphone.powerOn();
        mySmartphone.powerOff();
    }
}