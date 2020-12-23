public class Operation {
    private int Numero_compte;
    private float montant;
    private int Numero_operation;
    private String Type_operation;

    public Operation() {

    }

    public Operation(int Nop, int Nco, float mont, String Top) {
        this.Numero_compte = Nco;
        this.Numero_operation = Nop;
        this.montant = mont;
        this.Type_operation = Top;
    }

    public float getMontant() {
        return montant;
    }

    public String getType_operation() {
        return Type_operation;
    }

    public int getNumero_compte() {
        return Numero_compte;
    }

    public int getNumero_operation() {
        return Numero_operation;
    }

}
