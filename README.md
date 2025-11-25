# TRACK-IT-A-PACKAGE-TRACKING-DASHBOARD-
A complete backend system built using Spring Boot and MongoDB that manages customer accounts and parcel orders. This project provides REST APIs for customer signup, login, retrieval, update, deletion, as well as parcel order creation, tracking, updating, and deletion.In addition an email notifying feature notifies customers about any status update.


📦 Parcel Tracking System – Backend (Spring Boot + MongoDB)

A complete backend system built using Spring Boot and MongoDB that manages customer accounts and parcel orders.
This project provides REST APIs for customer signup, login, retrieval, update, deletion, as well as parcel order creation, tracking, updating, and deletion.

This backend is designed as part of a full-stack parcel tracking application, supporting JSON-based communication between client layers and the server.

🚀 Features
✅ Customer Management

Create customer accounts (Signup)

Login using email and password

Retrieve customer details by ID

Update customer details

Delete a customer

Validates input and prevents invalid/duplicate data

📦 Parcel Order Management

Create new parcel orders

Retrieve orders by tracking ID

Get list of all orders

Update order details

Delete an order

Uses MongoDB for fast and scalable document storage

🔧 Technologies Used

Spring Boot

Spring Web

Spring Data MongoDB

MongoDB (local/Atlas)

Lombok

Java 17+

REST API architecture

JSON request/response mapping

🗂️ Project Structure
src/main/java/com/parcel/tracking/parcelTracking
│
├── Entities
│   ├── Customer.java
│   └── ParcelOrder.java
│
├── Repository
│   ├── CustomerRepo.java
│   └── ParcelOrderRepo.java
│
├── Services
│   ├── CustomerService.java
│   ├── CustomerServiceImpl.java
│   ├── ParcelOrderService.java
│   └── ParcelOrderServiceImpl.java
│
└── Controller
    ├── CustomerController.java
    └── ParcelOrderController.java

🧩 Entity Models
Customer
@Id
private String id;
private String customerId;
private String name;
private String email;
private String password;
private String contact;

ParcelOrder
@Id
private String trackingId;
private String customerId;
private String status;
private String source;
private String destination;
private LocalDateTime orderDate;
private LocalDateTime dateOfDelivery;

🔌 REST API Endpoints
Customer APIs
Method	Endpoint	Description
POST	/parceltrack/signup	Create a customer account
POST	/parceltrack/login	Authenticate customer
GET	/parceltrack/customers/{customerId}	Get customer details
PUT	/parceltrack/customers/{customerId}	Update customer
DELETE	/parceltrack/customers/{customerId}	Delete customer
Parcel Order APIs
Method	Endpoint	Description
POST	/parceltrack/orders	Create a new order
GET	/parceltrack/orders/{trackingId}	Get order by tracking ID
GET	/parceltrack/orders	Get all orders
PUT	/parceltrack/orders/{trackingId}	Update order
DELETE	/parceltrack/orders/{trackingId}	Delete order
📥 Sample JSON Requests
Customer Signup
{
  "customerId": "CUST001",
  "name": "John Doe",
  "email": "john@example.com",
  "password": "secret123",
  "contact": "9876543210"
}

Create Parcel Order
{
  "trackingId": "TRK001",
  "customerId": "CUST001",
  "status": "Processing",
  "source": "New York",
  "destination": "Los Angeles",
  "orderDate": "2025-01-10T10:00:00",
  "dateOfDelivery": "2025-01-15T18:00:00"
}

🔄 JSON Mapping & Data Handling

One of the main challenges solved in this project is the accurate mapping of JSON requests to Java objects and vice versa.
This is managed through:

@RequestBody for JSON → Java

Jackson for automatic serialization & deserialization

CamelCase naming for smooth mapping

LocalDateTime handling through ISO 8601 format

Partial updates using non-null checks

MongoDB object mapping using Spring Data

🛠️ Running the Application
Prerequisites

Java 17+

MongoDB installed locally or MongoDB Atlas

Maven

Steps
git clone <repo-url>
cd parcelTracking
mvn spring-boot:run


The backend will start on:

👉 http://localhost:8080

📌 Future Enhancements

JWT-based authentication

Role-based access control

Frontend integration (React/Angular)

Email/SMS tracking notifications

Containerization with Docker
