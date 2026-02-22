🚀 What This Project Does

The application allows you to:
1.Create a new record
2.View all records
3.View a specific record by ID
4.Update an existing record
5.Delete a record

All operations are exposed as REST APIs and can be tested using Postman or any API testing tool.

🛠 Technologies Used
Java
Spring Boot
Spring Web
Spring Data MongoDB
MongoDB
Maven

📂 Project Structure

The project follows a standard Spring Boot structure:
Controller – Handles HTTP requests and responses
Service – Contains business logic
Repository – Communicates with MongoDB
Model – Represents the MongoDB document
This separation makes the project clean and easy to understand.

⚙️ How to Run the Project
1. Clone the repository
git clone https://github.com/your-username/CRUD-project.git
cd CRUD-project
2. Configure MongoDB

Make sure MongoDB is running on your system.

In application.properties, configure:

spring.data.mongodb.uri=mongodb://localhost:27017/your_database_name
server.port=8080

If you're using MongoDB Atlas, replace the URI with your cluster connection string.

3. Run the application

Using Maven:
mvn spring-boot:run
Or run the main Spring Boot application class from your IDE.

The server will start at:

http://localhost:8080
🔗 API Endpoints

Here are the main endpoints (update if yours are slightly different):
GET /api/items → Get all records
GET /api/items/{id} → Get a record by ID
POST /api/items → Create a new record
PUT /api/items/{id} → Update a record
DELETE /api/items/{id} → Delete a record

🧪 How to Test

You can test the APIs using:
Postman
cURL
Any REST client

Example JSON body for creating a record:

{
  "name": "Sample Item",
  "description": "This is a test item",
  "price": 100
}
