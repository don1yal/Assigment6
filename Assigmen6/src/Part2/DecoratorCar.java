package Part2;

public class DecoratorCar  implements Car {

    protected Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    @Override
    public void create() {
        this.car.create();
    }


}
