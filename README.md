# Selenium Test Automation with TestNG - Levelset

##  Project Overview
This project is a **Selenium Test Automation Framework** built using **Java, TestNG, and Page Object Model (POM)**.  
It automates testing for the **[Levelset](https://www.levelset.com/)** website, ensuring key functionalities work as expected.

---

##  Project Structure
**Levelset** \
├── 📁 src \
│   ├── 📁 main \
│   │   ├── 📁 java \
│   │   │   ├── 📁 actions      # Contains reusable action methods (click, hover, etc.) \
│   │   │   ├── 📁 pages        # Page Object Model (POM) classes for web pages \
│   │   │   ├── 📁 locators     # Stores element locators separately \
│   ├── 📁 test \
│   │   ├── 📁 java \
│   │   │   ├── 📁 base         # Contains BaseTest and setup configurations \
│   │   │   ├── 📁 tests        # Test classes containing actual test cases \
├── 📄 pom.xml                  # Maven dependencies and project build configuration \
├── 📄 README.md                # Project documentation 

    
---

##  Technologies & Tools Used
- **Java** - Programming language for automation  
- **Selenium WebDriver** - Browser automation  
- **TestNG** - Test framework for managing test execution  
- **Maven** - Dependency management  
- **Page Object Model (POM)** - Design pattern for better test structure
- **Allure** - Executing Reports  

---

## Test Scenarios Implemented
###  **1. Free Document Validation**
- Ensures **exactly 2 free documents** exist.
- Verifies their names are **"Exchange a Waiver"** and **"Send a Payment Document"**.

###  **2. Paid Document Validation (Price Range: $30 - $60)**
- Extracts paid documents from the site.
- Ensures the count matches expectations.
- Confirms the document name **"Send a Warning"** is present.

---

