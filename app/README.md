# Study Companion App

## Project Overview
Study Companion is a native Android application developed using **Kotlin** and **XML**. It is designed to help students manage their study topics efficiently. The core focus of this submission is on **State Management**, ensuring that user data (notes) persists across configuration changes (screen rotation) and system-initiated process death using Android Jetpack components.

## Features Implemented
1.  **Create Notes:** Users can input a title and description to create a new study note.
2.  **Dynamic List View:** A professional list display using `RecyclerView` and `MaterialCardView`.
3.  **State Preservation (Core Feature):**
    * **Rotation Support:** Data is retained when switching between Portrait and Landscape modes.
    * **Process Death Handling:** Utilizes `SavedStateHandle` within the ViewModel to save and restore data if the Android OS kills the app in the background to reclaim memory.
4.  **Material Design UI:** Clean and modern user interface complying with Material 3 guidelines.

## Tech Stack
* **Language:** Kotlin
* **UI Toolkit:** XML Layouts & Material Components
* **Architecture:** MVVM (Model-View-ViewModel)
* **State Management:** ViewModel, LiveData, SavedStateHandle
* **List Management:** RecyclerView

## Navigation & User Flow
The application follows a single-activity architecture optimized for quick note-taking:

1.  **Launch:** User opens the app and lands on the **Home Dashboard**.
2.  **Input:** User taps the "Enter Topic" text field at the top of the screen.
3.  **Action:** User clicks the **"ADD"** button.
    * *System Logic:* The input is validated -> Sent to ViewModel -> Added to State -> List Updates.
4.  **View:** The new note appears instantly in the scrollable list below.
5.  **Rotation/State Test:**
    * User rotates the device.
    * The Activity recreates, but the list remains intact (served from ViewModel).

## How to Run
1.  Open the project in **Android Studio (Ladybug or Koala)**.
2.  Sync Gradle files to ensure all dependencies are downloaded.
3.  Select an Emulator (API 35/36) or a Physical Device.
4.  Click **Run (Green Play Button)**.

## Future Scope (Planned Features)
* Implementation of Quiz Module using Room Database.
* Topic filtering and search capabilities.
* Dark Mode toggle.

---
**Student Name:** [Saad-Ur-Rehman]
**Roll Number:** [2212349]