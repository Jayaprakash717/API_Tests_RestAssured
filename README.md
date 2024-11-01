# API_Tests_RestAssured

This project is a Mobile Automation Testing framework developed using Java and Appium to test functionality in the Reddit and Uber apps. The project is created in IntelliJ IDEA and leverages tools like Vysor, Android Studio, Appium Inspector, Node.js, and Appium for interacting with and automating mobile applications.

## Project Overview

The `API_Tests_RestAssured` framework is designed to perform UI and functional tests on Android applications, specifically targeting:

- **Reddit**: Searches for topics (e.g., "Australia") to verify search functionality.
- **Uber**: Automates initial app interactions (currently commented out) to verify the presence of key UI elements and validate the login screen.

## Key Tools and Technologies

- **IntelliJ IDEA**: Used as the main development environment.
- **Vysor**: Provides Android device mirroring on your desktop.
- **Android Studio**: Supports Android SDK management and device emulation.
- **Appium**: Automates mobile applications; works with Appium Inspector for UI element inspection.
- **Node.js**: Enables the Appium server to run and handle device communication.
- **Appium Inspector**: Identifies UI elements in mobile applications for effective automation scripting.

## Project Structure and Code Details

The main test script is located in the `AppTest` class, which contains the `openMobileApp` method. Key highlights:

- **DesiredCapabilities**: Configures the Appium session with the following capabilities:
  - `deviceName`, `udid`, `platformName`, `platformVersion`, and `automationName`.
  - Application package and activity are set for either Reddit or Uber.
- **Reddit Automation**: 
  - Opens the Reddit app.
  - Waits for the application to load.
  - Validates key UI elements, while navigating through different screens.
- **Uber Automation**: *(Currently commented out)*:
  - Opens the Uber app.
  - Navigates through the initial welcome and permission screens.
  - Validates key UI elements, while navigating through different screens.

## Setup and Installation

1. **Install Prerequisites**:
   - **Node.js** and **Appium**: Run `npm install -g appium` to install Appium globally.
   - **Android SDK**: Ensure Android SDK is installed via Android Studio.
   - **Appium Inspector**: Download and install for inspecting UI elements.

2. **Device Setup**:
   - Connect an Android device or start an emulator.
   - Use **Vysor** to mirror the device if needed.

3. **Run the Test**:
   - Start the Appium server:
     ```bash
     appium
     ```
   - Open the project in IntelliJ IDEA and execute the `AppTest` class to run the automation script.

## Usage

- **Run Reddit Tests**: Ensures that the Reddit app’s search functionality is working and key UI elements are displayed.
- **Uber Tests (Optional)**: Uncomment the Uber test code to validate initial screen elements in the Uber app.

## Note

The `Uber` app tests are commented out for this version. To test the Uber app, uncomment the relevant code section.
