package org.example.Composite;

import org.example.CourseComponent;
import org.example.Observer.Observable;
import org.example.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CourseSection implements CourseComponent, Observable {
    private List<CourseComponent> components = new ArrayList<CourseComponent>();
    private String sectionTitle;

    //Observer
    private List<Observer> observers = new ArrayList<>();
    public CourseSection(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public void addComponent(CourseComponent component) {
        components.add(component);
        notifyObservers();
    }

    @Override
    public void displayContent() {
        System.out.println("Section: " + sectionTitle);
        for (CourseComponent component : components) {
            component.displayContent();
        }
    }
    public String getSectionTitle(){
        return this.sectionTitle;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
