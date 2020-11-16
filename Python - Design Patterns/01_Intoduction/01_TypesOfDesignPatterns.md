(Source: LinkedIn Learning Course of Python - Design Patterns)

## Types of Design Patterns

There are 3 types of design patterns:

1. Creational Patterns: 
    - Definition: 
        - To create objects systematically. 
    - Benefits:
        - Flexibility. 
            e.g. different object subtypes from the same class at runtime.
    - Object-Oriented Technique:
        - Polymorphism.
        - Interfaces.

2. Structural Patterns:
    - Definition: 
        - To establish useful relationships between software components and certain configurations. 
        - To establish both functional and nonfunctional goals which may lead to different patterns (structures).
    - Object-Oriented Technique:
        - Inheritance.
        - Interfaces.

3. Behavioral Patterns:
    - Definition: 
        - Best practice of object interaction.
    - Focus: 
        - Define protocols. 
    - Object-Oriented Technique:
        - Methods and their signatures.
        - Interfaces.

## Design Patterns and OOP
Object Oriented Programing (OOP) is the main software development methodology today. Modern programming languages support OOP. Design patterns rely heavily on OOP. 

## What is OOP?
To understand OOP, we have to understand:
1. Object which represent entities in both problem or solution domain.
2. Classes are templates to create objects in terms of:
    - Attributes which represent the properties and the state of entities. 
    - Methods: which represent the behavior of entities. 

## What is Inheritance and Polymorphism in OOP?
- Inheritance is used to create a child class which: 
    - keeps all the attributes and methods of the parent. 
    - adds new attributes or methods.
    - overrides existing methods of its parent. 
- Polymorphism relays on inheritance and is used to allow a child class to be treated as its parent.

## How can we use Design Patterns Efficiently?
One must be familiar with the patterns language which include:
1. Name: names have to be meaningful and memorable. 
2. Context: to describe when to use or not to use a pattern. 
3. Problem: to describe the design challenge to be addressed by the pattern.
4. Solution: to specify the pattern in terms of: 
    - structure (relationships between elements).
    - behavior (interactions) 
5. Related Patterns: used together with patterns being described. 

## Important Patterns: 
1. Factory Method:
    - Factory method is needed when we don't know (at runtime) what are the needed objects.
    - file: [02_FactoryPattern.py](02_FactoryPattern.py)
2. Abstract Factory:
    - Useful when we don't know the class until the runtime. 
    - Python is a dynamically typed language and does not require inheritance from abstract classes.
