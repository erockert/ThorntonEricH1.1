//New class for nutrition
public class Food extends Item
{
//Setting the variables for my food class
private static int nutrition;
private static int quantity;

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
public in setQuantity(int newQuantity)
{
quantity = newQuantity
}
//My constructor for my food class
public Food()
{

}

//My main method for my food class!
public static void main(String[] args)
{
Food bread = new Food();
}
}