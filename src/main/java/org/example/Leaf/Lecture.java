package org.example.Leaf;

import org.example.CourseComponent;

public class Lecture implements CourseComponent {
    private String title;

    public Lecture(String title) {
        this.title = title;
    }

    @Override
    public void displayContent() {
        System.out.println("Lecture: " + title);
    }
}