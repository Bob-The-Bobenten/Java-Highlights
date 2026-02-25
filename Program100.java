import java.util.Scanner;
public class Program100 {
	
	public static void start()
	{
		System.out.println("you did it, you have finaly managed to figure out time tarvel.");
		System.out.println("but you have one major flaw in your design, your timeMachine only teleports you in time and not in space."); 
		System.out.println("you find yourself in a dark room on a bed with no source of light anywhere");
		System.out.println();
		System.out.println("here is a list of commands you can try and use");
		System.out.println("some commands need a second word connected to them: 'command object'");
		help();
	}
	
	public static void help()
	{
		System.out.println();
		System.out.println("*help-gives list of commands");
		System.out.println("*inspect-get a closer look at an object");
		System.out.println("*scan-look around in an area");
		System.out.println("*actions-gives you a list of your possible actions");
		System.out.println("*actOn-does an action on an object");
		System.out.println();
		System.out.println();
	}
	
	public static void scan(boolean light)
	{
		if (light == false)
		{
			System.out.println("you still dont see anything but by the springiness of the bed you realise you are still in your room");
		}
		if (light == true)
		{
			System.out.println("you see your room full of cobwebs and dust but you see your desk, bed, and storage cabinet");
			System.out.println("you notice the disappearence of your shelf which previasly had your piggy bank, ");
			System.out.println("your door and windows have been borded up from the inside with an excessive amount of plankes and nails");
		}
	}

	public static void actions(boolean light, boolean gummyPack)
	{
		if (light==false)
		{
			System.out.println("try the light");
		}
		if (gummyPack==true)
		{
			System.out.println("eat the gummy pack");
		}
		System.out.println("try the timeMachine");
	}
	
	public static boolean actOn(boolean have, String object)
	{
		if (have == false&&object.equals("light"))
		{
			System.out.println("you turn on the light");
			return true;
		}
		if (have == false&&object.equals("bed"))
		{
			System.out.println("you find a gummy pack and take it");
			return true;
		}
		if (have == false&&object.equals("timeMachine"))
		{
			System.out.println("you get a small shock and realise the battery is broken");
		}
		if (have == false&&object.equals("drower"))
		{
			System.out.println("you open the drower and see an eraser your diary, some of your old tests, and one glove");
		}
		if (have == false&&object.equals("glove"))
		{
			System.out.println("you put on the glove");
		}
		if (have == false&&object.equals("mask"))
		{
			System.out.println("you grab the mask");
			return true;
		}
		if (have == false&&object.equals("hammer"))
		{
			System.out.println("you take the hammer from the cabinet");
			System.out.println("you hear a click");
			System.out.println("you see a yellowish gas seaping from under the bed");
			System.out.println("you start to feel light headed");
			return false;
		}
		if (have == true&&object.equals("hammer"))
		{
			System.out.println("you try pulling the hammer from the shelf but the hammer clickes like a lever");
			System.out.println("you see a yellowish gas seaping from under the bed");
			System.out.println("you quickly put on the mask ");
			System.out.println("no windows means you have to keep the mask on until you find a way to ventalate the room");
		}
		if (have == true&&object.equals("gummyPack"))
		{
			System.out.println("you eat the gummy pack, probably not a smart choice, you feel a deep rumbling in your stomeck you drop down on the floor and die");
			return false;
		}
		return true;
	}

	public static void inspect(String object)
	{
		if (object.equals("bed"))
		{
			System.out.println("you see slight bump under the sheets");
		}
		if (object.equals("timeMachine"))
		{
			System.out.println("its broken, probably happend when you arrived");
		}
		if (object.equals("hammer"))
		{
			System.out.println("the hammer seems to be atached to the wall");
			System.out.println("if you manage to take it it may be a usfull tool");
		}
		if (object.equals("desk"))
		{
			System.out.println("you see a skeleton laying under the desk. you scream");
			System.out.println("you see the desk drower slightly open");
		}
		if (object.equals("skeleton"))
		{
			System.out.println("you see him wearing a shirt resembeling yours and a can of coke laying by his side");
		}
		if (object.equals("cabinet"))
		{
			System.out.println("you see all your hammer shaped fake golden carpentry trophies");
			System.out.println("you see those gas maskes you never use but are mandetory in every house");
		}
		if (object.equals("diary"))
		{
			System.out.println("you look through the diary and see the last entry being 31.3.2026, more than 2 years after you time travled");
			System.out.println("you read the last entry, you can barely make out the letters.");
			System.out.println("''It has been 2 whole fucking years since that son of a bitch took off");
			System.out.println("I fear my time has come to end, I have done everything I could");
			System.out.println("IF I'M NOT MAKING IT OUT ALIVE THEN NEITER ARE YOU!''");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		start();
		
		boolean mask = false;
		boolean gameEnd = true;
		boolean light = false;
		boolean gummyPack = false;
		boolean filler = false;
		String object = "";
		String act;
		while (gameEnd)
		{
			act = input.next();
			if (act.equals("help")||act.equals("scan")||act.equals("actions")||act.equals("actOn")||act.equals("inspect"))
			{
				if (act.equals("help"))
				{
					help();
				}
				if (act.equals("scan"))
				{
					scan(light);
				}
				if (act.equals("actions"))
				{
					actions(light, gummyPack);
				}
				if (act.equals("inspect"))
				{
					object = input.next();
					inspect(object);
				}
				if (act.equals("actOn"))
				{
					object = input.next();
					if (object.equals("light"))
					{
						light=(actOn(light, object));
					}
					if (object.equals("bed"))
					{
						gummyPack=(actOn(gummyPack, object));
					}
					if (object.equals("timeMachine"))
					{
						actOn(filler, object);
					}
					if (object.equals("glove"))
					{
						actOn(filler, object);
					}
					if (object.equals("mask"))
					{
						mask=actOn(filler, object);
					}
					if (object.equals("drower"))
					{
						actOn(filler, object);
					}
					if (object.equals("gummyPack"))
					{
						gameEnd=actOn(gummyPack, object);
					}
					if (object.equals("hammer"))
					{
						gameEnd=actOn(mask, object);
					}
				}

			}
			else
			{
				System.out.println("not an action");
			}
			
		}
		System.out.println("YOU LOSE");

	}
}
