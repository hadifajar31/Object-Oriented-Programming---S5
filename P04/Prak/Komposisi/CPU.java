public class CPU{
    private String merk;
    private int kecepatan;

    public CPU (String m, int k){
        merk = m;
        kecepatan = k;
    }

    public void cetakSpekCPU(){
        System.out.println (merk+ ", "+kecepatan) ;
    }
}