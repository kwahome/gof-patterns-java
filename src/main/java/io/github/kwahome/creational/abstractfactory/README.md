## Abstract Factory Pattern
Also known as Kit, the abstract factory pattern is a creational design pattern that provides an interface for creating
families of related or dependent objects without specifying their concrete classes.

It provides a hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".

## Structure
![](../../../../../../../../docs/img/abstract-factory-pattern.png)

## Problem
If an application is to be portable, it needs to encapsulate platform dependencies. 
These "platforms" might include: windowing system, operating system, database, etc. Too often, this encapsulation is not
engineered in advance, and lots of #ifdef case statements with options for all currently supported platforms begin to 
procreate like rabbits throughout the code.

## Participants
- `Abstract Products`: declare interfaces for a set of distinct but related products which make up a product family.
- `Concrete Products`: are various implementations of abstract products, grouped by variants. Each abstract product 
(chair/sofa) must be implemented in all given variants (Victorian/Modern).
- `Abstract Factory`: an interface that declares a set of methods for creating each of the abstract products.
- `Concrete Factories`:  implement creation methods of the abstract factory. Each concrete factory corresponds to a 
specific variant of products and creates only those product variants.

## Abstract Factory Pattern vs Factory Method Pattern
It is easy to confuse the abstract factory pattern with the factory method pattern because both design patterns deal 
with object creation. Both the patterns advocates the Object Oriented Programming (OOP) principle “Program to an 
interface, not an implementation” to abstract how the objects are created. Both design patterns help in creating 
client code that is loosely-coupled with object creation code, but despite the similarities, and the fact that both the 
patterns are often used together, they do have distinct differences.

Abstract factory adds another level of abstraction to factory method. While factory method abstracts the way objects are
created, abstract factory abstracts how the factories are created. The factories in turn abstracts the way objects are 
created. You will often hear the abstract factory design pattern referred to as a “factory of factories“.

From implementation point of view, the key difference between the factory method and abstract factory patterns is that 
factory method is just a method to create objects of a single type, while abstract factory is an object to create 
families of objects.

Another difference is that the factory method pattern uses inheritance while the abstract factory pattern uses 
composition. We say that that factory method uses inheritance because this pattern relies on a subclass for the required
object instantiation. 

## When to use this pattern
- The client is independent of how we create and compose the objects in the system
- The system consists of multiple families of objects, and these families are designed to be used together
- We need a run-time value to construct a particular dependency
While the pattern is great when creating predefined objects, adding the new ones might be challenging. To support the 
new type of objects will require changing the AbstractFactory class and all of its subclasses.


