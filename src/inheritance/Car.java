package inheritance;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class Car extends Vehicle {
    int noOfSeats = 0;

    public int getNoOfSeats() {
        return this.noOfSeats;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    @Override // annotation
    public void setLicencePlate(String licencePlate) {
        //super.setLicensePlate(license); // we can call it if needed
        this.licencePlate = licencePlate.toLowerCase();
    }

    public void updateLicencePlate(String licence) {
        super.setLicencePlate(licence); // it can also call form un-override method also
    }
}
