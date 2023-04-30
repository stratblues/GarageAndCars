/* Pseudocode for driver

//Garage total value
    double garageValue = 0.0;

//Build ArrayList to hold car class
ArrayList<Car> garage = new ArrayList<Car>();

//Prompt user for below main menu options:


//1) add car to garage
    //Ask user for the model year

    //Ask user for car color

    //ask user for make and model

    //Ask user for price

    //Add car to the ArrayList garage


//2) print contents of the garage
    //Loop through all objects in ArrayList and use toString() to print


//3) get the value of the cars in the garage
    //Loop through all objects in ArrayList, get value of each car and add to a total
    Print garageValue;


//4) remove car from garage (selling it)
    Ask user which car they want to remove (year + makeAndModel)

    //Loop through the ArrayList of cars and find a match, delete it

    //recalculate total value of garage

 */

import java.util.*;

public class Garage {

 public static void main(String[] args) throws Exception {
 
  Scanner keyboard = new Scanner(System.in);
  double garageValue = 0.0;
  int menuChoice =0;
  
  //Build ArrayList to hold car class
  ArrayList<Car> garage = new ArrayList<Car>();

  while(true){

    do{
  //Prompt user for below main menu options:
     System.out.println("Please choose from the below menu options: ");
     System.out.println("1) Add car to garage");
     System.out.println("2) Print contents of garage");
     System.out.println("3) Get value of all vehicles in garage");
     System.out.println("4) Remove a car from garage");
     menuChoice = (int)keyboard.nextInt();

    }while(menuChoice == 0);

    //1) add car to garage
    if(menuChoice == 1){ 

      int year = 0;
      String color = "";
      String make = "";
      String model = "";
      Double price = 0.0;

      //Ask user for the model year
      System.out.println("Please enter the model year of the car ");
        year = keyboard.nextInt();
  
      //Ask user for car color
      System.out.println("Please enter the color of the car ");
        color = keyboard.next();
        
      //ask user for make and model
      System.out.println("Please enter the make and model of the car ");
        make = keyboard.next();
        model = keyboard.next();

      //Ask user for price
      System.out.println("Please enter the price of the car ");
        price = keyboard.nextDouble();
  
      //Add car to the ArrayList garage
      garage.add(new Car(make+model,color,year,price));
      garageValue = garageValue + price;
      
    }

    if(menuChoice == 2){
        System.out.println(garage);
    }

      //3) get the value of the cars in the garage
    if(menuChoice == 3){
        System.out.println(garageValue);
    }

    //4) remove car from garage (selling it)
    if(menuChoice == 4){
        String userChoice;
        for(int i = 0; i <= garage.size() - 1; i++){
            System.out.println("Do you want to sell " + garage.get(i) + "?  (Y/N)");
            userChoice = keyboard.next();
            if(userChoice.equalsIgnoreCase("Y")){
                //recalc total value of garage
                Car currentCar = garage.get(i);
                garageValue -= currentCar.getPrice();
                //remove car object at specific index
                garage.remove(currentCar);
                break;
            }
           
        }
        menuChoice = 0;
      
        
     }
  
    }
  
 }
}
