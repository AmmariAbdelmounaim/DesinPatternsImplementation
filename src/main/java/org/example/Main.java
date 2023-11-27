package org.example;

import org.example.Composite.CourseSection;
import org.example.Leaf.Lecture;
import org.example.Leaf.Quiz;
import org.example.Observer.UserNotificationService;
import org.example.Proxy.CourseAccessProxy;
import org.example.Singleton.CourseCatalog;
import org.example.State.ActiveState;
import org.example.State.LockedState;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing Course Catalog...");

        // Create the Singleton instance of CourseCatalog.
        CourseCatalog courseCatalog = CourseCatalog.getInstance();

        System.out.println("Creating course content for 'Design Patterns' course...");

        // Create a new course section and add components to it.
        CourseSection mainCourse = new CourseSection("Design Patterns");
        mainCourse.addComponent(new Lecture("Composite Pattern"));
        mainCourse.addComponent(new Lecture("State Pattern"));
        mainCourse.addComponent(new Quiz("Design Patterns Quiz"));

        // Initialize the observer for course updates.
        UserNotificationService notificationService = new UserNotificationService();

        // Register the observer to the mainCourse.
        mainCourse.registerObserver(notificationService);

        System.out.println("Adding a new lecture 'Proxy Pattern' to the course...");
        // Add a new lecture which triggers notifications to observers.
        mainCourse.addComponent(new Lecture("Proxy Pattern"));

        System.out.println("Adding 'Design Patterns' course to the catalog...");
        // Add the course to the CourseCatalog.
        courseCatalog.addCourse("Design Patterns Course", mainCourse);

        System.out.println("Creating a user with Active State...");
        // Create a user in an 'Active' state.
        User user = new User(new ActiveState());

        System.out.println("Accessing course content through proxy with Active User...");
        // Use a proxy to control course content access.
        CourseComponent courseProxy = new CourseAccessProxy(courseCatalog.getCourse("Design Patterns Course"), user);
        // User accesses course content.
        courseProxy.displayContent();

        System.out.println("\nDisplaying all courses in the catalog:");
        // Display all courses in the catalog.
        courseCatalog.displayAllCourses();

        System.out.println("\nChanging user state to 'Locked'...");
        // Change the user's state to 'Locked'.
        user.setState(new LockedState());

        System.out.println("Accessing course content through proxy with Locked User...");
        // Attempt to access the course content again with a locked user.
        courseProxy.displayContent();
    }
}
