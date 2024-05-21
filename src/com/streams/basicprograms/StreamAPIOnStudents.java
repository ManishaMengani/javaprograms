package com.streams.basicprograms;

import com.streams.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIOnStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Manisha", 28));
        students.add(new Student(2, "James", 60));
        students.add(new Student(3, "Michael", 35));
        students.add(new Student(4, "Richard", 20));
        students.add(new Student(5, "John", 16));
        students.add(new Student(6, "Michael", 29));
        students.add(new Student(7, "James", 22));

        //1.print all students whose age is > 50
        List<Student> ageGreaterThanFifty = students.stream().filter(e->e.getAge()>50).collect(Collectors.toList());
        for(Student student : ageGreaterThanFifty){
            System.out.println(student.getAge() + " " + student.getName());
        }


        //2. print all students whose names starts with J
        students.stream().filter(e->e.getName().startsWith("J")).forEach(e->System.out.print(e.getName() + " "));
        System.out.println();

        //3. Get names of all students
        students.stream().map(e->e.getName()).forEach(e->System.out.print(e + " "));
        System.out.println();

        //4. Get ages of all students
        students.stream().map(e->e.getAge()).forEach(e->System.out.print(e + " "));
        System.out.println();

        //5. Sort all students based on age
        students.stream().sorted().forEach(e->System.out.print(e.getName() + " "));
        System.out.println();

        Comparator<Student> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        students.stream().sorted(nameComparator).forEach(e->System.out.print(e.getName() + " "));

        Student s1 = new Student(1, "Manisha", 28);
        Student s2 = new Student(2, "James", 60);
        Student s3 = new Student(1, "Manisha", 28);
        Student s4 = s2;
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //true
        System.out.println(s4.equals(s2)); //true












    }
}
