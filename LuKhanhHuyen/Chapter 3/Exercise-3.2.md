# Exercise 3.2
## Give a one-to-two paragraph explanation for how the inheritance hierarchy can affect controllability and observability.

Inheritance hierarchy use Object-oriented concepts and having a deep inheritance tree of classes could become more complex to test, because the sub classes are dependent of its father, that means, if we modify or update something in the super class, it will affect all its respective children, which means that every test affected by the modification have to be updated for the sub classes.

Thus, this affects controllability because we will need to control every super class and its sub classes, and if wee have a deep inheritance tree, it will be very complicated. On the other hand, it affects observability becase we need to observe a large number of sub classes that actually are doing the same work as the super class.