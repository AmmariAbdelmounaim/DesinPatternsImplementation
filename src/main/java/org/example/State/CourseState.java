package org.example.State;

import org.example.Composite.CourseSection;
import org.example.User;

public interface CourseState {
    void accessCourseContent(User user, CourseSection section);
}
