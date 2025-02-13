# 📌 **REST Assured API Testing with TestNG**
This project demonstrates API testing using REST Assured and TestNG with jsonplaceholder.typicode.com as a dummy API.

📂 Project Structure

📦 com.testapi
 ┣ 📜 ApiTesting.java
 
 ┣ 📜 pom.
 
 ┗ 📜 README.md

⚡ Dependencies (pom.xml)

📝 Test Cases

🚀 Running the Tests
Run tests in IDE or via Maven

    🔹 Summary of Outputs
| 🆔  | Method  | API Endpoint | Expected Status | Expected Output |
|----|--------|--------------|----------------|----------------|
| 1️⃣  | **GET**  | `/posts`    | `200 OK`       | List of posts |
| 2️⃣  | **POST** | `/posts`    | `201 Created`  | New post with ID |
| 3️⃣  | **PUT**  | `/posts/1`  | `200 OK`       | Updated post data |
| 4️⃣  | **DELETE** | `/posts/1` | `204 No Content` | No response body |






    
