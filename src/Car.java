/*UML of Class
=============================================

Car

---------------------------------------------

-makeAndModel: string
-color: string
-year: int
-price: double

---------------------------------------------

+Car()
+Car(string, string, int, double)
+getColor():
+getYear(): int
+getPrice(): double
+toString():string

=============================================

 */

/* 
//Pseudocode

public class Car

//declare attributes
private String vehicleMakeAndModel;
private String carColor;
private int modelYear;
private double carPrice;

//declare constuctor methods
public Car(){
    this.vehicleMakeAndModel = "";
    this.carColor = "";
    this.modelYear = 0;
    this.carPrice = 0.0;
}
public Car(String model, String color, int year, double price){
    this.vehicleMakeAndModel = model;
    this.carColor = color;
    this.modelYear = year;
    this.carPrice = price;
}

//declare getters

public String getColor(){
    return color;
}

public int getYear(){
    return year;
}
public int getPrice(){
    return price
}

//set toString output
public String toString(){
    return (year + color + makeAndModel + ", " + price);
}

*/


public class Car {

//declare attributes
private String vehicleMakeAndModel;
private String carColor;
private int modelYear;
private double carPrice;

//declare constuctor methods
public Car(){
    this.vehicleMakeAndModel = "";
    this.carColor = "";
    this.modelYear = 0;
    this.carPrice = 0.0;
}
public Car(String model, String color, int year, double price){
    this.vehicleMakeAndModel = model;
    this.carColor = color;
    this.modelYear = year;
    this.carPrice = price;
}

//declare getters

public String getColor(){
    return carColor;
}

public String getMakeAndModel(){
    return vehicleMakeAndModel;
}

public int getYear(){
    return modelYear;
}
public double getPrice(){
    return carPrice;
}

//set toString output
public String toString(){
    return (modelYear + " "+ carColor + " " + vehicleMakeAndModel + ", " + "$" + carPrice);
}


    
}
