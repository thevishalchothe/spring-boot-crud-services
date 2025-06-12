# Reports Management System Example ⚙️📊📝

## 📘 Project Overview

The `reports-management-system` is a project that handles the generation, storage, and retrieval of analytical reports related to loan performance, defaults, and business growth. It provides REST APIs for CRUD operations on reports with categorization and scheduling capabilities.

---

## Key Features 🚀

- **CRUD Operations** for reports via REST API
- **Report Categorization** (Loan Performance, Default Analytics, Business Growth)
- **Audit Trail** (Track report generation time and creator)
- **Scheduled Reports** (Recurring generation)
- **Type-Based Filtering** (Filter reports by category)

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
