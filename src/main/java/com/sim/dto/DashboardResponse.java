package com.sim.dto;

public class DashboardResponse {

    private long students;
    private long faculty;
    private long courses;
    private long departments;

    public DashboardResponse() {
    }

    public DashboardResponse(
            long students,
            long faculty,
            long courses,
            long departments) {

        this.students = students;
        this.faculty = faculty;
        this.courses = courses;
        this.departments = departments;
    }

    public long getStudents() {
        return students;
    }

    public void setStudents(long students) {
        this.students = students;
    }

    public long getFaculty() {
        return faculty;
    }

    public void setFaculty(long faculty) {
        this.faculty = faculty;
    }

    public long getCourses() {
        return courses;
    }

    public void setCourses(long courses) {
        this.courses = courses;
    }

    public long getDepartments() {
        return departments;
    }

    public void setDepartments(long departments) {
        this.departments = departments;
    }
}