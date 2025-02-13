📌 REST Assured API Testing with TestNG
This project demonstrates API testing using REST Assured and TestNG with jsonplaceholder.typicode.com as a dummy API.

📂 Project Structure
📦 com.testapi
 ┣ 📜 ApiTesting.java
 ┣ 📜 pom.xml
 ┗ 📜 README.md

⚡ Dependencies (pom.xml)

📝 Test Cases

🚀 Running the Tests
Run tests in IDE or via Maven

🛠 How It Works
// ✅ GET Request - Fetch all posts
given()
    .get("https://jsonplaceholder.typicode.com/posts")
    .then()
    .statusCode(200)
    .log().all();

// ✅ POST Request - Create a new post
JSONObject requestBody = new JSONObject();
requestBody.put("title", "New Post");
requestBody.put("body", "This is a new post");
requestBody.put("userId", 1);

given()
    .contentType(ContentType.JSON)
    .body(requestBody.toString())
    .when()
    .post("https://jsonplaceholder.typicode.com/posts")
    .then()
    .statusCode(201)
    .log().all();

// ✅ PUT Request - Update post with ID 1
requestBody.put("title", "Updated Post");
requestBody.put("body", "This is the updated body");

given()
    .contentType(ContentType.JSON)
    .body(requestBody.toString())
    .when()
    .put("https://jsonplaceholder.typicode.com/posts/1")
    .then()
    .statusCode(200)
    .log().all();

// ✅ DELETE Request - Delete post with ID 1
given()
    .delete("https://jsonplaceholder.typicode.com/posts/1")
    .then()
    .statusCode(204)
    .log().all();

    🔹 Summary of Outputs
| 🆔  | Method  | API Endpoint | Expected Status | Expected Output |
|----|--------|--------------|----------------|----------------|
| 1️⃣  | **GET**  | `/posts`    | `200 OK`       | List of posts |
| 2️⃣  | **POST** | `/posts`    | `201 Created`  | New post with ID |
| 3️⃣  | **PUT**  | `/posts/1`  | `200 OK`       | Updated post data |
| 4️⃣  | **DELETE** | `/posts/1` | `204 No Content` | No response body |






    
