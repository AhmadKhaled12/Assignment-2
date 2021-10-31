package assignment_1;
import java.util.Date;
public class Employee extends person
{
    String office;
    double Salary;
    Date hiered_date;

    public Employee(String name)
    {
        super(name);
    }
    @Override
    public String toString ()
    {
        return "Class name: Employee. The name of the Employee: " + super.name + "." ;
        
    }
    
}
