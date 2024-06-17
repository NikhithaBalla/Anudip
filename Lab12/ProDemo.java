package sample1;
	class ParentClass
	   {
	     protected int proVar=10; // protected var

	     protected void display()
	     {

	      System.out.println("Protected method");
	    }

	  }

	  class ChildClass extends ParentClass
	  {
	     
	    void displayProVar()
	   {
	    	System.out.println("Protected var value is"+proVar);
	   }
	   
	  }


 class ProDemo
{
	 public static void main(String args[])
   {

	    ChildClass obj=new ChildClass();
	    obj.display();
	    obj.displayProVar();



	 }
}
