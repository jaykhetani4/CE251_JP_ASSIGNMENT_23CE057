import java.sql.SQLOutput;
import java.util.Scanner;
class StudentRecordMGMT
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StudentRecordSystem R = new StudentRecordSystem();
        int Preferance;
        do
        {
            System.out.println(" [1] ADD NEW STUDENT \n [2]GET STUDENT BY ID \n [3]DISPLAY ALL STUDENTS \n [4]EXIT");
            System.out.print(" Enter Your Choice: ");
            Preferance = input.nextInt();
            switch(Preferance)
            {
                case 1:
                {
                    System.out.println();
                    System.out.print("Enter Student Id: ");
                    int studentId = input.nextInt();
                    System.out.print("Enter Student Name: ");
                    String name = input.next();
                    System.out.print("Enter Student age: ");
                    int age = input.nextInt();
                    System.out.print("Enter Department: ");
                    String department = input.next();
                    Student S = new Student(studentId,name,age,department);
                    R.addStudent(S);
                }
                break;
                case 2:
                {
                    System.out.print("Enter Student Id: ");
                    int studentId = input.nextInt();
                    R.getStudent(studentId);
                }
                break;
                case 3:
                {
                    R.displayAllStudents();
                }
                break;
                case 4:
                {
                    System.out.println("By Jay Khetani - 23CE057");
                    System.exit(0);
                }
                break;
                default:
                {
                    System.out.println("Error : Enter A Valid Choice!!");
                }
            }
        }while(Preferance != 4);
    }
}