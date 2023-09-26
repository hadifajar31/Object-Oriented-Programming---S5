public class LatihanMethod{
    // Method Static
    static void staticMethod(){
        System.out.println("Method Static");
    }
    //Method Public
    public void publicMethod(){
        System.out.println("Method Public");
    }
    //Main Method
    public static void main(String[] args){
        staticMethod(); // Memanggil Method Static
        //publicMethod(); //Jika ini di run akan error
        LatihanMethod objekMethod = new LatihanMethod(); //Membuat Objek Baru
        objekMethod.publicMethod(); //Memanggil Method Public
    }
}