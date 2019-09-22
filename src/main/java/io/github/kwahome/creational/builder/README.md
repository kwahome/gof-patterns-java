## Builder Pattern
The builder pattern is similar to the other creational patterns, such as factory method and abstract factory as its
concerned with the creation of objects.

As the name implies, it is an alternative way to construct complex objects. It should be used only when you want to
build different immutable objects using same object building process.

It separates the construction of a complex object from its representation so that the same construction process can
create different representations.

## Problem
An application needs to create the elements of a complex aggregate. The specification for the aggregate exists on 
secondary storage and one of many representations needs to be built in primary storage.

## Participants
- Concrete classes whose immutable instances need to be created e.g. `Person` in the example
- Builder class abstracting creation of instances

## When Would I Use This Pattern?
The Prototype pattern should be considered when:
- Constructing a complex object step by step
- There's need to build a Composite

## Benefits and Advantages of Builder Pattern
Builder pattern also helps minimizing the number of parameters in constructor and thus there is no need to pass in null
for optional parameters to the constructor.

Another advantage is that Object is always instantiated in a complete state rather than sitting in an incomplete state 
until the developer calls (if ever calls) the appropriate “setter” method to set additional fields.

And finally you can build immutable objects without much complex logic in object building process.

## Existing implementations in JDK
All implementations of `java.lang.Appendable` are in fact good examples of the use of Builder pattern in java. e.g.

`java.lang.StringBuilder#append()` [Unsynchronized class]

`java.lang.StringBuffer#append()` [Synchronized class]

`java.nio.ByteBuffer#put()` (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)

Another use can be found in `javax.swing.GroupLayout.Group#addComponent()`





