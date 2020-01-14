package excercise.two;

import java.util.Arrays;
import java.util.Scanner;

public class SearchEngine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommunicationWithCustomer communicationWithCustomer = new CommunicationWithCustomer();
        communicationWithCustomer.printOutBeggining();
        communicationWithCustomer.printOutArrival(scanner);
        communicationWithCustomer.printOutDaparture(scanner);
        communicationWithCustomer.printOutChanges(scanner);
    }
}
