import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Vehicle> queue = new LinkedList<>();
        List<Vehicle> repaired = new ArrayList<>();

        queue.add(new Car("abobich", "Camry"));
        queue.add(new Car("BMW", "X5"));
        queue.add(new Motorcycle("Honda", "x67"));
        queue.add(new Truck("Volvo", "govno"));
        queue.add(new Car("Audi", "3and5"));
        queue.add(new Motorcycle("Yamaha", "ahamaY"));
        queue.add(new Truck("MAN", "Nu_Prosto_myjhina"));

        Thread mechanic1 = new Thread(new Worker("Механик Иван", queue, repaired));
        Thread mechanic2 = new Thread(new Worker("Механик Пётр", queue, repaired));
        Thread mechanic3 = new Thread(new Worker("Механик Сергей", queue, repaired));

        mechanic1.start();
        mechanic2.start();
        mechanic3.start();

        mechanic1.join();
        mechanic2.join();
        mechanic3.join();

        System.out.println("Список отремонтированных транспортных средств");
        for (int i = 0; i < repaired.size(); i++) {
            System.out.println((i + 1) + ". " + repaired.get(i));
        }
        System.out.println("Всего отремонтировано: " + repaired.size());
    }
}