public class Magpie {
	private String name;
	/*
	 * 0 = Family
	 * 1 = Life
	 * 2 = Pets
	 * 3 = Goods
	 * 4 = Bads
	 * 5 = Queries
	 */
	private String[][] keyWords = {{"family", "mother", "father", "brother", "sister", "mom", "dad"},
									{"school", "work", "life", "issues", "worries"}, 
									{"dog", "cat", "bird", "snake", "pet", "pets", "fish", "dogs", "cats", "birds"},
									{"fine", "good", "well", "okay", "better"},
									{"bad", "poorly", "awful", "sad"},
									{"what is", "how does", "does", "can you", "please get"}};
	
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
		
		if (checkFor(statement, keyWords[0]))
		{
			String familyMember = getWord(statement, keyWords[0]);
			return "Please tell me more about your " + familyMember + ".";
		}
		else if (checkFor(statement, keyWords[1]))
		{
			String word = getWord(statement, keyWords[1]);
			return "Please do tell me a little bit more about your " + word + ".";
		}
		else if (checkFor(statement, keyWords[2]))
		{
			String pet = getWord(statement, keyWords[2]);
			return "How is your " + pet + "doing?";
		}
		else if (checkFor(statement, keyWords[3]))
		{
			return "That's good!";
		}
		else if (checkFor(statement, keyWords[4])) 
		{
			return "I'm sorry. I hope it gets better.";
		}
		//Queries
		else if (checkFor(statement, keyWords[5]))
		{
			return "I'm afraid I'm not smart enough to do that. I'm sorry.";
		}
		else if (checkFor(statement, new String[] {"magpie"}))
		{
			return "How are you?";
		}
		else
		{
			return getRandResponce();
		}
	}
	
	private boolean checkFor(String statement, String[] words) 
	{
		for (String word : words) 
		{
			if (statement.indexOf(word) >= 0)
			{
				return true;
			}
		}
		return false;
	}
	
	private String getWord(String statement, String[] words) 
	{
		for (String word : words) 
		{
			if (statement.indexOf(word) >= 0)
			{
				return word;
			}
		}
		return "ERROR";
	}
	
	private String randResponce(String[] statements)
	{
		return "";
	}
	
	private String getRandResponce()
	{
		String[] responces = {"Hmm...", "Interesting, tell me more.", "Do you really think so?", "You don't say."};
		int randNum = (int) (Math.random()*(responces.length));
		return responces[randNum];	
	}
}

