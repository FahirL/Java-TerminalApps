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
public class Test {

    private String subject;  //predmet
    private String nameTest;
    private int numberQuestions;
    private double numberCorrectAnswers;

    public String getSubject() {
        return subject;
    }

    public String getNameTest() {
        return nameTest;
    }

    public int getNumberQuestions() {
        return numberQuestions;
    }

    public double getNumberCorrectAnswers() {
        return numberCorrectAnswers;
    }

    public double getNumberNotCorrectAnswers() {
        return numberQuestions - numberCorrectAnswers;
    }

    public double getNumberPoints() {

        return 30. * getNumberCorrectAnswers() / getNumberQuestions();
    }

    public Test(String subject, String nameTest, int numberQuestions, double numberCorrectAnswers) {
        this.subject = subject;
        this.nameTest = nameTest;
        this.numberQuestions = numberQuestions;
        this.numberCorrectAnswers = numberCorrectAnswers;
    }

    public enum RESULT_TEST {
        NOT_PASSED, CONDITIONALLY_PASSED, PASSED
    };

    public RESULT_TEST evaluateTest() {
        double points = getNumberPoints();

        if (points < 11) {
            return RESULT_TEST.NOT_PASSED;
        } else if (points >= 11 && points < 17) {
            return RESULT_TEST.CONDITIONALLY_PASSED;
        } else {
            return RESULT_TEST.PASSED;
        }
    }

    @Override
    public String toString() {
        String infoReview = "";

        RESULT_TEST result = evaluateTest();

        switch (result) {
            case NOT_PASSED:
                infoReview = "Not passed.";
                break;
            case CONDITIONALLY_PASSED:
                infoReview = "Conditionally passed.";
                break;
            case PASSED:
                infoReview = "Passed.";
                break;

        }
        
        return String.format("%-30s\t%-30s\t%6.2f / %3d\t%.2f\t%s", getSubject(), getNameTest(), getNumberCorrectAnswers(), getNumberQuestions(), getNumberPoints(), infoReview);
        
    }
}   

