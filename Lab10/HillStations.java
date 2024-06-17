package sample1;

public class HillStations {

	public void location()
	{
		System.out.println("location in hillstations");
	}
	public void famousfor()
	{
		System.out.println("Famous for Hills");
	}
	public void showDetails()
	{
		location();
		famousfor();
	}
	public static void main(String[] args) {
		
      HillStations man=new Manali();
      HillStations mus=new Mussorie();
      HillStations gul=new Gulmarg();
      man.showDetails();
      mus.showDetails();
      gul.showDetails();
	}
}
class Manali extends HillStations
{
	public void location()
	{
		System.out.println("Manali is located in himachalpradesh");
	}
	public void famousfor()
	{
		System.out.println("Manali famous for beauty");
	}
}
class Mussorie extends HillStations
{
	public void location()
	{
		System.out.println("Mussorie is located in uttarakhand");
	}
	public void famousfor()
	{
		System.out.println("Mussorie is famous for pleasant weather");
	}
}
class Gulmarg extends HillStations
{
	public void location()
	{
		System.out.println("Gulmarg located in jammu and kashmir");
	}
	public void famousfor()
	{
		System.out.println("Gulmarg Famous for resort");
	}
}


