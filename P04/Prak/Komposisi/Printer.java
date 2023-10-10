public class Printer{
    private String merk, type;

    public Printer (String m, String t){
        merk = m;
        type =t;
    }

    public void cetakSpekPrinter() {
        System.out.println (merk + ", " +type);
    }
}