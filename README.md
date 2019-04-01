# DesignPattern
Introduce some design pattern in Java language

The duck package hierarchy.

**Duck**: abstract class, the parent class for MallardDuck and ModelDuck

**FlyBehaviour**: interface.Child has to implement fly() method.

**QuackBehaviour**: interface. Child has to implement quack() method.

*Duck has-a relationship to FlyBehaviour and QuackBehavior*

**Classes which implements interfaces**: FlyNoWay, FlyWithWings, FlyRocketPowered, Quack, Squeak, MuteQuack

**Program enter point** (include main method): MiniDuckSimulator

![alt text](https://github.com/SzilvasiPeter/DesignPattern/blob/master/src/duck/DuckHierarchy.png)
