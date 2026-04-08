class Student{
    String name;
    int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
        } 
}
public class objectCreation {
    public static void main(String[] args) {
       /* Reflection Method *
        Class<?> cls = Class.forName("Student");//dynamically class is loaded
        Student s = (Student) cls.newInstance(); //always call a no-arg constructor/obj creation */
        Student s1 = new Student(1,"Parul");
        Student s2 = (Student) s1.clone();

    }
}
