package assignment_2;
public class Subject extends Student
{
    int subject_id;
    String subject_name;
    double subject_hours;
    
    @Override
    public void set_name(String n)
    {
        this.subject_name = n;
    }
    
    @Override
    public String get_name()
    {
        return this.subject_name;
    }

    
    @Override
    public void set_id(int id)
    {
        this.subject_id = id;
    }
    
    public void set_hours(double h)
    {
        this.subject_hours = h;
    }
    
    @Override
    public int get_id()
    {
        return this.subject_id;
    }
    
    public void get_hours()
    {
        if (this.subject_hours > 4 || this.subject_hours < 1)
            System.out.println("Too much hours for a subject");
        else
            System.out.println("The subject hours: " + this.subject_hours);
    }
    
    @Override
    public void dispaly_info()
    {
        System.out.println("Subject name: " + this.subject_name);
        System.out.println("subject id: " + this.subject_id);
        System.out.println("subject hours: " + this.subject_hours);
    }
}
