package org.example;

public class Student {
    private String name;
    private String email;
    private int studentId;

    public Student(){

    }

    public Student(String name,String email,int studentId){
        this.name=name;
        this.email=email;
        this.studentId=studentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
}
