

public class CandleShop {

   public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
      

    System.out.println("Choose a candle name: Birthday Candle , Tea Light Candle and Pillar Candle ");
     String name = scnr.nextLine();

    System.out.println("Choose a type : Birthday Candle is the type 1 , Tea Light Candle is the type 2 ,and Pillar Candle is the type 3 ");
     int type = scnr.nextInt();
     scnr.nextLine();
     
    System.out.println("Enter the price. Birthday Candle is $0.50 , Tea Light Candle is $0.20 ,and Pillar Candle is $1.00.");
    double price = scnr.nextDouble();

    System.out.println("Enter the burning time. Birthday Candle has 1 hours of burn time , Tea Light Candle has 4 hours of burn time ,and Pillar Candle has 30 hours of burn time. ");  
    int burnTime= scnr.nextInt();
    scnr.nextLine();
     
    Candle Candle1 = new Candle (name,type,price,burnTime);
    System.out.println("Choose a candle name: Birthday Candle , Tea Light Candle and Pillar Candle ");
      name = scnr.nextLine();

    System.out.println("Choose a type : Birthday Candle is the type 1 , Tea Light Candle is the type 2 ,and Pillar Candle is the type 3 ");
     type = scnr.nextInt();
     scnr.nextLine();
      
    System.out.println("Enter the price. Birthday Candle is $0.50 , Tea Light Candle is $.20 ,and Pillar Candle is $1.");
    price  = scnr.nextDouble();

    System.out.println("Enter the burn time. Birthday Candle has 1 hours of burn time , Tea Light Candle has 4 hours of burn time ,and Pillar Candle has 30 hours of burn time. ");  
    burnTime= scnr.nextInt();
    scnr.nextLine();


    Candle Candle2 = new Candle (name,type,price,burnTime);
    System.out.println("Choose a candle name: Birthday Candle , Tea Light Candle and Pillar Candle ");
      name = scnr.nextLine();

    System.out.println("Choose a type : Birthday Candle is the type 1 , Tea Light Candle is the type 2 ,and Pillar Candle is the type 3 ");
     type = scnr.nextInt();
     scnr.nextLine();
      
    System.out.println("Enter the price. Birthday Candle is $0.50 , Tea Light Candle is $.20 ,and Pillar Candle is $1.");
    price  = scnr.nextDouble();

    System.out.println("Enter the burn time. Birthday Candle has 1 hours of burn time , Tea Light Candle has 4 hours of burn time ,and Pillar Candle has 30 hours of burn time. ");  
    burnTime= scnr.nextInt();
    scnr.nextLine();
  
    Candle Candle3 = new Candle (name,type,price,burnTime);
    System.out.println("Choose a candle name: Birthday Candle , Tea Light Candle and Pillar Candle ");
    name = scnr.nextLine();

  System.out.println("Choose a type : Birthday Candle is the type 1 , Tea Light Candle is the type 2 ,and Pillar Candle is the type 3 ");
   type = scnr.nextInt();
   scnr.nextLine(); 

  System.out.println("Enter the price. Birthday Candle is $0.50 , Tea Light Candle is $.20 ,and Pillar Candle is $1.");
  price  = scnr.nextDouble();
  
  System.out.println("Enter the burn time. Birthday Candle has 1 hours of burn time , Tea Light Candle has 4 hours of burn time ,and Pillar Candle has 30 hours of burn time. ");  
  burnTime= scnr.nextInt();
  scnr.nextLine();
    System.out.println("How many  type 1 candles you want to buy");
    int number1 = scnr.nextInt();
    System.out.println("Number of type 1 candle is " + number1);
    System.out.println("How many  type 2 candles you want to buy");
    int number2 = scnr.nextInt();
    System.out.println("Number of type  candle is " + number2);
    System.out.println("How many  type 3 candles you want to buy");
    int number3 = scnr.nextInt();
    System.out.println("Number of type 3 candle is " + number3);

    double price1 = Candle1.getCost()* number1 ; 
    double price2 = Candle2.getCost() * number2;
    double price3 = Candle3.getCost()* number3;
    double totalPrice = price1 + price2 + price3 ;
    System.out.println("The total price is " + totalPrice);
    double discount=0;
     if ( totalPrice > 20 && totalPrice <= 35)
     {
        discount= totalPrice*5/100; 
        totalPrice = totalPrice - discount;
     }
     else if ( totalPrice > 35 && totalPrice <= 55)
     {
        discount= totalPrice*7/100; 
         totalPrice = totalPrice - discount;
     }
     else if (totalPrice > 55 && totalPrice <= 100)
     {
        discount= totalPrice*10/100; 
        totalPrice = totalPrice - discount;
     }
     else if (totalPrice > 100 )
     {
        discount= totalPrice*20/100; 
        totalPrice = totalPrice - discount; 
     }
     System.out.println("The total price after the discount  is " + totalPrice);

     int burnTime1= Candle1.getTime() * number1;
     int burnTime2= Candle2.getTime() * number2;
     int burnTime3= Candle3.getTime()* number3;
     int totalBurnTime = 60*(burnTime1 + burnTime2 + burnTime3);

     System.out.println(" Total burn time is " + totalBurnTime + " minutes.");

     double totalCostPerMin = totalPrice / totalBurnTime;

     System.out.println(" The total cost per minute is " + totalCostPerMin);
     System.out.print("The quantity of Candle 1:");
     for ( int i =0 ;i<number1;i++){
        System.out.print("*");
     }
     System.out.println();
     System.out.print("The quantity of Candle 2:");
     for ( int i =0 ;i<number2;i++){
        System.out.print("#");
     }
     System.out.print("The quantity of Candle 3:");
     for ( int i =0 ;i<number3;i++){
        System.out.print("$");
     }
     System.out.println();
    
   }
}

