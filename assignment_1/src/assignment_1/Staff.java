package assignment_1;
public class Staff extends Employee
{
    String title;

    public Staff(String name)
    {
        super(name);
    }
    @Override
    public String toString ()
    {
        return "Class name: Staff. The name of Staff member: " + super.name +"." ;
        
    }
    
}
