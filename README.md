# Java-Microservices-CQRS-Event-Sourcing-with-Kafka
Produce events to Apache Kafka, Consume events from Apache Kafka to populate and alter the read database, Replay the event store recreate the state of the aggregate, Separet read and write concernsm, Structure your code using Domain-Driven-Design 


## What is Microservice?

In this course you will learn how to create Spring Boot microservices that comply to the CQRS and Event Sourcing patterns.

You will not use any CQRS framework, but you will write every line of code that is required to effectively create your own CQRS and Event Sourcing framework using Java and Apache Kafka. While this might sound a little daunting, you will be carefully guided step by step, and gain all the know-how and confidence to become an expert in CQRS and Event Sourcing.


## What is an Event?
Events are objects that describe something that has occurred in the application. A typical source of events is the aggregate. When something important has occurred within the aggregate, it will raise an event. 

## Design Pattern : Mediator [pattern](https://github.com/Urunov/Interview-Preparation-WAY) 

- Promotes loose coupling by preventing objects from refferring to each other explicitly
- Simplifies communication beetween objects by introducing a single object known as the mediator that manages the distribution of messages among other objects.

## Important for Project: 

1. Handle commands and raise events.

2. Use the mediator pattern to implement command and query dispatchers.

   - Behavioral Design Pattern
   - Promotes loose coupling by preventing objects from referring to each other explicitly.
   - Simplifies communication between objects by introducing a single object known as the mediator that manages the distribution of messages among other objects.

3. Create and change the state of an aggregate with event messages.
   ## What is an Aggregate?
    - An Aggregate is an entity or group of entities that is always kept in a consistent state. The aggregate root is the entity within the aggregate that is responsible for maintainning this consistent state. 
    - This makes the aggregate the primary building block for implementing a command model in any CQRS based application.
    
4. Implement an event store / write database in MongoDB.

5. Create a read database in MySQL.

Apply event versioning.

Implement optimistic concurrency control.

Produce events to Apache Kafka.

Consume events from Apache Kafka to populate and alter the read database.

Replay the event store and recreate the state of the aggregate.

Separate read and write concerns.

Structure your code using Domain-Driven-Design best practices.

Replay the event store to recreate the entire read database.

Replay the event store to recreate the entire read database into a different database type - PostgreSQL.

The ultimate goal of this course is to take a deep-dive into the world of CQRS and Event Sourcing to enable you to create microservices that are super decoupled and extremely scalable.

## What is important
CQRS
Event Sourcing
Creating DDD-Oriented Microservices
Using MongoDB as an Event Store
Optimistic Concurrency Control
Event Versioning
Using Apache Kafka as a Message Bus
Implementing the Database-Per-Service Pattern
Spring Framework
Docker
Using MySQL to Implement the Read Database
Replay the Event Store and Recreate the State of the Aggregate
Replay the Event Store and Recreate the Entire Read Database
Replay the Event Store and Recreate the Read Database in a Different Database Type - PostgreSQL
## Event 


The resource address [here](https://www.udemy.com/course/java-microservices-cqrs-event-sourcing-with-kafka/learn/lecture/29493542#overview) is it.
![CQRS](https://user-images.githubusercontent.com/11626327/186347108-4266db5b-33eb-4632-bafd-7d419c05a8c5.JPG)
