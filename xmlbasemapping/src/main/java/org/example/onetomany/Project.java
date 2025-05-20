package org.example.onetomany;

public class Project {

    private long id;

    private String name;

    private long duration;

    private String description;

    private Employee employee;


    public Project() {
    }

    public Project(long id, String name, long duration, String description, Employee employee) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.description = description;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
