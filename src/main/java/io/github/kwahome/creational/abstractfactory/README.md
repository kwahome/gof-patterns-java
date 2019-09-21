## Abstract Factory Pattern
Also known as Kit, the abstract factory pattern is a creational design pattern used to create families of objects where
 the objects of a
family are designed to work together.

In the abstract factory pattern you provide an interface to create families of related or dependent objects, but you do 
not specify the concrete classes of the objects to create. From the client point of view, it means that a client can 
create a family of related objects without knowing about the object definitions and their concrete class names.

It is easy to confuse the abstract factory pattern with the factory method pattern because both design patterns deal 
with object creation. Both the patterns advocates the Object Oriented Programming (OOP) principle “Program to an 
interface, not an implementation” to abstract how the objects are created. Both design patterns help in creating 
client code that is loosely-coupled with object creation code, but despite the similarities, and the fact that both the 
patterns are often used together, they do have distinct differences.

## Abstract Factory Pattern vs Factory Method Pattern
Abstract factory adds another level of abstraction to factory method. While factory method abstracts the way objects are
created, abstract factory abstracts how the factories are created. The factories in turn abstracts the way objects are 
created. You will often hear the abstract factory design pattern referred to as a “factory of factories“.

From implementation point of view, the key difference between the factory method and abstract factory patterns is that 
factory method is just a method to create objects of a single type, while abstract factory is an object to create 
families of objects.

Another difference is that the factory method pattern uses inheritance while the abstract factory pattern uses 
composition. We say that that factory method uses inheritance because this pattern relies on a subclass for the required
object instantiation. 

## Participants in the Abstract Factory Pattern
i) Interfaces or an abstract class whose subclasses are instantiated by the abstract factory objects.

ii) Concrete subclasses that implement/extend the interfaces or abstract classes in (i)

iii) AbstractFactory - an interface or an abstract class whose subclasses instantiate a family of classes
 implementing/extending (i)

iv) Concrete subclasses that implement.extend the AbstractFactory. An object of this subclass instantiates a 
family of a family of classes implementing/extending (i).

v) Client - uses AbstractFactory to get concrete objects

## When to Use Abstract Factory Pattern:
- The client is independent of how we create and compose the objects in the system
- The system consists of multiple families of objects, and these families are designed to be used together
- We need a run-time value to construct a particular dependency
While the pattern is great when creating predefined objects, adding the new ones might be challenging. To support the 
new type of objects will require changing the AbstractFactory class and all of its subclasses.


