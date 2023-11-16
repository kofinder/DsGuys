# Solid Principle

What is SOLID , why we need these principles and S explained ?
It is combination of 5 design principles such as
S - Single Responsibility Principle (SRP)
O - Open/Closed Principle (ORP)
L - Liskov Substitution Principle (LSP)
I - Interface Segregation Principle (ISP)
D - Dependency Inversion Principle (DIP)

Why we need SOLID or its benefits
- Better Testability
- Reduces coupling
- Removes Duplication
- Increases Readability
- Increases Extensibility

SRP says :-
- A class/method should have one reason to change
- A class/method should have only one responsibility
- A class/method should be related to a single purpose

With SRP we achieve :-
- Class/method becomes smaller and cleaner
- Now in future updating the code becomes easier

Example
Bad :- Single class responsible for Signup, Login , Logging Error and Sending the Email.

Good :- Different classes for different purpose
User Account related (Signup and Login)
Sending Email related (SendEmail)
Logging related (LogInformation)

Now in future we can add LogError,LogWarning in our logging class and ForgotPasword in User Account.

Suppose if we had kept a single class and we add new methods in that class then its impact would have been everywhere
where class has dependencies.

In current example I have used just class for demo one can use interface example as well

Which design principle is your favorite one from SOLID ?

📌 P.S:- I discuss more interesting topics in my newsletter every Saturday.
3800+ Engineers have already subscribed for it.

