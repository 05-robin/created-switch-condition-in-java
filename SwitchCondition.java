
package pkgswitch.condition;

import java.util.Scanner;

public class SwitchCondition {

    public static void main(String[] args) {
        int choice;
        System.out.println("Pick one : 1.Hi\t2.hey\t3.hello");
        Scanner s=new Scanner(System.in);
        choice=s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("you said Hi");
                break;
            case 2;
                System.out.println("you said hey");
                break;
            case 3;    
                System.out.println("you said hello");
                break;
            default;
                System.out.println("Invalid choice");
        }
    }
    
}
