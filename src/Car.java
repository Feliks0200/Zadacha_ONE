public class Car extends Vehicle {
    public String brand;
    public String Model;

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void repair() {
        System.out.println("Ремонт автомобиля " + getBrand() + " " + getModel());
    }
}