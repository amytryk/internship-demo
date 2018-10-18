import com.internship.dao.StudentDao;
import com.internship.dao.UniversityDao;
import com.internship.dao.impl.StudentDaoImpl;
import com.internship.dao.impl.UniversityDaoImpl;
import com.internship.model.Knowledge;
import com.internship.model.Student;
import com.internship.model.University;
import com.internship.service.StudentService;
import com.internship.service.UniversityService;
import com.internship.service.impl.StudentServiceImpl;
import com.internship.service.impl.UniversityServiceImpl;

public class Application {
    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();
        StudentService studentService = new StudentServiceImpl(studentDao);

        UniversityDao universityDao = new UniversityDaoImpl();
        UniversityService universityService = new UniversityServiceImpl(universityDao);

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


    }
}
