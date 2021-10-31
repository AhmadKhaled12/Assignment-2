package assignment_1;
public class person
{
    String name;
    String address;
    String email_address;
    int phone_number;
    
    public person(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString ()
    {
        return "Class name: person. The name of the person: " + this.name + "." ;
        
    }
    
    
    
}
