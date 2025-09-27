# 🚀 selenium-docker-multiapp-framework

This repository contains a **Dockerized automation framework** for web application testing.  
It is built with **Selenium, Java, TestNG, and Maven**, and leverages **Docker & Jenkins** for containerized execution and CI/CD integration.  

The framework demonstrates end-to-end **test automation** for two different sample web applications — a **Flight Reservation system** and a **Vendor Portal.**

---

## 🌐 Applications Under Test  

### 1️⃣ Flight Reservation App  
🔗 [Reservation App](https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html#)  
- Full **flight booking flow** automated:  
  - User Registration  
  - Login  
  - Challenging **radio buttons** & **multi-option** && **CheckBoxes** selections. 
  - Criticla Dropdown selections  
  - Booking a flight and confirming the order  

### 2️⃣ Vendor Portal App  
🔗 [Vendor App](https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/login.html)  
- Automated **login flow** for registered users  
- **Pagination handling** for search results  
- Selecting multiple critical options  
- Validation of navigation and search operations
- LogOut validation  

---

## 🛠️ Tech Stack  

- **Java 11** → Core programming language  
- **Selenium WebDriver** → Browser automation  
- **TestNG** → Test execution & reporting  
- **Page Object Model (POM)** → Maintainable test design 
- **PageFactory**- helps in imtplementing POM, via **WebElement iniotialization** && **passing drivers**. 
- **Maven** → Build & dependency management  
- **Docker** → Containerization of test environment  
- **Jenkins** → CI/CD pipeline for building & pushing Docker images  

---

## ✨ Features  

- ✅ End-to-end functional test automation (2 web apps)  
- ✅ **Cross-browser testing** support  
- ✅ **Parallel execution** with TestNG  
- ✅ **Dockerfile** included → Build Docker image for framework  
- ✅ **Jenkinsfile** included → Automate build & push to DockerHub  
- ✅ **Scalable & portable** → Run tests in isolated containers  

---

## ⚙️ Prerequisites  

- Install **Java 11+**  
- Install **Maven**  
- Install **Docker** (latest version recommended)  
- (Optional) Jenkins if you want to run the pipeline  

---

## 📥 Setup & Usage  

**1. Clone the repository**  
```bash
git clone https://github.com/pramesh01/selenium-docker-framework.git
cd selenium-docker-framework
2. Run tests locally (without Docker)

bash
Copy code
mvn clean test
3. Build Docker Image

bash
Copy code
docker build -t selenium-docker-framework .
4. Run tests inside Docker Container

bash
Copy code
docker run selenium-docker-framework
5. Jenkins Pipeline

The Jenkinsfile provided defines steps to:

Build the Docker image

Push it to DockerHub

Trigger automated tests

📊 Reports & Logs
- Extent Reports → Generated inside test-output/
- Screenshots on failure → Stored automatically

Logs → Captured via Log4j

📌 Future Enhancements
- Integration with Docker Compose / Selenium Grid for distributed parallel execution
- Enhanced CI/CD pipeline with Builder & Runner stages
- Integration with cloud platforms (e.g., LambdaTest, AWS-EC2)

👨‍💻 Author
- Pramesh Kumar
- LinkedIn: www.linkedin.com/in/prameshkumar
- 📧 pramesh.cs@gmail.com