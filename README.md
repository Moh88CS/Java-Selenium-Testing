# Java Selenium Testing Framework

This project is a robust and scalable **Selenium WebDriver** testing framework built using **Java**. It thoroughly tests Amazon's search function, following the **Page Object Model (POM)** design pattern, and incorporates **Web Components** for modular and maintainable test automation. The framework is designed to automate web application testing, ensuring reliability, reusability, and ease of maintenance.

## Features

- **Page Object Model (POM)**: Implements the POM design pattern to separate test logic from page-specific logic, enhancing maintainability and reusability.
- **Web Components**: Encapsulates reusable UI elements (e.g., buttons, forms, tables) into components for better modularity.
- **Data-Driven Testing**: Supports data-driven testing using external data sources like Excel, CSV, or JSON files.
- **Cross-Browser Testing**: Enables testing across multiple browsers (e.g., Chrome, Firefox, Edge) with easy configuration.
- **Reporting**: Generates detailed test execution reports for better visibility into test results.
- **Logging**: Integrated logging for better debugging and traceability.
- **CI/CD Integration**: Ready to be integrated into CI/CD pipelines for automated testing.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Gradle**: For dependency management and build automation.
- **IDE**: IntelliJ IDEA, Eclipse, or any other Java-compatible IDE.
- **Git**: To clone the repository.
- **WebDriver Executables**: Download the required WebDriver executables (e.g., `chromedriver`, `geckodriver`) and ensure they are added to your system's PATH.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Moh88CS/Java-Selenium-Testing.git
   cd Java-Selenium-Testing
   gradle clean test

## IMPORTATNT NOTICE
Please note that Amazon added a CAPTCHA, which prevents automation. I bypassed this by using Use Selenium Stealth techniques:
- Random User-Agents: Simulate different browsers.
- Proxy Rotation: Use services like BrightData, ScraperAPI, or residential proxies.
- Headless Detection Evasion: Modify Chrome options.

This is not the best solution for real world scenarios. The best thing to do is useually either get API access to Amazon, for example. We could also use Headless Browser with Puppeteer-Selenium. I used this bypass becuase it's simple and there is no possible way bypassing the CAPTCHA would cause harm in this particular case. Thank you for understanding :)

