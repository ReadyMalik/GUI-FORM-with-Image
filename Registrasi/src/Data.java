public class Data {
    private String No;
    private String ATM;
    private String Bank;
    private String Nama;
    private String NFile;

    public Data() {
    }

    public Data(String no, String ATM, String bank, String nama, String NFile) {
        No = no;
        this.ATM = ATM;
        Bank = bank;
        Nama = nama;
        this.NFile = NFile;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getATM() {
        return ATM;
    }

    public void setATM(String ATM) {
        this.ATM = ATM;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNFile() {
        return NFile;
    }

    public void setNFile(String NFile) {
        this.NFile = NFile;
    }

    @Override
    public String toString() {
        return ("\nNomor Kartu : " + No + "\nJenis ATM : " + ATM + "\nBank : " + Bank + "\nNama Pemilik : " + Nama + "\nFile Gambar : " + NFile);
    }
}
