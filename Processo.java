package SisOpsT2;

public class Processo {

    private String ID;
    private int tamanho;

    public Processo(String iD, int tamanho){
        this.ID = iD;
        this.tamanho = tamanho;
    }

    public String getID() {
        return ID;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Socorro [ID=" + ID + ", tamanho=" + tamanho + "]";
    }


    
}
