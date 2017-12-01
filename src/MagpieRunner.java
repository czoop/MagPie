import java.util.Scanner;
public class MagpieRunner {
	public static void main(String[] args) {
		Magpie mp = new Magpie();
		Scanner input = new Scanner(System.in);
		System.out.println(mp.getGreeting());
		System.out.print("...");
		String name = input.nextLine();
		System.out.println(mp.setName(name));
		
		while (true) 
		{
			System.out.print("...");
			String statement = input.nextLine();
			System.out.print(mp.respond(statement));
		}
		
	}
}
