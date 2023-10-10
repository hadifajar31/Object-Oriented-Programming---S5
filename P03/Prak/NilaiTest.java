// class NilaiTest

public class NilaiTest{

    public static void main(String[] args){
        Nilai Biodata = new Nilai();
        Biodata.Nama = "Adelya";
        Biodata.NIM = "12345";
        Biodata.SetNilai(90);

        System.out.println("Nama = "+ Biodata.Nama);
        System.out.println("NIM = "+Biodata.NIM);
        System.out.println("Nilai ="+Biodata.getNilai());
    }
}