package sample1;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age); 
        this.grade = grade;
    }

    void study() {
        System.out.println(name+" is Studing and grade is "+grade);
    }

    public static void main(String[] args) {
        Student stu = new Student("Nikki", 20, "A"); 
        stu.speak(); 
        stu.study(); 
    }
}

    