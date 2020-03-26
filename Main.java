import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
   Scanner myObj = new Scanner(System.in);

 // Week 3 HomeWork   

System.out.println("What is your Favorite Song, Movie and City:");

 
     // String input
    String song  = myObj.nextLine();
    String  movie  = myObj.nextLine();
    String  city = myObj.nextLine();

    // Output input by user
    System.out.println("Favorite Song : " + song); 
    System.out.println("Favorite Movie: " +  movie); 
    System.out.println("Favorite City: " + city);  
  }
}