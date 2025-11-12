General implementation of Builder Design Pattern. <br>
The service has a director class which mintains the builder. The model and it's builder are defined separately.<br>
<br><br>
Some points to remember :- <br>
- The model class itself has the builder class. <br>
- It is good to have the builder class constructor be parameterized. Prevents creating empty objects. <br>
- A concrete object is only created when build() method is invoked. <br>
- Remaining setter methods of the builder returns the builder object after setting the field value. Helps in fluent building. <br>
- It is good to have a seaparate director class to define the order of chaining. However, it is an optional step.<br>
- Builder design is typically used when the parent model class is used to represent an immutable object. Hence, setters are not generally added to the model class. <br>
