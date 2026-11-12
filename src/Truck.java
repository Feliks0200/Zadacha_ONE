public class Truck extends Vehicle {
    public String brand;
    public String Model;

    public Truck(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика грузовика " + getBrand() + " " + getModel());
    }

    @Override
    public void repair() {
        System.out.println("Ремонт грузовика " + getBrand() + " " + getModel());
    }
}