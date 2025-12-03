import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {

    static ArrayList<String> places = new ArrayList <String>();

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
    private static boolean deleteMethod(int index ) {
        places.remove(index);
    }

    //Asks the user for a value that will be added to the list
}
