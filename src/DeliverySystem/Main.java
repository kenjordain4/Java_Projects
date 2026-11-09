package DeliverySystem;

public class
Main {
    public static void main(String[] args) {
        var ship= new Shipment("Johnny Smith","123 Main Street","MacBook Pro");
        var truck =new TruckDelivery(ship,60);
        var bike=new BikeDelivery(ship,60);
        var drone=new DroneDelivery(ship,60);

        var service1=new DeliveryService(bike);
        var service2=new DeliveryService(drone);
        var service3= new DeliveryService(truck);

        service1.SendDelivery();
        service2.SendDelivery();
        service3.SendDelivery();

    }
}
