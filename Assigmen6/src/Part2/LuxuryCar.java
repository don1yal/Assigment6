package Part2;

public class LuxuryCar extends DecoratorCar{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void create() {
        super.create();
        System.out.println(" Features of luxury");
    }

}
