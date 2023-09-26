class Person{
    private String name;
    private String gender;
    private String phone;

    // creating a constructor
    public Person(String name,String gender,String phone){
        this.name = name;
        this.gender =gender;
        this.phone = phone;
    }

    public void displayPerson(){
        System.out.println("Gender : " + this.gender);
        System.out.println("Name : " + this.name);
        System.out.println("Phone : " + this.phone);

    }
}

class Student extends Person{
    private int roll;
    private String faculty;
    private String grade;
    // to call constructor of parent class, super keyword should be use

    public Student(int roll, String faculty, String grade, String name, String gender, String phone){
        //calling constructor of super class
        super(name, gender, phone);
        this.roll = roll;
        this.faculty = faculty;
        this.grade = grade;
    }

    public void displayStudent(){
        System.out.println("Roll no " + this.roll );
        System.out.println("Grade is " + this.grade );
        System.out.println("Faculty is " + this.faculty );

    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s1= new Student(1, "csit", "A", "Ritik", "Male", "98423423");
        s1.displayPerson();
        s1.displayStudent();

    }
}
