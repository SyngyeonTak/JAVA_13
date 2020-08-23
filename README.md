# JAVA_13
## thread, abstract class

Abstract Class<br>

* Abstract Methods and Classes
An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:

citation: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

Thread<br>
* Multithreading refers to two or more tasks executing concurrently within a single program. A thread is an independent path of execution within a program. Many threads can run concurrently within a program. Every thread in Java is created and controlled by the java.lang.Thread class. A Java program can have many threads, and these threads can run concurrently, either asynchronously or synchronously.

* Multithreading has several advantages over Multiprocessing such as;

1. Threads are lightweight compared to processes
1. Threads share the same address space and therefore can share both data and code
1. Context switching between threads is usually less expensive than between processes
1. Cost of thread intercommunication is relatively low that that of process intercommunication
1. Threads allow different tasks to be performed concurrently.
1. The following figure shows the methods that are members of the Object and Thread Class.

citation: https://www.wideskills.com/java-tutorial/java-threads-tutorial



Description of the Given Java File
1. Abstract Class

* Set Lift class as Abstract Class for other clasees. Elevator class extends Lift's functions. Even though Lift class cant be implemented, Elevator extends those methods.

2. Thread

* To show users the process of up and downs of elevator, have threads run per 1 second.
