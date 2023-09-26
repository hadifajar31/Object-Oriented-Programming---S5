public class Mobil {
	//  Properties (Atribut) dari class Mobil
	String pemilik;
	String merk;
	String warna;

	// Method (Metode) untuk class mobil
	String hidupkanMobil() {
		return "Hidupkan Mobil";
	}

	String matikanMobil() {
		return "Matikan Mobil";
	}

	public static void main(String[] args) {
		// Buat object dari class Mobil (instansiasi)
		Mobil mobilAndi = new Mobil();

		// Set nilai property
		mobilAndi.pemilik = "Anto";
		mobilAndi.merk = "Mercy";
		mobilAndi.warna = "Merah";

		// Tamplikan property object Mobil
		System.out.println("Pemilik: " + mobilAndi.pemilik);
		System.out.println("Merk: " + mobilAndi.merk);
		System.out.println("Warna: " + mobilAndi.warna);

		// Tampilkan hasil method object Mobil
		System.out.println(mobilAndi.hidupkanMobil());
		System.out.println(mobilAndi.matikanMobil());
	}
}