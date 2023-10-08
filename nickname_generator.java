//  A program that asks the user to enter three (3) first names then displays the initials and nickname

import java.util.Scanner; // initialize the scanner class

public class nickname_generator{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three first names: ");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        System.out.println("Possible names are: "); //Combination of the given names
        System.out.println("1 - " + name1 + " " + name2);
        System.out.println("2 - " + name1 + " " + name3);
        System.out.println("3 - " + name2 + " " + name1);
        System.out.println("4 - " + name2 + " " + name3);
        System.out.println("5 - " + name3 + " " + name1);
        System.out.println("6 - " + name3 + " " + name2);

        System.out.println("Enter 1-6 to select a name: ");
        int choice = sc.nextInt();
        char letter1,letter2;
        sc.close();

        switch(choice){ //Switch statement to choose what to display

            case 1: 
            letter1 = name1.toUpperCase().charAt(0);
            letter2 = name2.toUpperCase().charAt(0);

            System.out.println("The initials for "+ name1 + " " + name2 +" is " + letter1 + letter2 + ".");
            System.out.println("Suggested username: " + name1.toLowerCase() + "_" + name2.toLowerCase());
            break;

            case 2:
            letter1 = name1.toUpperCase().charAt(0);
            letter2 = name3.toUpperCase().charAt(0);

            System.out.println("The initials for "+ name1 + " " + name3 +" is " + letter1 + letter2 + ".");
            System.out.println("Suggested username: " + name1.toLowerCase() + "_" + name3.toLowerCase());
            break;

            case 3:
            letter1 = name2.toUpperCase().charAt(0);;
            letter2 = name1.toUpperCase().charAt(0);

            System.out.println("The initials for "+ name2 + " " + name1 +" is " + letter1 + letter2 + ".");
            System.out.println("Suggested username: " + name2.toLowerCase() + "_" + name1.toLowerCase());
            break;

            case 4:
            letter1 = name2.toUpperCase().charAt(0);
            letter2 = name3.toUpperCase().charAt(0);

            System.out.println("The initials for "+ name2 + " " + name3 +" is " + letter1 + letter2 + ".");
            System.out.println("Suggested username: " + name2.toLowerCase() + "_" + name3.toLowerCase());
            break;

            case 5:
            letter1 = name3.toUpperCase().charAt(0);
            letter2 = name1.toUpperCase().charAt(0);

            System.out.println("The initials for "+ name3 + " " + name1 +" is " + letter1 + letter2 + ".");
            System.out.println("Suggested username: " + name3.toLowerCase() + "_" + name1.toLowerCase());
            break;

            case 6:
            letter1 = name3.toUpperCase().charAt(0);
            letter2 = name2.toUpperCase().charAt(0);

            System.out.println("The initials for "+ name3 + " " + name2 +" is " + letter1 + letter2 + ".");
            System.out.println("Suggested username: " + name3.toLowerCase() + "_" + name2.toLowerCase());
            break;

            default:
            System.out.println("Invalid Input!!Program Closing...");

        }
    } 
}