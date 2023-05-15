import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student 
{
    private int id;
    private String name;
    private int roll;

    public Student(int id, String name, int roll) 
    {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getRoll() 
    {
        return roll;
    }

    public static void main(String[] args) 
    {
        // create a new list of students
        List<Student> students = new ArrayList<>();

        // add some students to the list
        students.add(new Student(1, "Tushar", 103));
        students.add(new Student(2, "Vinayak", 102));
        students.add(new Student(3, "Onkar", 202));

        // sort the list based on roll number
        Collections.sort(students, Comparator.comparingInt(Student::getRoll));

        // print the sorted list
        for (Student student : students) 
        {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Roll: " + student.getRoll());
        }
    }
}
