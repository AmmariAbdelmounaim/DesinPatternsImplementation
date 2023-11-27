package org.example.State;

import org.example.Composite.CourseSection;
import org.example.State.CourseState;
import org.example.User;

public class ActiveState implements CourseState {
    @Override
    public void accessCourseContent(User user, CourseSection section) {
        System.out.println("User is active. Accessing content.");
        section.displayContent();
    }
}