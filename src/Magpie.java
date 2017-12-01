public class Magpie {
	private String name;
	
	public Magpie() {
		this.name = "";
	}
	
	public String getGreeting() 
	{
		return "Hello, I am Magpie! What's your name?";
	}
	
	public String setName(String name)
	{
		this.name = name;
		return "Hello, " + this.name;
	}
	
	public String respond(String statement)
	{
		statement = statement.toLowerCase();
		
		String familyMember = checkFor(statement, new String[] {"mother", "father", "brother", "sister", "mom", "dad"});
		if (!familyMember.equals(""))
		{
			return "Please tell me more about your " + familyMember + ".";
		}
		else
		{
			return getRandResponce();
		}
		
		if (checkFor(statement, new String[] {"magpie"}).equals(""))
		{
			return "How are you?";
		}
	}
	
	private String checkFor(String statement, String[] words) 
	{
		for (String word : words) 
		{
			if (statement.indexOf(word) >= 0)
			{
				return word;
			}
		}
		return "";
	}
	
	private String getRandResponce()
	{
		String[] responces = {"Hmm...", "Interesting, tell me more.", "Do you really think so?", "You don't say."};
		int randNum = (int) (Math.random()*(responces.length));
		return responces[randNum];	
	}
}

