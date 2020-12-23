import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileInputStream;

public class désérialisation {

    public static void main(String[] args) throws Exception {
        try {
            File f = new File("banque.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Operation op1 = (Operation) ois.readObject();
            Operation op2 = (Operation) ois.readObject();
            System.out.println("Numéro Operation" + op1.getNumero_operation());
            System.out.println("Numéro Compte" + op1.getNumero_compte());
            System.out.println("Montant" + op1.getMontant());
            System.out.println("Numéro Operation" + op2.getNumero_operation());
            System.out.println("Numéro Compte" + op2.getNumero_compte());
            System.out.println("Montant" + op2.getMontant());
            ois.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

}
