//new class for armor
public class Armor extends Item
{
//establishing variabes for the armor class
private static int defense;

//method that returns defense
public int getDefense()
{
return defense;
}
//This is my constructor for my armor class
public Armor()
 {
super("Iron Chestplate", 15);
 }
//main method for armor!
public static void main(String[] args)
{
Armor arm = new Armor();
arm.examine();

}

}

