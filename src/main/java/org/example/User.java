package org.example;

import org.example.Composite.CourseSection;
import org.example.State.CourseState;

public class User {
    private CourseState state;

    public User(CourseState state) {
        this.state = state;
    }

    public void setState(CourseState state) {
        this.state = state;
    }
    public CourseState getState() {
        return this.state;
    }

    public void accessCourse(CourseSection section) {
        state.accessCourseContent(this, section);
    }
}