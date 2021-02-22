public class Person
{
	public String character_class;
	public String character_name;
	public int health;
	
	public Person()
	{
		character_class = "No Class";
		character_name = "No Name";
		health = 10;
	}
	
	public Person(String character_class)
	{
		this.character_class = character_class;
		getCharacter_Class();
		setHealth(character_class);
	}
	
	public Person(String character_class, String character_name)
	{
		this.character_class = character_class;
		this.character_name = character_name;
		getCharacter_Class();
		getCharacter_Name();
		setHealth(character_class);
	}
	
	public String getCharacter_Name()
	{
		return character_name;
	}
	public void setCharacter_Name(String character_name) 
	{
		if(character_name == "")
		{
			this.character_name = "No Name";
		}
		else
		{
			this.character_name = character_name;
		}
	}
	
	public String getCharacter_Class()
	{
		return character_class;
	}
	public void setCharacter_Class(String character_class) 
	{
		if(character_class == "")
		{
			this.character_class = "No Class";
		}
		else
		{
			this.character_class = character_class;
		}
	}
	
	public int getCharacter_Health()
	{
		return health;
	}
	public void setHealth(String character_class)
	{
		if(character_class == "")
		{
			this.health = 10;
		}
		else if(character_class == "Mage" || character_class == "mage")
		{
			this.health = 50;
		}
		else if(character_class == "Fighter" || character_class == "fighter")
		{
			this.health = 100;
		}
	}
	
	@Override
	public String toString()
	{
		return "Character Name: " + character_name + "\n" +
				"Character Class: " + character_class + "\n" +
			   "Character Health: " + health;
	}



}