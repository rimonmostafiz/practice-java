package inheritance;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class Vehicle {
    protected String licencePlate = null;

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }
}
