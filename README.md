# SOLID Principles Java Examples

This project demonstrates each of the five SOLID design principles in Java, including:

- A violation example that shows how the principle is broken
- A corrected version that follows the principle properly
- A report that addresses each principle and the fix with an explanation.


## Structure

Each subfolder contains two files:
- `XXXViolation.java`: Shows code that violates the SOLID principle
- `XXXFixed.java`: Shows the corrected version of the code

## Principles Covered

1. **Single Responsibility Principle (SRP)**
2. **Open/Closed Principle (OCP)**
3. **Liskov Substitution Principle (LSP)**
4. **Interface Segregation Principle (ISP)**
5. **Dependency Inversion Principle (DIP)**

## How to Run

Each `.java` file contains a `main` method with a simple demonstration. You can compile and run them like this:

```bash
javac 1_SingleResponsibility/SRPViolation.java
java 1_SingleResponsibility.SRPViolation
