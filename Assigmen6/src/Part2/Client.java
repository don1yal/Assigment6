package Part2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Create Basic car:");
        Car basicCar = new BaseCar();
        basicCar.create();

        System.out.println("\nCreate a sports car:");
        Car sportCar = new SportCar(new BaseCar());
        sportCar.create();

        System.out.println("\nCreate luxury sports car");
        Car sportsLuxuryCar = new LuxuryCar(new SportCar(new BaseCar()));
        sportsLuxuryCar.create();
    }
}
