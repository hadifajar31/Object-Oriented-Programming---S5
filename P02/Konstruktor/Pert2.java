public class Pert2{
    // Membuat atribut
    String nama;
    // Membuat Class Constructor di class Pert2
    public Pert2(){
        nama="Kristin"; // Tetapkan value untuk atribut nama
    }
    public static void main(String[] args){
        Pert2 objek =new Pert2(); // Membuat objek untuk memanggil class contructor
        System.out.println(objek.nama); // Menampilkan value dari atribut nama
    }
}