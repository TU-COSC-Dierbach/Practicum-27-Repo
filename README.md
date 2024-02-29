# Instructions  

## PRACTICUM 27 - Using the instanceof Operator (3 pts.)<br>

### BACKGROUND

**The instanceof Operator in Java**<br>
Java provides an operator called `instanceof` that lets one determine
what type a given object is during program execution.  
In this practicum, we declare a variable
of type Object. The variable, therefore, can be assigned to any object
of any type (since all objects inherit from the Object class, and thuis
all objects are of type Object). A random number generator is then used
to randomly assign the variable either an object of type Dishwasher, Toaster or Oven.

Example use of the `instanceof` operator is given below,

```
// to determine if the object assigned to var1 is of type String

if(var1 instanceof String)
  System.out.println("var1 contains a String type");
```

### WHAT TO DO<br>
Complete the implementation of the main program so that it describes
the type of object that is randomly generated, e.g.,

Dishwasher  Model Number 1243023
