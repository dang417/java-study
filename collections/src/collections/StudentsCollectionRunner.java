package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
        System.out.println(students);

        List<Student> studentsAl = new ArrayList<>(students);

        Collections.sort(studentsAl);
        System.out.println(studentsAl);

        Collections.sort(studentsAl, new AscendingStudentComparator());
        System.out.println(studentsAl);

        studentsAl.sort(new AscendingStudentComparator());
    }
}
