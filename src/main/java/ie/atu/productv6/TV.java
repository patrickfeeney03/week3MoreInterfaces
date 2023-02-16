package ie.atu.productv6;

public class TV extends Product {

    private Integer screenSize;
    private String manufacture;

    public TV() {
        super();
        screenSize = 0;
        manufacture = "";
        count++;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " \nScreen Size " + screenSize + "\"" +
                "\nManufacturer: " + manufacture;
    }
}
