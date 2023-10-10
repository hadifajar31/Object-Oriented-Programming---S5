public class MainAgregasi{
	public static void main (String args[]){
		
		Jurusan j = new Jurusan ("TI", "Teknik Informatika");
		
		Mahasiswa m1 = new Mahasiswa ("12345" , "Adi");
		Mahasiswa m2 = new Mahasiswa ("12344" , "Budi");
		Mahasiswa m3 = new Mahasiswa ("12343" , "Mira");
		
		j.tambahMahasiswa(m1);
		j.tambahMahasiswa(m2);
		j.tambahMahasiswa(m3);
		
		j.cetakInfo();
	}
}