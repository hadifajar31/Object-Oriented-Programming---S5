public class Pert2{
    public static void main(String[] args){
        // Memanggil objek untuk memanggil class constructor
        Mahasiswa objek = new Mahasiswa("Kristin","Lebda", 123456);
        Mahasiswa objek2 =new Mahasiswa("Surabaya", 18);
        // Menampilkan value dari atribut nama
        System.out.println("NIM: "+objek.nim);
        objek.Tampil();
        System.out.println("Umur: "+objek2.umur);
        System.out.println("Alamat: "+objek2.alamat);
    }
}