package mini_projects.FoodOrderingSystem;

//import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderFood {
    Scanner sc =new Scanner(System.in);
    private double cartValue;
   private String cartItems;
   private int orderID=1000;
   private double custBalance;
   private double pizzaVal = 10;
   private double cbVal = 7;
   private double friesVal = 4;

   public OrderFood(){
       orderID++;
       displayMenu();
       System.out.println("                             --------------------------------------                             " +
               "\n                             --------------------------------------                             " +
               "\n                             --------------------------------------                             ");
       System.out.println(addToCart());
   }
    // Menu
   void displayMenu(){
       System.out.println("               WELCOME TO TOMAZO               ");
       System.out.println("               MENU               ");
       System.out.println("Margherita Pizza               $10\nCheese Burger                  $7\nFries                     $4");

   }
    //Add to Cart
   ArrayList<String> addToCart(){
       ArrayList<String> cart = new ArrayList<>(3);
       int qtyPizza=0;
       int qtyCB=0;
       int qtyFries=0;
       boolean add= true;
       boolean cbInCart=false;
       boolean pizzaInCart =false;
       boolean friesInCart = false;
       double pizzaTotal=0;
       double friesTotal=0;
       double cbTotal=0;
      // System.out.println("To order more than one quantity of items, press the buttons fot the required");
       do {
           System.out.println("Press 1 to order Margherita Pizza\nPress 2 to order Cheese Burger\nPress 3 to order Fries");
           int input = sc.nextInt();
           if (input == 1) {
                pizzaInCart = true;
               System.out.println("How much Quantity would you like to order");
               qtyPizza = sc.nextInt();
               pizzaTotal = qtyPizza * pizzaVal;

           }
           if (input == 2) {
                cbInCart = true;
               System.out.println("How much Quantity would you like to order");
               qtyCB = sc.nextInt();
                cbTotal = qtyCB * cbVal;
           }
           if (input == 3) {
               friesInCart = true;
               System.out.println("How much Quantity would you like to order");
               qtyFries = sc.nextInt();
               friesTotal = qtyFries * friesVal;

           }
           System.out.println("Press Q to quit or C to continue");
           String qORc= sc.next();
           if(qORc.equals("Q")||qORc.equals("q")){
               add = false;
           }
//           if(qORc.equals("C")){
//               continue;
//           }
       }while(add);
       if(pizzaInCart)
           cart.add("Margherita Pizza");
       if(cbInCart)
           cart.add("Cheese Burger");
       if(friesInCart)
           cart.add("Fries");
       this.cartValue = pizzaTotal+friesTotal+cbTotal;
       displayCartItems(qtyPizza,qtyCB,qtyFries,this.cartValue, pizzaTotal,cbTotal,friesTotal);
       return cart;
   }
   void displayCartItems(int qtyItem1, int qtyItem2, int qtyItem3,double cartTotal, double pizza, double cb, double fries){

       System.out.println("------------------CART ITEMS------------------");
       System.out.println("      ITEM              QTY                        Order Value");
       System.out.println("Margherita Pizza       "+qtyItem1+"               "+pizza);
       System.out.println("Cheese Burger          "+qtyItem2+"               "+cb);
       System.out.println("Fries                  "+qtyItem3+"               "+fries);
       System.out.println("--------------------------------------------------------");
       System.out.println("Total Cart Value:                                 "+cartTotal);
   }
    void generateBill(){

    }
}

//Add to Cart
// CartValue
// Edit cart;
//Quantity of item;
// quantity edit even after adding to cart;
//recharge app balance;



//Place order, display successful bill generation
