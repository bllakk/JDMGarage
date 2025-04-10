package com.LBWK.SystemLBWK.model;

import java.util.List;

public class ProjectJDM {
    Car car;
    List<Modification> steps;
    Employee leaderProject;
    boolean finished;

    public void initializeProject(Car car, List<Modification> steps, Employee leaderProject) {
        this.car = car;
        this.steps = steps;
        this.leaderProject = leaderProject;
        this.finished = false;
    }

    public void finishProject() {
        this.finished = true;
    }
    public void summarizeProject() {
        System.out.println("Project Summary:");
        System.out.println("com.LBWK.SystemLBWK.model.Car: " + car.getNameProject());
        System.out.println("Leader: " + leaderProject.getName());
        System.out.println("Steps: ");
        for (Modification step : steps) {
            System.out.println("- " + step.getName());
        }
        System.out.println("Finished: " + finished);
    }

    public ProjectJDM(Car car, List<Modification> steps, Employee leaderProject, boolean finished) {
        this.car = car;
        this.steps = steps;
        this.leaderProject = leaderProject;
        this.finished = finished;
    }

    public Car getCar() {
        return car;
    }

    public List<Modification> getSteps() {
        return steps;
    }

    public Employee getLeaderProject() {
        return leaderProject;
    }

    public boolean isFinished() {
        return finished;
    }
}
