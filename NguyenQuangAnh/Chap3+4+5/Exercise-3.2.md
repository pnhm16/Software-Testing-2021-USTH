*__Question:__ How the inheritance hierarchy can affect
controllability and observability?*

*__Answer:__*
A complex inheritance tree of classes is very complex to test.
The sub classes actually depends on its parents, therefore, whenever a parent class is updated, the sub classes will be affected too. Because of this, it is not guaranteed that all the classes will work correctly. 
The controllability then will be very low, because developers have to control all the classes, which is very difficult for a complicated inheritance tree. The observability is also affected because developers have to observe a lot of sub classes which have the same functions as their parents.