package day26lambdautil;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        CourseLambdaWithObjects courseTurkishDay = new CourseLambdaWithObjects("Summer", "Turkish Day", 97, 128);
        CourseLambdaWithObjects courseTurkishNight = new CourseLambdaWithObjects("Winter", "Turkish Night", 98, 154);
        CourseLambdaWithObjects courseEnglishDay = new CourseLambdaWithObjects("Spring", "English Day", 95, 132);
        CourseLambdaWithObjects courseEnglishNight = new CourseLambdaWithObjects("Winter", "English Night", 93, 144);


        List<CourseLambdaWithObjects> courseList = new ArrayList<>(); // LAMBDADA KULLANABILMEK ICIN BIR LISTE CEVIRDIK
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        // System.out.println(courseList);
        //[Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', averageScore=98, numberOfStudents=154},
        // Course{season='Spring', courseName='English Day', averageScore=95, numberOfStudents=132},
        // Course{season='Winter', courseName='English Night', averageScore=93, numberOfStudents=144}]

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz.

        boolean result1 = courseList.stream().allMatch(t -> t.getAverageScore() > 91);
        // allMatch(); bir boolean döndürür. stream, verilen şartlara uyuyor mu uymuyor mu kontrol eder.

        //AllMatch methodu parantez icinde verilen sarta streamdeki tum elemanlarin bu sarta uymasi durumunda true verir


        //2)Tum kurslardaki ögrenci sayilarinin larin 100 den buyuk olup olmadigini kontrol kodu yaziniz
        boolean result2 = courseList.stream().allMatch(t -> t.getNumberOfStudents() > 100);
        System.out.println(result2);


        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result3 = courseList.stream().anyMatch(t -> t.getCourseName().contains("Turkish"));
        System.out.println(result3);
        // anyMatch(); methodu parantez icinde verilen sarta streamdeki herhangi bir elemanin bu sarta uymasi durumunda true verir
        // anyMatch(); bir boolean döndürür.

        //4)dönem isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result4 = courseList.stream().anyMatch(t -> t.getSeason().contains("Summer"));

        //5) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result5 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println(result5);

        //NoneMatch methodu parantez icinde verilen sarta streamdeki hicbir elemanin bu sarti saglamamasi durumunda true verir

        //6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result6 = courseList.stream().noneMatch(t -> t.getCourseName().contains("German"));
        System.out.println(result6);




    }

}
