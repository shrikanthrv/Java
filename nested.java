import java.util.Scanner;
class Nested {


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
        System.out.println(" what lang you know develp /Designing ");
        string lang= scan.next();
        if(lang.equalsIgnorecase("Deevlopment")){

        System.out.println("knows  programming and development language");
        }
        else if(lang.equalsIgnorecase("testing")){
        System.out.println("knows programming and testing lang");
        }
        else{
        
        System.out.println("knows programming but dont know any language ");
        }
                   }else{ //false
            System.out.println("does not knows programming lang ");
            
        }
}
    