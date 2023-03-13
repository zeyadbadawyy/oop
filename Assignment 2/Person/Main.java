import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mark","alex", 123,"a@gmail.com");
         System.out.println(p1.toString());

        Student s1 = new Student("Ahmed","alex", 123,"b@gmail.com","Freshman");
        System.out.println(s1.toString());

        Employee e1 = new Employee("Mohamed","alex", 123,"c@gmail.com","office",50000,new Date());
        System.out.println(e1.toString());

        Faculty f1 = new Faculty("Yassin","alex", 123,"d@gmail.com","office", 20000, new Date(),12,"CEO");
        System.out.println(f1.toString());

        Staff s = new Staff("Ali","alex", 123,"e@gmail.com","office",1200,new Date(),"Director");
        System.out.println(s.toString());

    }
}