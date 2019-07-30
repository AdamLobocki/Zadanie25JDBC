import java.sql.SQLException;
import java.util.Scanner;

public class DeteleTransaction {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj id");
        int id = scanner.nextInt();


        TransactionDAO transactionDAO = new TransactionDAO();
        transactionDAO.deleteByID(id);


    }
}
