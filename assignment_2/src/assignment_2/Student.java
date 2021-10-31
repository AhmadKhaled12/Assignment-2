package assignment_2;
public class Student
{
    String name;
    private int student_id;
    double student_GPA;
    
    
    public void set_name(String n)
    {
        this.name = n;
    }
    
    public String get_name()
    {
        return this.name;
    }
    
    public void set_id (int id)
    {
        student_id = id;
    }
    public int get_id()
    {
        return this.student_id;
    }
    public void set_GPA (double GPA)
    {
        student_GPA = GPA;
    }
    
    public void get_GPA()
    {
        if (this.student_GPA < 0 || this.student_GPA > 4)
            System.out.println("The GPA is invalid.");
        else 
            System.out.println("The GPA: " + this.student_GPA);
    }
    
    public void dispaly_info()
    {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.student_id);
        System.out.println("GPA: " + this.student_GPA);
    }
    
}
