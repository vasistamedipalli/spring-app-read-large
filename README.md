# spring-app-read-large

# Spring Boot App: Read Large Dataset with REST + WebSocket

This Spring Boot application demonstrates:
- Reading large datasets using REST API
- Broadcasting real-time updates using WebSocket
- Using pagination for performance
- Populating test data with 10,000+ mock rows

---

## ▶️ How to Run

1. **Pre-requisites**
   - Java 17+
   - Maven 3.x
   - Oracle DB (or H2 in-memory for testing)

2. **Run the app**
   ```bash
   ./mvnw spring-boot:run

Verify endpoints

REST: http://localhost:8080/api/records

WebSocket client: http://localhost:8080/ws-client.html
