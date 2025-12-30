package ex_21052024_Abstraction.abstractkeyword.CarEX;

public class Car extends Engine{
    @Override
    void start() {
        System.out.println("Start the car");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void partGearBox() {
        System.out.println("Assemble the GearBox");
    }
}
