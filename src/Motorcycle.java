public class Motorcycle extends Vehicle {
    public String brand;
    public String Model;

    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика мотоцикла " + getBrand() + " " + getModel());
    }

    @Override
    public void repair() {
        System.out.println("Ремонт мотоцикла " + getBrand() + " " + getModel());
    }
}