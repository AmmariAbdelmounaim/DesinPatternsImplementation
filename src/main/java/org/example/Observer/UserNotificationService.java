package org.example.Observer;

import org.example.Composite.CourseSection;

public class UserNotificationService implements Observer{
        @Override
        public void update(Observable observable) {
            if (observable instanceof CourseSection) {
                CourseSection courseSection = (CourseSection) observable;
                System.out.println("Notification: Course '" + courseSection.getSectionTitle() + "' has been updated.");
            }
        }

}
