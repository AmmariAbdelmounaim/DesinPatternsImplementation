# Design Patterns Implementation on an E-Learning Platform Project

## Project Overview

This E-Learning Platform is a Java-based application designed to demonstrate the integration of various design patterns in a complex system. The platform simulates an online course environment, allowing the management of course content and user access based on different states.

## Problem Statement

The challenge was to create a scalable and flexible system that could handle:
- Dynamic course content management.
- User access control based on their progress and status.
- Notification system for course updates.
- Centralized management of all available courses.

## Design Patterns Used

To address these challenges, the following design patterns were implemented:

1. **Composite Pattern**: For managing hierarchical course structures.
2. **State Pattern**: For handling user states (Active, Completed, Locked).
3. **Proxy Pattern**: For controlling access to course content based on user state.
4. **Singleton Pattern**: For a centralized management system of courses (CourseCatalog).
5. **Observer Pattern**: To notify users about updates in course content.

## Implementation

### Directory Structure

The project is organized into the following main directories:
- `Composite`: Contains `CourseSection` and interfaces for course components.
- `Leaf`: Includes leaf components like `Lecture` and `Quiz`.
- `Observer`: Holds the `UserNotificationService` for course update notifications.
- `Proxy`: Contains the `CourseAccessProxy` for access control.
- `Singleton`: Includes the `CourseCatalog` for managing all courses.
- `State`: Contains user state classes and the `User` class.

### Main Components

- **CourseCatalog** (Singleton): Manages all courses on the platform.
- **CourseSection** (Composite): Represents a course with various components.
- **Lecture, Quiz** (Leaf): Basic elements of a course.
- **UserNotificationService** (Observer): Observes and notifies about course updates.
- **CourseAccessProxy** (Proxy): Controls access to courses.
- **User** (State): Represents a user with a specific state.

### Execution Flow

1. Initialize Course Catalog and create course content.
2. Register observers for course updates.
3. Demonstrate user access to courses based on different states.
4. Display all courses in the catalog.

## How to Run

- Ensure Java is installed on your system.
- Clone the repository and navigate to the project directory.
- Compile and run the `Main` class.

[https://lucid.app/lucidchart/1e831f6c-e339-4606-b2e9-90226421a172/edit?viewport_loc=-14922%2C-9424%2C37124%2C17800%2C0_0&invitationId=inv_1308ef3b-b40b-4634-bb64-ec9b07d44495](URL_TO_DIAGRAM)

