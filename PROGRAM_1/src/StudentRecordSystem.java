public class StudentRecordSystem
{
    //attributes
    private Student students[] = new Student[100];
    private int count;
    private int top = 0;

    //methods & constructor
    StudentRecordSystem()
    {
        count = 0;
    }
    public void addStudent(Student student)
    {
        count++;
        top += 1;
        students[top] = student;
    }
    public void getStudent(int studentId)
    {
        int i;
        boolean check = false;
        for(i = 1 ; i<=count ; i++)
        {
            if(students[i].getStudenId() == studentId)
            {
                System.out.println(students[i]);
                check = true;
            }
        }
        if(check != true)
        {
            System.out.println("Error : Id not found!!");
        }
    }
    public void displayAllStudents()
    {
        int i;
        for(i = 1 ; i<=count ; i++)
        {
            System.out.println(students[i]);
        }
    }
}
