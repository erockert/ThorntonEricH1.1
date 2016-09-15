//New class for nutrition
import java.util.Scanner;
public class Food extends Item
{
//Setting the variables for my food class
private static int nutrition;
private static int quantity;
public static Scanner input; 


//making get method that returns Nutrition
public int getNutrition()
{
return nutrition;
}
//making get method thta returns Quantity
public int getQuantity()
{ 
return quantity;
}
//Making a method that sets the new value of the Quantity
public static void setQuantity(int newQuantity)
{
quantity = newQuantity;
}
//My constructor for my food class
public Food()
{
super("loaf of bread",1);
}

//My main method for my food class!
public static void main(String[] args)
{
input = new Scanner(System.in);
int newQuantity;
Food bread = new Food();
bread.examine();
System.out.print("\nEnter new quantity of food:" );
newQuantity = input.nextInt();
bread.setQuantity(newQuantity);
System.out.println("You now have " + newQuantity+" loaf(s) of bread");
//Finally got my main method to work
}
}