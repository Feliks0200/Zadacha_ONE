import java.util.LinkedList;
import java.util.List;

public class Worker implements Mechanic, Runnable {
    private String name;
    private LinkedList<Vehicle> queue;
    private List<Vehicle> repaired;

    public Worker(String name, LinkedList<Vehicle> queue, List<Vehicle> repaired) {
        this.name = name;
        this.queue = queue;
        this.repaired = repaired;
    }

    @Override
    public String getSpecialization() {
        return name;
    }

    @Override
    public void run() {
        while (true) {
            Vehicle vehicle;
            synchronized (queue) {
                if (queue.isEmpty()) {
                    break;
                }
                vehicle = queue.poll();
            }

            vehicle.diagnose();
            vehicle.repair();

            synchronized (repaired) {
                repaired.add(vehicle);
            }
        }
    }
}