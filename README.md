# Basic Principle
It provides a powerful way of managing the complexity of software.

## Don't Repeat Yourself (DRY)
A basic strategy for reducing complexity to managable units is to divide a system into pieces.

The DRY principle is stated as, "Every piece of knowledge or logic must have a single, unambiguous representation within a system."

Rules:
- Make a visual hierarchy of your software application and map the main components to it.
- Switch to UML diagrams if at a level of responsibilities.
- Name its hierarchy in project, define what it's representing, and be sure know its role in the surrounding component.
- Define what the representation should expose to other parties (like functions to execute SQL in a database driver)
 and what is should hide (like the database credentials).
- Ensure the representations do not rely on representations of another complexity level

## Keep it Simple Stupid (KISS)
The simplest explanation tends to be the right one. The KISS principle is descriptive to keep the code simple and clear,
making it easy to understand.
Each method should only solve one small problem, not many use cases. Break into smaller methods will help find bugs a lot faster.

## SOLID
S - Single Responsibility Principle (SRP)
O - Open/Closed Principle
L - Liskov's Subsitution Principle
I - Interface Segregation Principle
D - Dependency Inversion Principle

##### S - Single Responsibility Principle (SRP)
A class should only have one responsibility. Furthermore, it should only have one reason to change.
Benefits of this principle:
1. Testing - A class with one responsibility will have far fewer test cases.
2. Lower coupling - Less functionality in a single class will have fewer dependencies.
3. Organization - Smaller, well-organized classes are easier to search than monolitic ones.

##### O - Open Closed Principle
Software components should be open for extension, but closed for modification. It means that our classes should be designed such a way
that whenever fellow developers to change the flow of control in specific conditions in app, all they need to extend our class
and override some functions.

##### L - Liskov's Substitution Principle
Derived types must be completely substitutable for their base types. It means that the classes fellow developer created by extending our class
should be able to fit in application without failure. This requires the objects of your subclasses to behave in the same way as the objects of
your superclass.

##### I - Interface Segregation Principle
Clients should not be forced to implement unnecessary methods which they will not use. It means that larger interfaces should be split into smaller
ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

##### D - Dependency Inversion Principle
Depend on abstraction, not on concretions. It refers to the decoupling of software modules. This way, instead of high-level modules depending on
low-level modules, both will depend on abstractions. It means that we should be having object of interface which helps us to communicate with the
concrete classes.
