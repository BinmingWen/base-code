package CazyTest;

abstract class Device {
    private String name;
    public abstract double getPrice();
    public Device(){}

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
