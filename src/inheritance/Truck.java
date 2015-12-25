package inheritance;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class Truck extends Vehicle {
    protected String licencePlate = null;

    @Override
    public void setLicencePlate(String licencePlate) {
        super.licencePlate = licencePlate;
    }

    @Override
    public String getLicencePlate() {
        return super.getLicencePlate();
    }

    public void updateLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
