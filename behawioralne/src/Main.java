import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Wprowadź nazwę zamówienia: ");
        String description = scanner.nextLine();

        zamowienie zamowienie = new zamowienie(description);

        obslugazam acceptanceHandler = new akceptacjazam();
        obslugazam preparationHandler = new przygotowaniezam();
        obslugazam deliveryHandler = new dostarczenie();

        acceptanceHandler.setNext(preparationHandler);
        preparationHandler.setNext(deliveryHandler);

        acceptanceHandler.handle(zamowienie);

        scanner.close();
    }
}
