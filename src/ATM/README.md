# Payment System (Java)

A Java project that simulates different payment methods (credit card, PayPal, crypto) and shows how to use inheritance, interfaces, and polymorphism in object-oriented programming.

## Classes

- `Payment`: base class with a `pay()` method and an empty `render()` method that subclasses override.
- `PaymentService`: interface that defines the `pay()` method every payment method must implement.
- `CreditCardPayment`: extends `Payment` and implements `PaymentService`. Pays by credit card and validates the card.
- `PaypalPayment`: extends `Payment` and implements `PaymentService`. Pays with PayPal and sends a receipt.
- `CryptoPayment`: extends `Payment` and implements `PaymentService`. Pays with crypto and verifies the blockchain.
- `OrderService`: processes an order using any object that implements `PaymentService`.
- `Atm_main`: main class that creates the different payments and runs them.

## How it works

- Each payment type overrides `render()` to do its own action (validate the card, send a receipt, or pay with crypto). The `Process(Payment payment)` method in the main class accepts any `Payment`, so the right version of `render()` runs depending on the object (polymorphism).
- `OrderService` receives a `PaymentService` in its constructor and calls `pay()`. It does not need to know which payment method is used, so new methods can be added without changing it (dependency injection).

## How to run

1. Open the project in an IDE such as IntelliJ IDEA.
2. Run the `main` method in `Atm_main`.

Or from the terminal, in the folder that contains the `ATM` package:

```
javac ATM/*.java
java ATM.Atm_main
```

## Concepts practiced

- Inheritance (`extends`)
- Interfaces (`implements`)
- Polymorphism and method overriding (`@Override`)
- Dependency injection (passing a `PaymentService` to `OrderService`)
- Packages and multiple classes
