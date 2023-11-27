package org.example.Leaf;

import org.example.CourseComponent;

public class Quiz implements CourseComponent {
    private String name;

    public Quiz(String name) {
        this.name = name;
    }

    @Override
    public void displayContent() {
        System.out.println("Quiz: " + name);
    }
}