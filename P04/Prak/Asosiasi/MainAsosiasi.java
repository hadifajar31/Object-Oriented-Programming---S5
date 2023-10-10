public class MainAsosiasi{
	public static void main (String [] args){
		Waktu JamMulai = new Waktu (15,26,34);
		Waktu JamSelesai = new Waktu (17,8,45);
		PenghitungPulsa PC = new PenghitungPulsa(JamMulai, JamSelesai);
		
		System.out.println ("Jumlah Pulsa : " + PC.GetJmlPulsa());
	}
}