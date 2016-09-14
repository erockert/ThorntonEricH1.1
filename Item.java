//This is my item class thta Weapon, Armor and Nutrition inherit from
public class Item
  {
       //Properties:
       //weight, name
  private static int weight;
       // The weight of the item
  private static String name;
       //The name of the item

       //method that returns weight
public String getWeight(){
	return weight;
}
       //method that returns name
public String getName(){
	return name;
}

//I forgot to put my constructor class in but it is here now!
public Item(String nName, int nWeight)
{
name = nName
weight = nWeight;
}

 }
	//new class for weapon
public class Weapon extends Item
{
	//variable for damage
	private int damage;

	//method that returns damage
public String getDamage()
{
return damage;
}
//This is my constructor for my weapon class
public Weapon(int nDamage)
{
damage = nDamage;
}
 
}
	//My main method!
	public static void main(String[] args)
     {


     }
  