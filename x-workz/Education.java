package com.assesments.java;
public class Education {
    String degree;
    String university;
    int graduationYear;
    String specialization;

    public Education(String degree, String university, int graduationYear, String specialization) {
        this.degree = degree;
        this.university = university;
        this.graduationYear = graduationYear;
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("            Education: Degree: " + degree + ", University: " + university + ", Graduation Year: " + graduationYear + ", Specialization: " + specialization);
    }
}