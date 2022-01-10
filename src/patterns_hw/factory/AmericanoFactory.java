package patterns_hw.factory;

public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee getCoffee() {
        return new Americano();
    }
}
