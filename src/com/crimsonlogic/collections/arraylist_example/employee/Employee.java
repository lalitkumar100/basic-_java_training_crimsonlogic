package com.crimsonlogic.collections.arraylist_example.employee;

public class Employee {

    private  int empId;
    private String name;
    String department;
    double salalry;
    int experience;
    String  email;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalalry() {
        return salalry;
    }

    public void setSalalry(double salalry) {
        this.salalry = salalry;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(){

    }
    public Employee(int empId, String name, String department, double salalry, int experience, String email) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salalry = salalry;
        this.experience = experience;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "EmpId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salalry=" + salalry +
                ", experience=" + experience +
                ", email='" + email + '\'' +
                '}';
    }
}
