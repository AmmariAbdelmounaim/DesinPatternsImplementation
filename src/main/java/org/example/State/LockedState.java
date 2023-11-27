package org.example.State;

import org.example.Composite.CourseSection;
import org.example.State.CourseState;
import org.example.User;

public class LockedState implements CourseState {
    @Override
    public void accessCourseContent(User user, CourseSection section) {
        System.out.println("Course is locked for this user.");
        // Implement locked course logic
    }
}