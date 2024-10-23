interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle {
    private int gear, speed;

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bicycle gear: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed: " + speed + " km/h");
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bicycle speed: " + speed + " km/h");
    }
}

class Bike implements Vehicle {
    private int gear, speed;

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bike gear: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed: " + speed + " km/h");
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bike speed: " + speed + " km/h");
    }
}

class Car implements Vehicle {
    private int gear, speed;

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car gear: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed: " + speed + " km/h");
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Car speed: " + speed + " km/h");
    }
}

public class VehicleInterface {
    public static void main(String[] args) {
        Vehicle bike = new Bicycle();
        bike.changeGear(2);
        bike.speedUp(15);
        bike.applyBrakes(5);

        Vehicle car = new Car();
        car.changeGear(4);
        car.speedUp(60);
        car.applyBrakes(20);
    }
}
