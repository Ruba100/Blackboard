/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard1;

/**
 *
 * @author roals
 */
public class Grade {

    private String nameOfstudent;
    private double grade;
    private int IDofStudnt;
 
    public Grade() {
    }

    public Grade(String nameOfstudent, double grade, int IDofStudnt) {
        this.nameOfstudent = nameOfstudent;
        this.grade = grade;
        this.IDofStudnt = IDofStudnt;
     }

    public String getNameOfstudent() {
        return nameOfstudent;
    }

    public double getGrade() {
        return grade;
    }

    public int getIDofStudnt() {
        return IDofStudnt;
    }

    public void setNameOfstudent(String nameOfstudent) {
        this.nameOfstudent = nameOfstudent;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setIDofStudnt(int IDofStudnt) {
        this.IDofStudnt = IDofStudnt;
    }

    @Override
    public String toString() {
        return "Grade{" + "nameOfstudent=" + nameOfstudent + ", grade=" + grade + ", IDofStudnt=" + IDofStudnt + '}';
    }
    
    

}
