package assignment_1;
public class Assignment_1
{
    public static void main(String[] args)
    {
        person p1 = new person("Ahmad");
        System.out.println(p1.toString());
        
        System.out.println();
        
        Student s1 = new Student("Ibrahim");
        System.out.println(s1.toString());
        
        System.out.println();
        
        Employee e1 = new Employee("Mahmoud");
        System.out.println(e1.toString());
        
        System.out.println();
        
        Faculty f1 = new Faculty("FCI");
        System.out.println(f1.toString());
        
        System.out.println();
        
        Staff st1 = new Staff("Amr");
        System.out.println(st1.toString());
    }
    
}
