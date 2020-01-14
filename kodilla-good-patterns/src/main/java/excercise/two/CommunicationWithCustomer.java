package excercise.two;

import java.util.Arrays;
import java.util.Scanner;

public class CommunicationWithCustomer {

    CityCheck cityCheck = new CityCheck();

    public void startSearch(){
        System.out.println("Please choose from below list of cities in your search:");
        System.out.println(Arrays.toString(City.values()));
        cityCheck.prepareSearchList();
    }

    public void printOutDaparture(Scanner scanner){
        System.out.println("City of departure:");
        String customerInputDeparture = scanner.nextLine();
        System.out.println(cityCheck.findPossibleDepartures(City.valueOf(customerInputDeparture)));
    }

    public void printOutArrival(Scanner scanner) {
        System.out.println("City of arrival:");
        String customerInputArrival = scanner.nextLine();
        System.out.println(cityCheck.findPossibleArrivals(City.valueOf(customerInputArrival)));
    }

    public void printOutChanges(Scanner scanner) {
        System.out.println("Find the route with change in chosen city:");
        String customerInputChange = scanner.nextLine();
        City.valueOf(customerInputChange);
        cityCheck.checkerOfExistingChanges(City.valueOf(customerInputChange));
    }
}
