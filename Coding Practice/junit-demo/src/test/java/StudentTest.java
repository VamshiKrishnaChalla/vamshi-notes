import org.example.mockitotest.Student;
import org.example.mockitotest.StudentService;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

public class StudentTest {

    StudentService studentService = Mockito.mock(StudentService.class);
    Student student = new Student(studentService);


    @Test
    public void testStudentClass()
    {
        Mockito.when(studentService.getTotalMarks()).thenReturn(500);
        Mockito.when(studentService.getTotalStudents()).thenReturn(10);
        Assertions.assertEquals(50, student.getAverageMarks());
    }
}
