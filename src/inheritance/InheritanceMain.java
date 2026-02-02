package inheritance;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class InheritanceMain {

    public static void main(String[] args) {
        Car car = new Car();

        // upcast to Vehicle
        Vehicle vehicle = new Car();
        Vehicle anotherVehicle = car;

        //downcast to Car
        Car anotherCar = (Car) vehicle;

        boolean isCar = car instanceof Car;
        boolean isCar2 = car instanceof Vehicle;
        boolean isVehicle = vehicle instanceof Car;

        System.out.println(isCar); // true
        System.out.println(isCar2); //true
        System.out.println(isVehicle); //true

        Truck truck = new Truck();

        truck.setLicencePlate("123");
        truck.updateLicencePlate("abc");

        System.out.println("Licence Plate : " + truck.getLicencePlate());
    }
}
