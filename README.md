# 📝 TaskManager With Java

A simple and elegant task management web application built with **Java**, **Spring Boot**, **Thymeleaf**, and **Maven**. This app allows users to create, update, delete, and view tasks with a clean UI and persistent data storage.

## 🌟 Features

- ✅ Create, read, update, delete (CRUD) operations for tasks  
- 📄 Each task has a title, description, and status (completed/incomplete)  
- 🧼 Clean and responsive UI using HTML/CSS (with Tailwind styling or similar)  
- 🗃️ Task persistence via a relational database (e.g., H2/MySQL)  
- 🚀 Built and managed using Maven  
- ☕ Java 17 + Spring Boot backend

## 📸 Screenshots

### 🔍 Empty Task List View
![Empty Task List](/mnt/data/dfa54471-4577-4a5d-8977-0dab313c2101.png)

---

### 🆕 Adding a Task
![Create New Task](/mnt/data/a774941e-8f06-4c55-82c1-9c5657daed9d.png)

---

### 📋 Populated Task List
![Task List](/mnt/data/334b6c4f-d7e8-40f2-818f-6d95c6fa2643.png)

---

### 🖊️ Edit Task
![Edit Task](/mnt/data/6b7889d0-ef6c-4522-8ece-ffa37643843d.png)

---

### ✅ Completed Task Status View
![Completed Task](/mnt/data/93fe7681-3f0d-4263-9605-daaa7baee011.png)

---

## 🛠️ Tech Stack

| Layer        | Technology             |
|--------------|-------------------------|
| Backend      | Java 17, Spring Boot    |
| Frontend     | Thymeleaf, HTML, CSS    |
| Build Tool   | Maven                   |
| DB (optional)| H2 / MySQL              |
| Deployment   | Localhost (Tomcat 8080) |

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven 3.6+
- IDE (e.g. IntelliJ IDEA, Eclipse)

### Run Locally

```bash
# Clone the repository
git clone https://github.com/shafeenyousafzaii/TaskManager-With-Java.git
cd TaskManager-With-Java

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
