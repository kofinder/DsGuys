# Template Method
`` Define the skeleton of an algorithm in an operation, deferring some steps to sub­classes. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.``

    - Algorithms can be decomposed into common parts + specifics
    - Startegy pattern does this through composition
        * Hight-Level algorithm uses an interface
        * Concrete implementations implement the interface
    - Template Method does the same thing through inheritance
        * Overall algorithm makes use of abstract members
        * Inheritors override the abstract members
        * Parent template method invoked

# Summary
* Allow us to defined the 'skeleton' ot the algorithm, with concrete implementation defined in subclasses
* Define an algorithm at a high level
* Define constituent parts as abstract methods/properties
* Inherit the algorithm class, providing necessary overrides