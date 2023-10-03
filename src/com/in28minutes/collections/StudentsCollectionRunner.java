package com.in28minutes.collections;

import java.util.*;

class AscendingStudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {

        List<Student> students = List.of(new Student(1, "a"), new Student(2, "b"), new Student(3, "c"));
        System.out.println(students);

        ArrayList<Student> studentsAl = new ArrayList<>(students);
        studentsAl.add(new Student(10,"d"));
        studentsAl.add(new Student(5, "e"));
        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("내림차순 "+studentsAl);

        //Collections.sort(studentsAl,new AscendingStudentComparator());
        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("오름차순 "+studentsAl);
    }
}
