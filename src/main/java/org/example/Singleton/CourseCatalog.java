package org.example.Singleton;

import org.example.Composite.CourseSection;

import java.util.HashMap;
import java.util.Map;

public class CourseCatalog {
    private static CourseCatalog instance = null;
    private Map<String, CourseSection> courses;

    private CourseCatalog() {
        courses = new HashMap<>();
    }

    public static CourseCatalog getInstance() {
        if (instance == null) {
            instance = new CourseCatalog();
        }
        return instance;
    }

    public void addCourse(String courseName, CourseSection course) {
        courses.put(courseName, course);
    }

    public CourseSection getCourse(String courseName) {
        return courses.get(courseName);
    }

    // Method to display all courses
    public void displayAllCourses() {
        for (String courseName : courses.keySet()) {
            System.out.println("Course: " + courseName);
            courses.get(courseName).displayContent();
        }
    }
}
