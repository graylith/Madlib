package madlib;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    String name,noun,adjective,adverb,noun2,adjective2,noun3;
    int rand;
    Scanner sc = new Scanner(System.in);
    
    void getname(){
        System.out.println("Please enter a name");
        name = sc.nextLine();
    }
    void getnoun(){
        System.out.println("Enter a Noun");
        noun = sc.nextLine();
    }
    void getadjective(){
        System.out.println("Enter an adjective");
        adjective = sc.nextLine();
    }
    void getadverb(){
        System.out.println("Enter an adverb");
        adverb = sc.nextLine();
    }
    void getnoun2(){
        System.out.println("Enter a second Noun");
        noun2 = sc.nextLine();
    }
    void getrand(){
        System.out.println("Enter a random Number");
        rand = sc.nextInt();
    }
    void getadjective2(){
        System.out.println("Enter a second adjective");
        adjective2 = sc.nextLine();
    }
    void getnoun3(){
        System.out.println("Enter a third Noun");
        noun3 = sc.nextLine();
    }
    
    void play(){
        getname();
        getnoun();
        getadjective();
        getadverb();
        getnoun2();
        getrand();
        getadjective2();
        getnoun3();
    }
    
    void getstory(){
    System.out.println("Jesse and her best friend"+name+" went to Disney world today ! They saw a"+noun+" in a show at the Magic Kingdom and ate a"+adjective+" feast for dinner.The next day I ran"+adverb+" to meet mickey mouse in his"+noun2+" and then at that night i gazed at the"+rand+" "+adjective2+"fireworks shooting from the"+noun3+".");
    }
    
    public static void main(String[] args) {
        System.out.println("MADLIB GAME...!!!");
	System.out.println("Let's Start");
	Main obj = new Main();
	obj.play();
	obj.getstory();
    }
    
}
