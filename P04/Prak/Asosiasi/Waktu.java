public class Waktu{
    private int Hour, Minute, Second;

    public Waktu (int H, int M, int S){
    this.Hour = H;
    this .Minute = M;
    this.Second = S;
    }

    public long Convert2Sec(){
    long Hasil;
    Hasil = 3600*this.Hour + 60*this.Minute + this.Second;
    return (Hasil);
    }
}