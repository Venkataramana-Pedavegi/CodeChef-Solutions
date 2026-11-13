# OOPSFUND02J

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Drone Fleet Energy Management

A drone delivery company operates a fleet of autonomous drones. Each drone has a unique ID and an available energy level.

The company needs an application to manage drone energy, execute delivery missions, simulate upgrades, and inspect deployment readiness.

Complete the provided Java classes and methods using Object-Oriented Programming concepts, including encapsulation, constructors, static members, and object creation.

The input/output handling code is already implemented and must not be modified.

### Tasks
### 1. Drone Class

The `Drone` class contains the following private fields:

- id: Unique identifier of the drone, of type int.
- energy: Current available energy, of type long.
- created: Static counter of type int tracking the number of Drone objects constructed.

Implement the following methods:

Method	Description
`Drone(int id, long initialEnergy)`	Initialize the drone and increment `created`.
`getId()`	Return the drone ID.
`getEnergy()`	Return its available energy.
`recharge(long amount)`	Increase the drone's energy by `amount`.
`executeMission(long cost)`	Deduct `cost` if sufficient energy exists and return `true`; otherwise return `false` without modifying energy.
`simulateUpgrade(long bonus)`	Create and return a new `Drone` object with the same ID and energy increased by `bonus`, leaving the original unchanged.
`getCreated()`	Return the total number of constructed `Drone` objects.

The `created` field must be shared by all `Drone` objects.

The static counter includes initial drones and objects created by `simulateUpgrade()`. Each successful call to `simulateUpgrade()` creates exactly one additional object.

The counter does not decrease when an object becomes unreachable or is garbage-collected.

### 2. FleetInspector Class

Implement the following static methods in the `FleetInspector` class.

- combinedEnergy(Drone a, Drone b) Return the sum of the energy levels of the two drones using their public getter methods. If both arguments reference the same drone, count its energy twice.
- canDeploy(Drone drone, long minimum) Return true if the drone's available energy is greater than or equal to minimum; otherwise return false. Access the drone's energy through its public getEnergy() method.
### Input Format

The first line contains two space-separated integers $N$ and $Q$, representing the number of initial drones and operations.

Each of the next $N$ lines contains two space-separated integers $id$ and $energy$.

Each of the following $Q$ lines contains one operation:

Operation	Required Output
`RECHARGE id amount`	Updated energy
`MISSION id cost`	Remaining energy or `LOW_ENERGY`
`UPGRADE id bonus`	Energy of the newly simulated drone
`PAIR id1 id2`	Combined energy
`INSPECT id minimum`	`READY` or `NOT_READY`
`GET id`	Current drone energy
`COUNT`	Number of constructed drone objects

All drone IDs referenced in operations are guaranteed to exist in the initial fleet.

An upgraded drone exists only for the `UPGRADE` operation and is not added to the original fleet. Its ID is the same as the original drone's ID.

### Output Format

For each of the $Q$ operations, print the result on a separate line:

- RECHARGE: Print the updated energy of the drone.
- MISSION: Print the remaining energy if the mission succeeds; otherwise print LOW_ENERGY.
- UPGRADE: Print the energy of the newly created simulated drone.
- PAIR: Print the combined energy of the two drones.
- INSPECT: Print READY if the drone has at least the required energy; otherwise print NOT_READY.
- GET: Print the current energy of the specified drone.
- COUNT: Print the total number of constructed Drone objects.
### Constraints
- $1 \le N \le 200$
- $1 \le Q \le 1000$
- $1 \le \text{id} \le 10^5$
- $1 \le \text{energy}, \text{amount}, \text{cost}, \text{bonus}, \text{minimum} \le 10^9$
### Sample 1:
Input
Output

```
2 11
101 80
202 30
COUNT
GET 101
MISSION 101 50
MISSION 202 40
RECHARGE 202 20
PAIR 101 202
INSPECT 101 30
UPGRADE 101 15
GET 101
COUNT
INSPECT 202 60
```

```
2
80
30
LOW_ENERGY
50
80
READY
45
30
3
NOT_READY
```

### Explanation:

Initially, two drones exist. Drone `101` completes a mission costing 50 energy, reducing its energy to 30. Drone `202` cannot complete a mission costing 40 because it has only 30 energy. Recharging it by 20 increases its energy to 50.

The combined energy is `30 + 50 = 80`. Simulating an upgrade of 15 for drone `101` creates a new object with energy 45, without changing the original drone. Therefore, `COUNT` becomes 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T14:16:43.263Z  

```java

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

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND02J)