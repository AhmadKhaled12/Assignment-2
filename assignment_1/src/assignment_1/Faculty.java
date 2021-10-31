package assignment_1;
public class Faculty extends Employee 
{
    double office_hours;
    String rank;

    public Faculty(String name) 
    {
        super(name);
    }
    @Override
    public String toString ()
    {
        return "Class name: Faculty. The name of the Faculty: " + super.name + "." ;
        
    }
}
