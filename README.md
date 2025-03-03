# Software Testing and Quality Assurance Portfolio Submission

## Overview
This repository contains portfolio artifacts that demonstrate my work in **software development, testing, and quality assurance**. The projects included focus on **Contact Management, Task Management, and Appointment Scheduling**, showcasing my ability to write unit tests, implement structured software design, and apply testing strategies to ensure software reliability and security.

The uploaded files highlight **test-driven development (TDD), structured object-oriented programming (OOP), and exception handling techniques** to maintain data integrity while preventing invalid operations.

---

## Submitted Artifacts
### **Project One: Contact Management Service**
The Contact Management Service allows users to create, update, and delete contact information while ensuring data validation.

- **`Contact.java`** – Defines the `Contact` class, enforcing constraints on **contact ID, name, phone number, and address** to prevent invalid entries.
- **`ContactService.java`** – Manages contact records in a registry, ensuring unique IDs and handling updates securely.
- **`ContactTest.java`** – Unit tests to validate object creation and enforce constraints.
- **`ContactServiceTest.java`** – Tests service operations, ensuring contacts can be added, updated, and removed correctly.

### **Project Two: Task Management Service**
The Task Management Service enables users to create, update, and delete tasks efficiently.

- **`Task.java`** – Defines the `Task` class with **a unique ID, name, and description**, ensuring proper constraints on data length.
- **`TaskService.java`** – Handles task creation, deletion, and updates with a **unique identifier** for each task.
- **`TaskTest.java`** – Unit tests for verifying task creation and exception handling.
- **`TaskServiceTest.java`** – Service tests validating that tasks can be managed without errors.

### **Project Three: Appointment Scheduling Service**
The Appointment Scheduling Service allows users to schedule, manage, and cancel appointments, ensuring validity in **date and description fields**.

- **`Appointment.java`** – Defines the `Appointment` class with constraints ensuring **valid dates (future only)** and proper **descriptions**.
- **`AppointmentService.java`** – Manages the scheduling and deletion of appointments while preventing duplicate entries.
- **`AppointmentTest.java`** – Tests for valid and invalid appointment creation.
- **`AppointmentServiceTest.java`** – Verifies that the service correctly **adds, retrieves, and deletes appointments**.

---

## Reflections

### **How can I ensure that my code, program, or software is functional and secure?**
Ensuring functionality and security requires a **structured approach to testing, validation, and secure coding practices**. I used **JUnit tests** extensively across all three services to verify that objects were created correctly, inputs met constraints, and operations like updating or deleting entities worked as expected.

Security is enforced through **input validation**:
- Contact names, phone numbers, and addresses have strict length constraints (`Contact.java`).
- Task names and descriptions must be within acceptable limits (`Task.java`).
- Appointment dates cannot be in the past (`Appointment.java`).

Additionally, **exception handling** prevents invalid actions, such as attempting to delete a non-existent task or scheduling an appointment in the past. This ensures robustness and security.

---

### **How do I interpret user needs and incorporate them into a program?**
Understanding user requirements involves **breaking them into core functionalities** and ensuring each component addresses a specific need. In my projects, I:
- Created **modular classes** like `Contact`, `Task`, and `Appointment`, each with attributes directly aligned with user expectations.
- Used **services (`ContactService`, `TaskService`, `AppointmentService`)** to manage operations efficiently.
- Applied **testing-driven development (TDD)** by writing tests first (`ContactServiceTest.java`, `TaskServiceTest.java`, etc.), ensuring that the implementation met user needs.

By structuring programs this way, I ensured flexibility and maintainability while delivering software that aligns with real-world use cases.

---

### **How do I approach designing software?**
My software design approach follows **object-oriented programming (OOP) principles**, ensuring modularity and reusability. The key aspects of my approach include:

1. **Encapsulation & Data Integrity**  
   - Each entity (`Contact`, `Task`, `Appointment`) is encapsulated to prevent unauthorized modifications.
   - Fields are validated in constructors and setter methods to maintain consistency.

2. **Modular & Scalable Architecture**  
   - The service layer (`ContactService`, `TaskService`, `AppointmentService`) abstracts business logic from the data layer.
   - This separation ensures scalability—new features can be added without modifying the core logic.

3. **Testing-Driven Development (TDD)**  
   - Writing unit tests first (`ContactTest.java`, `TaskTest.java`, `AppointmentTest.java`) forced me to think critically about **edge cases and validation** before implementation.
   - Service tests (`ContactServiceTest.java`, `TaskServiceTest.java`, `AppointmentServiceTest.java`) validated **business logic**, ensuring services handled user operations correctly.

4. **Error Handling & Exception Management**  
   - Input validation prevents **invalid data entries**.
   - `IllegalArgumentException` is used throughout the project to **gracefully handle errors** when invalid inputs are detected.

---

## **Repository Link**
[GitHub Repository](<INSERT-YOUR-GITHUB-REPO-LINK-HERE>)

This repository serves as a testament to my ability to **develop structured, testable, and secure software applications**. These projects highlight my knowledge of **software testing, object-oriented design, and best practices for data validation**.

---
