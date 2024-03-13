Spring Boot Microservices
This application is designed to showcase the implementation of microservices architecture using Spring Boot. It utilizes a range of tools and technologies to ensure reliability, scalability, and efficient management.

Tools Utilized
++ RabbitMQ: A reliable and mature messaging and streaming broker facilitating communication between microservices.
++ Zipkin: A distributed tracing system used for monitoring and troubleshooting requests across the microservices architecture.
++ PostgreSQL: A relational database utilized for structured data persistence.
++ Kubernetes: A container orchestration platform employed for deployment, scaling, and management of containerized applications.
++ Docker: Utilized for building container images for various microservices.

Components
++ Review, Job, and Company Microservices: Each microservice encapsulates specific business functionalities and communicates with others either through messaging or direct API calls.
++ API Gateway: Responsible for load balancing and presenting the entire application as a single entity to external clients.
++ Config Server: Enables centralized management of configuration properties, facilitating easy configuration changes across microservices.
++ Service Registry: Enables service discovery within the microservices architecture, ensuring seamless communication between services.

Key Learnings
Throughout the development of this application, several key learnings were acquired:

++ Feign Clients: Utilization of Feign clients, a declarative web client, to reduce boilerplate code typically associated with using Rest Templates for inter-service communication.

These tools and practices enable the application to achieve modularity, scalability, and resilience, making it suitable for building complex, distributed systems within a microservices architecture.
