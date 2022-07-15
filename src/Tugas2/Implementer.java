package Tugas2;

public class Implementer implements Interface{

	@Override
	public void penjumlahan(int bil1, int bil2) {
		// TODO Auto-generated method stub
		int hasil = bil1+bil2;
		System.out.println("Hasil Penjumlahan = " +  hasil);
		
	}

	@Override
	public void pengurangan(int bil1, int bil2) {
		// TODO Auto-generated method stub
		int hasil = bil1-bil2;
		System.out.println("Hasil Pengurangan = " + hasil);
	}

	@Override
	public void perkalian(int bil1, int bil2) {
		// TODO Auto-generated method stub
		int hasil = bil1*bil2;
		System.out.println("Hasil Perkalian = " +hasil);
	}

	@Override
	public void pembagian(int bil1, int bil2) {
		// TODO Auto-generated method stub
		int hasil = bil1/bil2;
		System.out.println("Hasil Pembagian = " +hasil);
		
	}

}
