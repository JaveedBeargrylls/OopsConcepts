
// Creation of class and object
class LivingCreatures { // created class LivingCreatures
	String str = "Humans";
	String str1 = "Animals";
	String str2 = "Bacteria";
	String str3 = "Plants";
}
public class ClassObjectTest {
	public static void main(String[] args) {

		// creation of an Object

		LivingCreatures types = new LivingCreatures(); // new is a keyword to create an object

		//	printing of an object in ways

		String object = types.str;
		System.out.println(object);

		System.out.println(types.str1+"\n"+types.str2+"\n"+types.str3);
	}
}
