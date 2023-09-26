public class LatihanKu3{
    int a = 88;
    public static void main(String[] args){
        LatihanKu3 objekKu = new LatihanKu3(); //Objek 1
        LatihanKu3 objekKu2 = new LatihanKu3(); //Objek 2
        objekKu2.a = 33;
        System.out.println(objekKu.a); //hasil 88
        System.out.println(objekKu2.a); //hasil 33
    }
}