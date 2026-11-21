    }
}


// ================= MAIN =================
public class Codechef {

    public static void main(String[] args) {

        DeliveryService service = new DeliveryService();

        DeliveryPartner bike = new BikePartner();

        DeliveryPartner truck = new TruckPartner();

        DeliveryPartner drone = new DronePartner();

        service.processDelivery(bike, "Mobile Phone");

        service.processDelivery(truck, "Washing Machine");

        service.processDelivery(drone, "Medicine Box");
    }
}