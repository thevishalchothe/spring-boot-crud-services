# Reports Management System Example ⚙️📊📝

## 📘 Project Overview

The `reports-management-system` is a project that handles the generation, storage, and retrieval of analytical reports related to loan performance, defaults, and business growth. It provides REST APIs for CRUD operations on reports with categorization and scheduling capabilities.

---

## Key Features 🚀                                                                

- **CRUD Operations**          | Create, read, update, and delete reports via REST APIs                     
- **Report Categorization**    | Filter reports by type (`LOAN_PERFORMANCE`, `DEFAULT_ANALYTICS`, etc.)     
- **Scheduled Reports**        | Auto-generate recurring reports (daily/weekly/monthly)                     
- **Audit Trail**             | Track report creators and generation timestamps                            
- **File Storage**            | Securely store reports as PDF/CSV (AWS S3 or local filesystem)             

---

## API Endpoints 🔗 

| Endpoint                     | Method | Description                          |
|------------------------------|--------|--------------------------------------|
| `/api/reports`               | POST   | Create new report                    |
| `/api/reports/{id}`          | GET    | Get report by ID                     |
| `/api/reports`               | GET    | Get all reports (with pagination)    |
| `/api/reports/type/{type}`   | GET    | Filter by report type                |
| `/api/reports/{id}`          | PUT    | Update report                        |
| `/api/reports/{id}`          | DELETE | Delete report                        |

---

### Sample Request (Create/Update)  
  ```json
  {
    "reportName": "Monthly Loan Defaults",
    "reportType": "DEFAULT_ANALYTICS",
    "description": "June 2024 default analysis",
    "isScheduled": true
  }
  ```

---

 ### Setup & Steps
 
1. Clone the repository:

  ```bash
  git clone https://github.com/wheelwise/reports-management-system.git
  cd reports-management-system
  ```

2. Configure database:

Update application.properties

3. Run the application:

  ```bash
  mvn spring-boot:run
  ```

4. Access APIs:
 
  ```  
  Default API URL: http://localhost:8080/api/reports
  ```
---

## Project Summary 📌 

`Reports Management System` is a project example that:  

  -  **Automates report generation** for loan performance, defaults, and business analytics.
  -  **Provides REST APIs** for CRUD operations with JWT authentication.
  -  **Categorizes reports** by types (`LOAN_PERFORMANCE`, `DEFAULT_ANALYTICS`, etc.).
  -  **Supports scheduling** for recurring reports (daily/weekly/monthly).
  -  **Tracks audit trails** (creator, timestamp, and storage path).
  -  **Uses Spring Boot 3 + PostgreSQL** with Lombok for clean code.
  -  **Ready for extensions**: Email alerts, dashboards, and advanced filters.  

**Goal**: Replace manual reporting with a scalable, self-service system.  

---

## Future Enhancements 📅 
  -  Email Notifications: Auto-send reports to stakeholders.
  -  Dashboard Integration: Visualize report data.
  -  Advanced Filters: Support date ranges, dealer IDs, etc.
