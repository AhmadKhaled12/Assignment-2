package assignment_2;
public class Assignment_2 {
    public static void main(String[] args) 
    {
        address add = new address(14, "Menia", "Egypt");
        
        Student s1 = new Student();
        s1.set_name("Ahamd");
        s1.set_id(12);
        s1.set_GPA(3.4);
        s1.dispaly_info();
        
        System.out.println();
        
        Subject sub1 = new Subject();
        sub1.set_name("Software development");
        sub1.set_id(20);
        sub1.set_hours(3);
        sub1.dispaly_info();
        
        System.out.println();
        
        System.out.println("Address: " + add.street_no + "-" + add.city + "-" + add.country);
        
    }
    
}
