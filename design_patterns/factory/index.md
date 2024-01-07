# Factores

    Noteds: A component responsible solely for the wholesale(not piecewise) creation of objects. 

    * Object creation logic becomes too convoluted

    * Constructor is not descriptive
        1. Name mandated by name of containing type
        2. Cannot overload with same sets of arguments with different names
        3. Can turn into "overloading hell"

    * Wholesale Object creation(non-piecewise, unlike Builder) can be outsourced to
        1. A separate function(Factory Method)
        2. That may exit in separate class(Factory)
        3. Can create hierarchy of factories with Abstract Factory

