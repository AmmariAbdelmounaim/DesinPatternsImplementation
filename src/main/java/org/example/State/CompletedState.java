package org.example.State;

import org.example.Composite.CourseSection;
import org.example.State.CourseState;
import org.example.User;

public class CompletedState implements CourseState {
    @Override
    public void accessCourseContent(User user, CourseSection section) {
        System.out.println("User has completed the course.");
        // Implement completed course logic
    }
}