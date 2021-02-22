public class Test {
    public static void main(String[] args)
    {
        
        Person a = new Person();
		a.setCharacter_Class("");
		a.setCharacter_Name("");
		System.out.println(a.toString());
		buffer();		
		Person b = new Person("Mage");
		b.setCharacter_Name("Elrond");
		System.out.println(b.toString());
		buffer();
		Person c = new Person("Fighter", "Aragon");
		System.out.println(c.toString());


	}
	static void buffer()
	{
		System.out.println();
	}
    
}