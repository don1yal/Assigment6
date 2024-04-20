package Part2;

public class SportCar extends DecoratorCar {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void create() {
        super.create();
        System.out.println(" Features of Sport");
    }
}
