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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Test test1 = new Test("Programming 1", "1. colloquium", 30, 2);
        Test test2 = new Test("Programming 1", "1. colloquium", 50, 21);
        System.out.println(test1);
        System.out.println(test2); */
      
        Student s = new Student("Max", "Maxlow", "21516156", "max_maxlow@email.com");

        s.recordTest(new Test("Programming 1", "1. colloquium", 30, 20));
        s.recordTest(new Test("Programming 1", "2. colloquium", 30, 16));
        s.recordTest(new Test("Programming 1", "Final exam", 30, 10));
        s.recordTest(new Test("Data Base", "1. colloquium", 30, 17));
        s.recordTest(new Test("Data Base", "2. colloquium", 30, 11));
        s.recordTest(new Test("Data Base", "Final exam", 100, 80));
        s.recordTest(new Test("Internet and web", "Project and electornic test", 200, 170));
        
        s.displayResultTests();
    }

}
