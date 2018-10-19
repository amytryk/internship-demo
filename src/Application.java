import com.internship.dao.InternshipDao;
import com.internship.dao.StudentDao;
import com.internship.dao.UniversityDao;
import com.internship.dao.impl.InternshipDaoImpl;
import com.internship.dao.impl.StudentDaoImpl;
import com.internship.dao.impl.UniversityDaoImpl;
import com.internship.model.Internship;
import com.internship.model.Knowledge;
import com.internship.model.Student;
import com.internship.model.University;
import com.internship.service.InternshipService;
import com.internship.service.StudentService;
import com.internship.service.UniversityService;
import com.internship.service.impl.InternshipServiceImpl;
import com.internship.service.impl.StudentServiceImpl;
import com.internship.service.impl.UniversityServiceImpl;

import java.util.List;

public class Application {

    public static void display(List<Student> students) {
        System.out.format("%-5s%-25s%-11s\n", "Id", "Name", "Knowledge");
        students.forEach(student -> System.out.format("%-5d%-25s%-11d\n", student.getId(), student.getName(), student.getKnowledge().getLevel()));
    }

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();
        StudentService studentService = new StudentServiceImpl(studentDao);

        UniversityDao universityDao = new UniversityDaoImpl();
        UniversityService universityService = new UniversityServiceImpl(universityDao);

        InternshipDao internshipDao = new InternshipDaoImpl();
        InternshipService internshipService = new InternshipServiceImpl(internshipDao);

        Knowledge knowledge1 = new Knowledge(1, 45);
        Knowledge knowledge2 = new Knowledge(2, 65);
        Knowledge knowledge3 = new Knowledge(3, 99);
        Knowledge knowledge4 = new Knowledge(4, 35);
        Knowledge knowledge5 = new Knowledge(5, 30);
        Knowledge knowledge6 = new Knowledge(6, 100);
        Knowledge knowledge7 = new Knowledge(7, 78);
        Knowledge knowledge8 = new Knowledge(8, 50);

        Student student1 = new Student(1, "Natalia Boiko", knowledge1);
        Student student2 = new Student(2, "Andrii Shevchenko", knowledge2);
        Student student3 = new Student(3, "Andrew Kostenko", knowledge3);
        Student student4 = new Student(4, "Julia Veselkina", knowledge4);
        Student student5 = new Student(5, "Maria Perechrest", knowledge5);
        Student student6 = new Student(6, "Maria Moroz", knowledge6);
        Student student7 = new Student(7, "Ihor Lysenko", knowledge7);
        Student student8 = new Student(8, "Mykola Kushnir", knowledge8);

        studentService.add(student1);
        studentService.add(student2);
        studentService.add(student3);
        studentService.add(student4);
        studentService.add(student5);
        studentService.add(student6);
        studentService.add(student7);
        studentService.add(student8);

        University university = new University(1, "CSE");
        University university1 = new University(2, "Oxford");

        universityService.add(university);
        universityService.add(university1);

        universityService.addStudent(1, student1);
        universityService.addStudent(1, student2);
        universityService.addStudent(1, student3);
        universityService.addStudent(1, student4);
        universityService.addStudent(2, student5);
        universityService.addStudent(2, student6);
        universityService.addStudent(2, student7);
        universityService.addStudent(2, student8);

        List<Student> studentsByKnowledgeCSE = universityService.getStudentsByKnowledge(1, 50);
        List<Student> studentsByKnowledgeOxford = universityService.getStudentsByKnowledge(2, 50);

        Internship internship = new Internship(1, "Interlink");

        internshipService.add(internship);

        internshipService.addStudents(1, studentsByKnowledgeCSE);
        internshipService.addStudents(1, studentsByKnowledgeOxford);

        display(internshipService.getAllStudents(1));


    }
}
