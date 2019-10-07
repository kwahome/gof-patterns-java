# Behavioural Design Patterns
Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.

# Patterns
### 1. Chain of Responsibility
![](../../../../../../../docs/img/chain-of-responsibility-pattern-overview.png)

### 2. Command
![](../../../../../../../docs/img/command-pattern-overview.png)

### 3. Iterator
![](../../../../../../../docs/img/iterator-pattern-overview.png)

### 4. Mediator
![](../../../../../../../docs/img/mediator-pattern-overview.png)

### 5. Memento
![](../../../../../../../docs/img/memento-pattern-overview.png)

### 6. Observer
![](../../../../../../../docs/img/observer-pattern-overview.png)

### 7. State
![](../../../../../../../docs/img/state-pattern-overview.png)

### 8. Strategy
![](../../../../../../../docs/img/strategy-pattern-overview.png)

### 9. Template Method
![](../../../../../../../docs/img/template-method-pattern-overview.png)

### 10. Visitor
![](../../../../../../../docs/img/visitor-pattern-overview.png)

## Rules of thumb
- Behavioral patterns are concerned with the assignment of responsibilities between objects, or, encapsulating
 behavior in an object and delegating requests to it.

- `Chain of responsibility`, `Command`, `Mediator`, and `Observer`, address how you can decouple senders and receivers, 
but with different trade-offs. Chain of responsibility passes a sender request along a chain of potential receivers.
Command normally specifies a sender-receiver connection with a subclass. Mediator has senders and receivers reference 
each other indirectly. Observer defines a very decoupled interface that allows for multiple receivers to be configured 
at run-time.

- `Chain of responsibility` can use `Command` to represent requests as objects.

- `Chain of responsibility` is often applied in conjunction with `Composite`. There, a component's parent can act as its
 successor.

- `Command` and `Memento` act as magic tokens to be passed around and invoked at a later time. In `Command`, the token
 represents a request; in `Memento`, it represents the internal state of an object at a particular time. 
 Polymorphism is important to `Command`, but not to `Memento` because its interface is so narrow that a memento can only 
 be passed as a value.

- `Command` can use `Memento` to maintain the state required for an undo operation.

- `MacroCommand`s can be implemented with `Composite`.

- A `Command` that must be copied before being placed on a history list acts as a `Prototype`.

- `Interpreter` can use `State` to define parsing contexts.

- The abstract syntax tree of `Interpreter` is a `Composite` (therefore `Iterator` and `Visitor` are also applicable).

- Terminal symbols within `Interpreter'`s abstract syntax tree can be shared with `Flyweight`.

- `Iterator` can traverse a `Composite`. `Visitor` can apply an operation over a `Composite`.

- Polymorphic `Iterators` rely on `Factory Methods` to instantiate the appropriate `Iterator` subclass.

- `Mediator` and `Observer` are competing patterns. The difference between them is that Observer distributes 
communication by introducing "observer" and "subject" objects, whereas a `Mediator` object encapsulates the
communication between other objects. We've found it easier to make reusable `Observers` and `Subjects` than to make 
reusable `Mediators`.

- On the other hand, `Mediator` can leverage `Observer` for dynamically registering colleagues and communicating with 
them.

- `Mediator` is similar to `Facade` in that it abstracts functionality of existing classes. 
`Mediator` abstracts/centralizes arbitrary communication between colleague objects, it routinely "adds value", and it
 is known/referenced by the colleague objects (i.e. it defines a multidirectional protocol). 
 In contrast, `Facade` defines a simpler interface to a subsystem, it doesn't add new functionality, and it is not known 
 by the subsystem classes (i.e. it defines a unidirectional protocol where it makes requests of the subsystem classes 
 but not vice versa).

- `Memento` is often used in conjunction with `Iterator`. An `Iterator` can use a `Memento` to capture the state of an
 iteration. The `Iterator` stores the `Memento` internally.

- State is like `Strategy` except in its intent.

- `Flyweight` explains when and how `State` objects can be shared.

- State objects are often `Singletons`.

- `Strategy` lets you change the guts of an object. `Decorator` lets you change the skin.

- `Strategy` is to algorithm. as `Builder` is to creation.

- `Strategy` has 2 different implementations, the first is similar to State. The difference is in binding times
 (`Strategy` is a bind-once pattern, whereas `State` is more dynamic).

- `Strategy` objects often make good `Flyweights`.

- `Strategy` is like `Template method` except in its granularity.

- `Template method` uses inheritance to vary part of an algorithm. 
`Strategy` uses delegation to vary the entire algorithm.

- The `Visitor` pattern is like a more powerful `Command` pattern because the visitor may initiate whatever is 
appropriate for the kind of object it encounters.
