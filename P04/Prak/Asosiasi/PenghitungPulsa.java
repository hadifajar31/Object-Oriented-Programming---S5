public class PenghitungPulsa{
    private double JmlPulsa;

    public PenghitungPulsa(Waktu cl, Waktu c2){
    this.JmlPulsa = (c2.Convert2Sec() - cl.Convert2Sec())/100;
    }
    
    public double GetJmlPulsa(){
    return (JmlPulsa) ;
    }
}
