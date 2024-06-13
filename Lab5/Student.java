package sample1;

public class Student {
			    private int id;
			    private String name;
			    private boolean active;
                public Student(int id, String name, boolean active) {
			        this.id = id;
			        this.name = name;
			        this.active = active;
			    }

			    // Getter methods
			    public int getId() {
			        return id;
			    }

			    public String getName() {
			        return name;
			    }

			    public boolean isActive() {
			        return active;
			    }

			    // Setter methods
			    public void setId(int id) {
			        this.id = id;
			    }

			    public void setName(String name) {
			        this.name = name;
			    }

			    public void setActive(boolean active) {
			        this.active = active;
			    }

			    // toString method (for debugging or printing)
			    @Override
			    public String toString() {
			        return "Student{" +
			                "id=" + id +
			                ", name='" + name + '\'' +
			                ", active=" + active +
			                '}';
			    }

			    public static void main(String[] args) {
			        Student stu = new Student(101, "ashika", true);
			        System.out.println(stu); 
			        stu.setId(120);
			        stu.setActive(false);
			        System.out.println(stu); 
			}

	}



