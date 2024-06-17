package sample1;

public class PriDemo{
		    private void display()
		    {
		        System.out.println("Private Access Modifier");
		    }  
		    public static void main(String args[])
		    {
		        PriDemo obj = new PriDemo();
		        obj.display();
		    }
}
