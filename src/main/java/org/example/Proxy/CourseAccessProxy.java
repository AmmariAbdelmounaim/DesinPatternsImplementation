package org.example.Proxy;

import org.example.CourseComponent;
import org.example.State.ActiveState;
import org.example.State.CompletedState;
import org.example.User;

public class CourseAccessProxy implements CourseComponent {
    private CourseComponent realCourseSection;
    private User user;

    public CourseAccessProxy(CourseComponent realCourseSection, User user) {
        this.realCourseSection = realCourseSection;
        this.user = user;
    }

    @Override
    public void displayContent() {
        if (user.getState() instanceof ActiveState || user.getState() instanceof CompletedState) {
            realCourseSection.displayContent();
        } else {
            System.out.println("Access Denied. User state does not permit access.");
        }
    }
}
