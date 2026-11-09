# Delivery System (Java)

A Java project that simulates a delivery service with three delivery methods (bike, truck, drone). Each method has its own pricing, and the program shows how to use interfaces and polymorphism in object-oriented programming.

## Classes

- `DeliveryMethod`: interface that defines `deliver()` and `calculatePrice()`, which every delivery method must implement.
- `BikeDelivery`, `TruckDelivery`, `DroneDelivery`: implement `DeliveryMethod`, each with its own delivery message and price calculation.
- `Shipment`: stores the client name, the client address, and the item to ship.
- `DeliveryService`: receives any `DeliveryMethod`, then delivers the shipment and calculates the price.
- `Main`: creates a shipment and runs the three delivery methods.

## Pricing

| Method | Base fee | Price per km | Bonus |
|--------|----------|--------------|-------|
| Bike | $2 | $1 | none |
| Truck | $5 | $5 | none |
| Drone | $7 | $3 | $30 |

Total price = base fee + (distance x price per km) + bonus (drone only).

For example, for a distance of 60 km: bike = $62, truck = $305, drone = $217.

## How it works

- `DeliveryService` depends on the `DeliveryMethod` interface, not on a specific class. It does not need to know which delivery method it is using, so a new method (for example, a boat) can be added without changing `DeliveryService` (polymorphism and dependency injection).
- The distance is passed to each delivery method when it is created.

## How to run

1. Open the project in an IDE such as IntelliJ IDEA.
2. Run the `main` method in `Main`.

Or from the terminal, in the `src` folder (the one that contains the `DeliverySystem` package):

```
javac DeliverySystem/*.java
java DeliverySystem.Main
```

## Concepts practiced

- Interfaces (`implements`)
- Polymorphism
- Dependency injection (passing a `DeliveryMethod` to `DeliveryService`)
- Encapsulation (private fields with getters in `Shipment`)
- Packages and multiple classes
