## Factory Method Pattern
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but 
allows subclasses to alter the type of objects that will be created.

The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with 
calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being 
called from within the factory method. Objects returned by a factory method are often referred to as “products.”

Factory Method lets a class defer instantiation to subclasses.

## Problem
A framework needs to standardize the architectural model for a range of applications, but allow for individual 
applications to define their own domain objects and provide for their instantiation.

## When to use factory pattern?
Factory pattern introduces loose coupling between classes which is the most important principle one should consider and 
apply while designing the application architecture. 

Loose coupling can be introduced in application architecture by programming against abstract entities rather than 
concrete implementations. This not only makes our architecture more flexible but also less fragile.

## Benefits of factory pattern
- The creation of an object precludes its reuse without significant duplication of code.
- The creation of an object requires access to information or resources that should not be contained within the
 composing class.
- The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the
 application.
