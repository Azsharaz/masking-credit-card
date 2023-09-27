package day27lambda;

import day26lambdautil.CourseLambdaWithObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        CourseLambdaWithObjects courseTurkishDay = new CourseLambdaWithObjects("Summer", "Turkish Day", 97, 128);
        CourseLambdaWithObjects courseTurkishNight = new CourseLambdaWithObjects("Winter", "Turkish Night", 98, 154);
        CourseLambdaWithObjects courseEnglishDay = new CourseLambdaWithObjects("Spring", "English Day", 95, 132);
        CourseLambdaWithObjects courseEnglishNight = new CourseLambdaWithObjects("Winter", "English Night", 93, 144);


        List<CourseLambdaWithObjects> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);


        //1)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.
        String name1 = courseList.
                stream().
                sorted(Comparator.comparing(CourseLambdaWithObjects::getAverageScore).reversed()). //sort default olarak natural order'a göre sıralar.
                //  reversed(); ile terse çeviririz.
                        findFirst(). //  findFirst(); ile ilkini alırız.
                        get().
                getCourseName();
        System.out.println(name1);


        //2) Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ikisi haric liste halinde console'a yazdiriniz.
        List<CourseLambdaWithObjects> myList = courseList.
                stream().
                sorted(Comparator.comparing(CourseLambdaWithObjects::getAverageScore)).
                skip(2).  //  skip(); ile istediğimiz sıra kadar atlatabiliriz.
                        collect(Collectors.toList());
        System.out.println(myList);


        //3)Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ucunu liste halinde console'a yazdiriniz.
        List<CourseLambdaWithObjects> yourlist = courseList.
                stream().
                sorted(Comparator.comparing(CourseLambdaWithObjects::getAverageScore)).
                limit(3). //  limit(); ile ne kadarını alacağımızı söyleriz.
                        collect(Collectors.toList());

        // 4) Kursta bulunan ogrenci sayilarina gore buyukten kucuge
        // sirali bir sekilde listin icinde  veren  kodu yaziniz.

        List<CourseLambdaWithObjects> studentList = courseList.
                stream().
                sorted(Comparator.comparing(CourseLambdaWithObjects::getNumberOfStudents).reversed()).
                // reversed(); ile ters çevirip büyükten küçüğe sıralarız.
                        collect(Collectors.toList()); //  collect(); ile Collectors.toList(); ile List'e çevirebiliriz.

        //5) kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz
        long ingilizceBolumSayisi = courseList.
                // count(); listteki istediğimiz şeyin ile sayısını alırız. Long return ettiği için long sepetine atarız.
                        stream().
                filter(t -> t.getCourseName().contains("English")).
                count(); //  count(); listteki istediğimiz şeyin sayısını alırız. Long return ettiği için long sepetine atarız.
        System.out.println("ingilizceBolumSayisi = " + ingilizceBolumSayisi);

        //6)Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

        List<CourseLambdaWithObjects> newCourses = courseList.
                stream().
                filter(t -> t.getNumberOfStudents() < 140).
                collect(Collectors.toList());
        System.out.println(newCourses);







    }

}
