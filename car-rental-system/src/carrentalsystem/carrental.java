package carrentalsystem;
import java.util.Scanner;
public class carrental {
    private static final Scanner carsystem = new Scanner (System.in);
    private String numberPlate;
    private String brand;
    private String make;
    
    public String getNumberPlate(){
        return numberPlate;
    }
    public String getBrand(){
        return brand;
    }
    public String getMake(){
        return make;
    }
    public void  setNumberPlate( String newNumberPlate){
        this.numberPlate = newNumberPlate; 
    }
     public void  setBrand( String newBrand){
        this.brand = newBrand; 
    }
      public void  setMake( String newMake){
        this.make = newMake; 
    }
    
    void compute(){
        System.out.printf("Enter the number plate of the car of your choice: ");
        setNumberPlate(carsystem.nextLine());
        System.out.printf("Enter its brand: ");
        setBrand(carsystem.nextLine());
        System.out.printf("Enter the make: ");
        setMake(carsystem.nextLine());
    }
}
class CUSTOMER extends carrental{
    Scanner carsystem1=new Scanner (System.in);
    long idNumber;
    String surName;
    String lastName;
    long phoneNumber;
    
    void input(){
        compute();
        System.out.printf("Enter your id number: ");
        idNumber=carsystem1.nextInt();
        System.out.printf("First name: ");
        surName=carsystem1.nextLine();
        carsystem1.nextLine();
        System.out.printf("last name: ");
        lastName=carsystem1.nextLine();
        System.out.printf("phone number: ");
        phoneNumber=carsystem1.nextInt();
}        
}
class RENTALAGENCY extends CUSTOMER{
    Scanner agency=new Scanner(System.in);
    int hours;
    int price=5000;
    
    void calculate(){
        input();
        System.out.printf("Enter the number of renting hours:");
       hours=agency.nextInt();   
       System.out.printf("client" +surName);
       System.out.printf(" " +lastName);
       System.out.printf(" of id number " +idNumber); 
       System.out.printf(" and phone number " +phoneNumber);
       System.out.printf(",has hired a " +getBrand());
       System.out.printf(" of make " +getMake());
       System.out.printf(" and plate numeber " +getNumberPlate());
       System.out.println(" for a total price of "+(hours*price));
    }
    public static void main(String[] args){
       RENTALAGENCY pheme= new RENTALAGENCY();
       pheme.calculate();
    }
}
