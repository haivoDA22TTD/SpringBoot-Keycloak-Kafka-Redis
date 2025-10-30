# 🚀 Spring Boot-Keycloak-Kafka-Redis

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=flat&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![Keycloak](https://img.shields.io/badge/Keycloak-CC2927?style=flat&logo=keycloak&logoColor=white)](https://www.keycloak.org/)
[![Apache Kafka](https://img.shields.io/badge/Kafka-231F20?style=flat&logo=apachekafka&logoColor=white)](https://kafka.apache.org/)
[![Redis](https://img.shields.io/badge/Redis-DC382D?style=flat&logo=redis&logoColor=white)](https://redis.io/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white)](https://www.docker.com/)

---

## 📝 Mô tả dự án
Dự án này được xây dựng với mục tiêu  **sử dụng các công nghệ hiện đại để đảm bảo hiệu năng, bảo mật và khả năng mở rộng**.

---

## 🛠 Công nghệ sử dụng
- 🌱 **Spring Boot** - Framework phát triển ứng dụng Java mạnh mẽ.
- 🍃 **MongoDB** - Cơ sở dữ liệu NoSQL linh hoạt.
- 🔑 **Keycloak** - Quản lý xác thực và phân quyền người dùng.
- ☕ **Apache Kafka** - Hệ thống messaging mạnh mẽ, xử lý dữ liệu thời gian thực.
- 🟥 **Redis** - Lưu trữ dữ liệu tạm thời, cache tăng tốc.
- 🐳 **Docker** - Containerization để triển khai nhanh và nhất quán.

---

## 📝 Mô tả dự án
Dự án này là một **ứng dụng hiện đại** được xây dựng trên nền tảng **Spring Boot**, với mục tiêu **tối ưu hóa hiệu năng, bảo mật, khả năng mở rộng và quản lý dữ liệu thời gian thực**.  
Nó kết hợp các công nghệ mạnh mẽ như **MongoDB, Kafka, Redis và Keycloak**, đồng thời hỗ trợ triển khai nhanh chóng qua **Docker**.

### 🎯 Mục tiêu chính
- Xây dựng một hệ thống backend **bền vững, dễ mở rộng**.
- Đảm bảo **bảo mật và quản lý người dùng** bằng Keycloak.
- Hỗ trợ **xử lý dữ liệu real-time** với Kafka.
- Tăng tốc truy xuất dữ liệu nhờ Redis caching.
- Dễ dàng triển khai trên Docker, đảm bảo môi trường **nhất quán giữa dev và production**.

### ⚡ Tính năng nổi bật
- **Quản lý người dùng và phân quyền** thông minh qua Keycloak.
- **CRUD dữ liệu** nhanh chóng và linh hoạt với MongoDB.
- **Event-driven architecture**: xử lý các sự kiện bất đồng bộ với Kafka.
- **Caching nâng cao** với Redis để cải thiện tốc độ phản hồi.
- **Containerization** với Docker giúp triển khai dễ dàng, không gặp vấn đề về môi trường.

### 🌟 Giá trị mang lại
- Giúp **nhóm phát triển** tiết kiệm thời gian triển khai và bảo trì.
- Cho phép **mở rộng tính năng** mà không ảnh hưởng đến hiệu năng hiện tại.
- **Đảm bảo bảo mật dữ liệu** và kiểm soát quyền truy cập chính xác.
- Hỗ trợ **xử lý dữ liệu real-time**, phù hợp với các hệ thống yêu cầu tốc độ cao.

---
## 🖥️ Bảng các Service & Port

| Service        | Mô tả                                         | Port mặc định |
|----------------|-----------------------------------------------|---------------|
| 🟢 Spring Boot | Ứng dụng backend REST API                     | 8080          |
| 🍃 MongoDB     | Cơ sở dữ liệu NoSQL                           | 27017         |
| 🔑 Keycloak    | Quản lý authentication & authorization       | 8081   |
| ☕ Kafka       | Hệ thống messaging real-time                  | 9092          |
| 🟥 Redis       | Lưu trữ cache dữ liệu tạm thời                | 6379          |


> 💡 Lưu ý: Các port có thể thay đổi tùy cấu hình Docker Compose hoặc file `application.yml`.

## Hướng dẫn cài đặt ứng dụng
### Clone ứng dụng
  ```bash
   git clone https://github.com/haivoDA22TTD/SpringBoot-Keycloak-Kafka-Redis.git
   cd SpringBoot-Keycloak-Kafka-Redis
   cd apimanager
  ```
### Build backend thành file jar
### <img src="https://cdn.simpleicons.org/apachemaven/FF6600" width="20"> mvn
  ```bash
    mvn clean package -DskipTests
  ```
### <img src="https://cdn.simpleicons.org/apachemaven/FF6600" width="20"> mvnw
  ```bash
    ./mvnw clean package -DskipTests
  ```
### <img src="https://cdn.simpleicons.org/docker/2496ED" width="24"> Chạy ứng dụng với Docker
  ```bash
    docker-compose up --build
  ```
<p align="center">
  <img width="500" height="620" alt="image" src="https://github.com/user-attachments/assets/252d315a-8ec2-418a-9e95-645ce192d10c" />
</p>
