import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class séria {
    public static void main(String[] args) {
        try {
            Operation op1 = new Operation(1, 200, 6000, "V");
            Operation op2 = new Operation(2, 201, 1000, "F");
            File F = new File("banque.txt");
            FileOutputStream fos = new FileOutputStream(F);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(op1);
            oos.writeObject(op2);
            oos.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

}
