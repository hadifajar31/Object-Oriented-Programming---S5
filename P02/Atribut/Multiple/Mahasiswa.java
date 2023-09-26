public class Mahasiswa{
    String namaDepan = "Kristin";
    String namaBelakang = "Lebda";
    String alamat = "Surabaya";
    int umur = 27;

    public static void main(String[] args){
        Mahasiswa objMhs = new Mahasiswa();
        System.out.println("Nama Depan : "+objMhs.namaDepan+" "+objMhs.namaBelakang);
        System.out.println("Umur: "+objMhs.umur);
        System.out.println("Alamat: "+objMhs.alamat);

    }
}