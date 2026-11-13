
import java.util.*;

class Drone {
    private int id;
    private long energy;
    private static int created = 0;

    public Drone(int id, long initialEnergy) {
        this.id = id;
        this.energy = initialEnergy;
        created++;
    }

    public int getId() {
        return this.id;
    }

    public long getEnergy() {
        return this.energy;
    }

    public void recharge(long amount) {
        this.energy += amount;
    }

    public boolean executeMission(long cost) {
        if (cost > this.energy) {
            return false;
        }

        this.energy -= cost;
        return true;
    }

    public Drone simulateUpgrade(long bonus) {
        return new Drone(this.id, this.energy + bonus);
    }

    public static int getCreated() {
        return created;
    }
}

class FleetInspector {

    public static boolean canDeploy(Drone drone, long minimum) {
        return drone.getEnergy() >= minimum;
    }

    public static long combinedEnergy(Drone a, Drone b) {
        return a.getEnergy() + b.getEnergy();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        Map<Integer, Drone> drones = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            long energy = sc.nextLong();
            drones.put(id, new Drone(id, energy));
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            String operation = sc.next();

            switch (operation) {
                case "RECHARGE": {
                    int id = sc.nextInt();
                    long amount = sc.nextLong();

                    Drone drone = drones.get(id);
                    drone.recharge(amount);
                    output.append(drone.getEnergy()).append('\n');
                    break;
                }

                case "MISSION": {
                    int id = sc.nextInt();
                    long cost = sc.nextLong();

                    Drone drone = drones.get(id);

                    if (drone.executeMission(cost)) {
                        output.append(drone.getEnergy());
                    } else {
                        output.append("LOW_ENERGY");
                    }

                    output.append('\n');
                    break;
                }

                case "UPGRADE": {
                    int id = sc.nextInt();
                    long bonus = sc.nextLong();

                    Drone upgraded = drones.get(id).simulateUpgrade(bonus);
                    output.append(upgraded.getEnergy()).append('\n');
                    break;
                }

                case "PAIR": {
                    int id1 = sc.nextInt();
                    int id2 = sc.nextInt();

                    output.append(
                        FleetInspector.combinedEnergy(
                            drones.get(id1), drones.get(id2)
                        )
                    ).append('\n');
                    break;
                }

                case "INSPECT": {
                    int id = sc.nextInt();
                    long minimum = sc.nextLong();

                    output.append(
                        FleetInspector.canDeploy(drones.get(id), minimum)
                            ? "READY" : "NOT_READY"
                    ).append('\n');
                    break;
                }

                case "GET": {
                    int id = sc.nextInt();
                    output.append(drones.get(id).getEnergy()).append('\n');
                    break;
                }

                case "COUNT": {
                    output.append(Drone.getCreated()).append('\n');
                    break;
                }
            }
        }

        System.out.print(output);
        sc.close();
    }
}
