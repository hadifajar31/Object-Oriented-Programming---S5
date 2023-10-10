public class Komputer{
    private String kode;
    private long harga;
    private CPU proc;
    private Monitor mon;
    private Printer prn;

    public Komputer (String k, long h){
        kode = k;
        harga = h;

        if (k == "PC-01"){
            proc = new CPU ("Pentium IV", 500);
            mon = new Monitor("Sony Multiscan 15sf");
            prn = new Printer ("canon", "color");
        }
    }

    public void cetakSpek(){
        System.out.println ("Kode: " +this.kode) ;
        System.out.println ("Processor : ");
        proc.cetakSpekCPU();
        System.out.println ("Monitor : ");
        mon.cetakSpekMonitor () ;
        System.out.println ("Printer - ");
        prn.cetakSpekPrinter ();
        System.out.println ("Harga : "+ this.harga);
    }
}