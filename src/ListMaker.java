import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {

    static ArrayList<String> places = new ArrayList <String>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Declare variables
        String userMenu;
        boolean stop = false;

        //List with 10 items inside it
        places.add("Germany");
        places.add("Ireland");
        places.add("Switzerland");
        places.add("Greenland");
        places.add("Greece");
        places.add("Japan");
        places.add("Russia");
        places.add("Indonesia");
        places.add("Bali");
        places.add("Maldives");

        //Initial printing of list
        System.out.println("Here is the current list: ");


        //Actual "code", portion of project

        do {
            userMenu = InputHelper.getRegExString(scan, "Choose an option from the menu: \n A - Add an item to the list \n D - Delete an item to the list \n P - Print the list \n Q - Quit the program", "[AaDdPpQq]");

            if (userMenu.equalsIgnoreCase("A")) {
                addMethod();
            } else if (userMenu.equalsIgnoreCase("D")) {
                deleteMethod();
            } else if (userMenu.equalsIgnoreCase("P")) {
                printMethod();
            } else {
                 quitMethod();
            }
        } while (!stop);
    }


    //Asks the user for index of value they want to remove from the list
    private static void deleteMethod() {
        int index = InputHelper.getRangedInt(scan, "Enter the position of the item you want to remove", 0,places.size() -1 );
        places.remove(index);
        scan.nextLine();
    }

    //Asks the user for a value that will be added to the list
    private static void addMethod() {
        String newIndex = scan.nextLine();
        System.out.println("Did you want to add a value to the list? If so which value? ");
        places.add(newIndex);
        scan.nextLine();
    }


    //Prints out the current list
    private static void printMethod() {
        for (int i = 0; i < places.size(); i++) {
            System.out.println(i);
            System.out.println(" - ");
            System.out.println(places.get(i));
            System.out.println();
        }
    }

    //Asks the user if they are sure they want to quit
    private static void quitMethod() {
        String quit = InputHelper.getYNConfirm(scan, "Would you like to quit? [Q]");
    }
}


