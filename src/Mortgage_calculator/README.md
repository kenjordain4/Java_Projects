# Mortgage Calculator (Java)

A console Java program that calculates the monthly payment of a mortgage and prints the remaining balance after each payment.

## Classes

- `Mortgage_Calculator`: main class. Asks the user for the inputs, then prints the results.
- `Mortgage_Console`: reads numbers from the user and validates that they are within an allowed range.
- `Mortgage_Calculations`: contains the math (monthly payment and remaining balance).
- `Mortgage_Report`: prints the monthly payment and the payment schedule in currency format.

## Inputs

| Input | Allowed values |
|-------|----------------|
| Principal (loan amount) | 1,000 to 1,000,000 |
| Annual interest rate (%) | 0 to 30 |
| Years | 1 to 30 |

If the value is invalid or out of range, the program asks again.

## How it works

The monthly payment uses the standard mortgage formula:

```
M = P * [ r(1 + r)^n ] / [ (1 + r)^n - 1 ]
```

- `P` is the principal.
- `r` is the monthly interest rate (annual rate / 100 / 12).
- `n` is the number of payments (years x 12).

If the interest rate is 0, the payment is simply the principal divided by the number of payments. The remaining balance after each payment is calculated with a similar formula, so the schedule shows how the loan decreases month by month.

## Example

```
Principal: 100000
Annual Interest Rate: 3.92
Years: 30

MORTGAGE
--------
Monthly Payment: $472.81

PAYMENT SCHEDULE
----------------
$99,853.19
$99,705.69
...
$0.00
```

## How to run

1. Open the project in an IDE such as IntelliJ IDEA.
2. Run the `main` method in `Mortgage_Calculator`.

Or from the terminal, in the `src` folder (the one that contains the `Mortgage_calculator` package):

```
javac Mortgage_calculator/*.java
java Mortgage_calculator.Mortgage_Calculator
```

## Concepts practiced

- Separating a program into classes with a single job each (input, calculation, output)
- Input validation with `Scanner`
- Formatting currency with `NumberFormat`
- Math with `Math.pow` and arrays
- Packages and multiple classes
