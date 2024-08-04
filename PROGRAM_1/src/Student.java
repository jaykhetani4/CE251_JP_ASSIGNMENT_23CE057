public class Student
{
    //attributes
    private int studenId;
    private String name;
    private int age;
    private  String department;

    //methods & constructor;
    Student(int studenId,String name,int age,String department)
    {
        this.studenId = studenId;
        this.name = name;
        this.age = age;
        this.department = department;
    }// to set the data

    public int getStudenId()
    {
        return studenId;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getDepartment()
    {
        return department;
    }
    public String toString()
    {
        return "Student Id : " + getStudenId() + " Name : " + getName() + " Age : " + getAge() + " Department : " + getDepartment();
    }
}
