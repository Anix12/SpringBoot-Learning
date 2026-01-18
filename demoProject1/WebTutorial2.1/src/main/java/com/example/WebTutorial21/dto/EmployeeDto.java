package com.example.WebTutorial21.dto;

public class EmployeeDto {

    private long employee_id;

    private String name;

    private int age;

    private boolean active;

    public EmployeeDto(long employee_id, String name, int age, boolean active){
        this.employee_id=employee_id;
        this.name=name;
        this.age=age;
        this.active=active;
    };

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
