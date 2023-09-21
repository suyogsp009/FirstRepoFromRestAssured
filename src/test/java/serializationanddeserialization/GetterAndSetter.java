package serializationanddeserialization;

public class GetterAndSetter {
	
	private String name;
	private int age;
	
	
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age= age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	public static void main(String[] args) {
		
		GetterAndSetter gs = new GetterAndSetter();
		
		gs.setName("Eder");
		
		String fetchedName = gs.getName();
		
		System.out.println(fetchedName);
		
	}
	
	
	
	
	
	
	

}
