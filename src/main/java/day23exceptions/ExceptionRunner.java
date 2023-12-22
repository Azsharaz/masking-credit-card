package day23exceptions;

public class ExceptionRunner {

    public static void main(String[] args) {
        getStudentGrade(115);


        // peki bu hatayı handle etmek için?
        getTheNumberOfStudents(-50); // . ile bası .try dediğimizdetry catch methodu otomatik gelir
        try {
            getTheNumberOfStudents(-50);
        } catch (InvalidNumberException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("*************");


    }

    private static void getStudentGrade(int grade) {
    }

  /*  public static void getStudentGrade(int grade) {
        if (grade < 0 || grade > 100) {
            try {
                throw new InvalidStudentsGradeException("Students grades cannot be less than zero or greater than 100");
                //Compiletime error verdiği için try catch yaptık yoksa direkt verecekti
            } catch (InvalidStudentsGradeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println(grade);
        }

    }

   */


    public static void getTheNumberOfStudents(int numOfStudents) {

        if (numOfStudents < 0) {
            throw new InvalidNumberException("Geçersiz not");
        } else {
            System.out.println(numOfStudents);
        }


    }


}