# LibertyWalk-Java

## Overview

LibertyWalk-Java is a system model for a garage specializing in JDM (Japanese Domestic Market) cars. The system manages detailed information about cars, their components, modifications, and other related aspects. It has been designed to reflect the complex interactions and relationships between classes using object-oriented concepts such as composition, association, inheritance, and aggregation.

---

## Class Responsibilities

### Car
- **Attributes**:
    - `model`: The car's model.
    - `manufacturer`: The car's manufacturer.
    - `year`: The car's manufacture year.
    - `engine`: The car's engine (instance of the `Engine` class).
    - `modifications`: A list of modifications applied to the car (instances of the `Modification` class).
    - `carParts`: A list of parts for the car (instances of the `CarPart` class).

- **Methods**:
    - `addMod(Modification mod)`: Adds a modification to the car.
    - `removeMod(Modification mod)`: Removes a modification from the car.
    - `getDescription()`: Returns a detailed description of the car.

### Engine
- **Attributes**:
    - `type`: Type of the engine (e.g., Turbo, NA).
    - `power`: Power of the engine (e.g., 350 HP).

- **Methods**:
    - `getDescription()`: Returns a detailed description of the engine.

### CarPart
- **Attributes**:
    - `name`: Name of the part (e.g., Suspension, Wheels).
    - `type`: Type of the part (e.g., Aesthetic, Performance).
    - `originality`: Indicates whether the part is original or modified.

- **Methods**:
    - `getDescription()`: Returns a detailed description of the car part.

### Modification
- **Attributes**:
    - `type`: Type of modification (e.g., Aesthetic, Performance).
    - `details`: A detailed description of the modification.

- **Methods**:
    - `getDescription()`: Returns a detailed description of the modification.

### Garage
- **Attributes**:
    - `cars`: A list of cars stored in the garage (instances of the `Car` class).
    - `maxCapacity`: Maximum number of cars the garage can store.

- **Methods**:
    - `addCar(Car car)`: Adds a car to the garage.
    - `removeCar(Car car)`: Removes a car from the garage.
    - `listCars()`: Returns a list of the cars currently in the garage.

---

## Design Challenges and Relationships

### **Composition**
- A car must have an engine, which is an integral part of its identity. This implies that the `Car` class has a **composition** relationship with the `Engine` class, meaning the engine cannot exist without the car.

### **Association**
- A car can have many modifications, but a modification can be applied to several cars. This is an example of **association** between the `Car` and `Modification` classes.

### **Inheritance**
- You may create a `SportJDMCar` class that inherits from `Car` and adds specific features, such as paint type, spoilers, and other sports car modifications. This is an example of **inheritance** to create a more specialized model.

### **Aggregation**
- A garage can have many cars, but a car can exist independently of a garage. This is an example of **aggregation**, where the `Garage` class holds instances of the `Car` class, but cars can exist outside of the garage.
