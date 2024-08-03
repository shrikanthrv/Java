import java.util.Scanner;
class Nestedexample {


//entry point

    public static void main(String args[])
    //scanner object for user input

    Scanner scan= new Scanner(System.in);
    System.out.println(" Enter you know development rogramming or not yes/no ");
    //store input in check variable 
    String lang=scan.next();
    if(lang.equalsIgnoreCase("yes")){
         System.out.println(" knows programming language or not yes/no ");
        String check = scan.next();

      //condition
      //equals -will not check case
    if(check.equalsIgnoreCase("yes")")) {//true
        System.out.println(" knows programming lang");
            }else{ //false
            System.out.println("does not knows programming lang ");
            
        }
}
    }