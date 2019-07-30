import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTransaction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj id");
        int id = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Podaj typ");
        String type = scanner.nextLine();

        System.out.println("Podaj opis");
        String description = scanner.nextLine();
        System.out.println("Podaj ilość");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj date");
        String date = scanner.nextLine();


        Transaction transaction = new Transaction(id, type, description, amount, date);

        TransactionDAO transactionDAO = new TransactionDAO();
        transactionDAO.update(transaction);

    }
}