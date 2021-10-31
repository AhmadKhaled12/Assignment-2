package assignment_1;
public class Student extends person
{
    String status;
    
    public Student(String name)
    {
        super(name);
    }
    
    @Override
    public String toString ()
    {
        return "Class name: Student. The name of the Student: " + super.name + "." ;
        
    }
    
}
