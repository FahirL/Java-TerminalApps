/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssessmentStudents;

/**
 *
 * @author FahirL
 */
public class Student {
    
    private String name, lastname, index, email;
    private int yearEnrollment;
    
    private final int MAX_NUMBER_TESTS = 480;
    
    private Test[] testsStudent = new Test[MAX_NUMBER_TESTS];
    private int indexNextTest = 0;
    
    public void recordTest(Test test) {
        if (indexNextTest < MAX_NUMBER_TESTS) {
            testsStudent[indexNextTest] = test;
            indexNextTest++;
        }
    }
    
    public void displayResultTests() {
        System.out.println("Result tests student: " + getName() + " " + getLastname() + " (" + getIndex() +  ")");
        for (int i = 0; i < indexNextTest; i++) {
            System.out.println(testsStudent[i]);
        }
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIndex() {
        return index;
    }

    public int getYearEnrollment() {
        return yearEnrollment;
    }

    public Student(String name, String lastname, String index, String email) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
        this.email = email;
        
        if(index.length() == 10 &&
           Character.isDigit(index.charAt(0)) &&
           Character.isDigit(index.charAt(1)) &&
           Character.isDigit(index.charAt(2)) &&
           Character.isDigit(index.charAt(3))) {
           this.yearEnrollment = Integer.parseInt(index.substring(0, 4));
        }
                
    }
    

}
