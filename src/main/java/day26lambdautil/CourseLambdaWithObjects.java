package day26lambdautil;

public class CourseLambdaWithObjects {
       /*
    Icinde
    1) private variable lar
    2) Parametreli ve parametresiz constructorlar
    3) getterler ve setterlar
    4) toString() methodu
    barindiran classlara POJO class denir
    POJO ==> Plain Old Java Object
     */

    private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    public CourseLambdaWithObjects(String season, String courseName, int averageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public CourseLambdaWithObjects() {
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }


}
