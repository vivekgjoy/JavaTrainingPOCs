public class Person{

	private String name;

	public void setName(String newName)
	{
		this.name=newName;
	}

	public String getName()
	{ 
		return name;
	}


}

class Main{

	public static void main(String[] args)
	{

		Person ob = new Person();
		//ob.name = "Arjun"; //if public we can reassign them
		//System.out.println(ob.name); //and clla them using object
		ob.setName("Arjun");
		System.out.println(ob.getName());

	}

}