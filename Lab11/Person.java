package Sample;
	interface Person
	{
	  void speak();
	}
	class Student implements Person
	{
	   public void speak()
	   {
	      System.out.println("Student are learning");
	   }
	}
	class Teacher implements Person
	{
	  public void speak()
	   {
	      System.out.println("Teachers are teaching ");
	   }
	}
