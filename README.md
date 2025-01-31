
QuickNotes - Project Documentation

1. Project Overview

QuickNotes is a simple and efficient note-taking application built using Jetpack Compose. It allows users to quickly capture, organize, and manage notes with essential features such as Google Sign-In authentication and Firebase Firestore integration. The app also includes a splash screen, a clean home page with a list of notes, and an easy-to-use interface for adding and deleting notes.

2. Features

Splash Screen with app logo

Google Sign-In for authentication

Home Screen displaying saved notes

Floating Action Button (+) to add new notes

Firestore Database for storing notes

Offline support using Jetpack Compose

3. Design Considerations

The app was designed with simplicity and efficiency in mind. Key considerations include:

Minimalist UI: Ensuring a clean and intuitive interface using Jetpack Compose.

Performance Optimization: Utilizing Firebase Firestore for fast and reliable data storage.

Offline Capability: Implementing Room Database for offline access to notes.

Security: Using Google Sign-In authentication to secure user data.

4. Utilization of GitHub & GitHub Actions

GitHub for Version Control

GitHub was used for managing the project codebase, tracking changes, and collaborating efficiently. The repository can be accessed at:
🔗 GitHub Link: QuickNotes Repository

GitHub Actions for CI/CD

GitHub Actions was implemented to automate tasks such as:

Automated Builds: Ensuring that the app compiles correctly with each commit.

Linting & Code Quality Checks: Running checks to maintain code consistency.

Deployment Pipeline: Preparing APK builds for easy distribution.

Example of a GitHub Actions Workflow (.github/workflows/android-ci.yml):
name: Android CI

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - name: Checkout Code
      uses: actions/checkout@v2
    - name: Set up JDK 17
      uses: actions/setup-java@v2
      with:
        distribution: 'temurin'
        java-version: '17'
    - name: Build with Gradle
      run: ./gradlew build

      5. Installation Guide

For Users (APK Installation)

Download the APK from https://drive.google.com/file/d/14w9EBN2cdC-deU__Qlkm5wyxL2eU4U7q/view?usp=drive_link

Enable "Install Unknown Apps" in device settings

Install and open QuickNotes

For Developers (Running in Android Studio)

Clone the repository:

git clone https://github.com/MilkandToast/QuickNotesPOE.git

Open the project in Android Studio

Run the app on an emulator or physical device

6. Technologies Used

Jetpack Compose for UI design

Firebase Authentication for Google Sign-In

Firebase Firestore for database storage

GitHub & GitHub Actions for version control and automation

7. Screenshots

📸 Include screenshots of:

Splash screen
![Image Alt]((https://github.com/MilkandToast/QuickNotesPOE/blob/8eb6708f09e72351d874ff313cde620998de32d7/Splash.jpg).

Login page
![Image Alt](https://github.com/MilkandToast/QuickNotesPOE/blob/c138d4705c6c43bbc2cf4244429ff5bfab06d396/login.jpg).
![Image Alt](https://github.com/MilkandToast/QuickNotesPOE/blob/c138d4705c6c43bbc2cf4244429ff5bfab06d396/login%202.jpg).

Home screen displaying notes
![Image Alt](https://github.com/MilkandToast/QuickNotesPOE/blob/c138d4705c6c43bbc2cf4244429ff5bfab06d396/homepage.jpg).
![Image Alt](https://github.com/MilkandToast/QuickNotesPOE/blob/c138d4705c6c43bbc2cf4244429ff5bfab06d396/noteadded.jpg).

Adding a note
![Image Alt](https://github.com/MilkandToast/QuickNotesPOE/blob/3f4fee8ce5703aa8eb5deaf3cd652383dd40237e/add%20notes.jpg).
links to youtube videos 
prototype part 2
https://youtube.com/shorts/w35cknovIUo?feature=share
Final Presentaion
https://youtu.be/HesU35DfUWY
