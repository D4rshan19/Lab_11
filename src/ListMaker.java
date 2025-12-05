import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {

    static ArrayList<String> places = new ArrayList <String>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //List with 10 items inside it
        places.add("Germany");
        places.add("Ireland");
        places.add("Switzerland");
        places.add("Greenland");
        places.add("Greece");
        places.add("Japan");
        places.add("Russia");
        places.add("Indonesia");
    }





    //Asks the user for index of value they want to remove from the list
    private static void deleteMethod() {
        int index = InputHelper.getRangedInt(scan, "Enter the position of the item you want to remove [D]", 0,places.size() -1 );
        places.remove(index);
    }

    //Asks the user for a value that will be added to the list
    private static void addMethod() {
        String newIndex = scan.nextLine();
        System.out.println("Did you want to add a value to the list? If so which value? [A] ");
        places.add(newIndex);
    }


    //Prints out the current list
    private static void printMethod() {
        for (int i = 0; i < places.size(); i++) {
            System.out.println(places.get(i));
        }
        System.out.println("Do you want to print the list? [P]");
    }

    //Asks the user if they are sure they want to quit
    private static void quitMethod() {
        String quit = InputHelper.getYNConfirm(scan, "Would you like to quit? [Q]");
    }
}


