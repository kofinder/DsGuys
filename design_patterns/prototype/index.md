# Prototype
    * A partially or fullly initialized object that you copy(clone) and make use of.
    * Shallow copy—
        * Only fields of the primitive data type will be copied. All references are not copied.
        * the pointer points to the same copy of objects of class.
    * Deep copy
        - Whole the object will be copied to another location.
        - It creates copy of each object inside of the class.
    * Compliated Object (eg.,cars)  arn't designd form scratch
        - They reiterate existing design
    * An exsting (partiall or full construted) design a prototype
    * We make a copy(clone) the prototype and customize it Requries 'deep copy' support
    * we make the cloning convenient (eg., via a factory)

#Summary
    * To implement a prototype, partially construct an object and store it somewhere
    * Clone the prototype
        - implements your own deep copy functionality, 
        - Serialize and Deserialize
        - Customize the resulting instance

