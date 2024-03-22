import java.util.Scanner;
import java.util.ArrayList;

public class Mahasiswa {
    String nim;
	String nama;
    int semester;
    int usia;
	String krs[];

	
	public Mahasiswa(String nim, String nama, int semester, int usia, String krs[]) {
		this.nim = nim;
		this.nama = nama;
		this.semester = semester;
		this.usia = usia;
		this.krs = krs;
	}

	void infoMahasiswa(){
		System.out.println("Nama "+nama);
		System.out.println("Nim "+nim);
		System.out.println("Semester: "+semester);
		System.out.println("Usia: "+usia);
	}


	float hitungRataNilai(int n){

		int[] angka;
		angka = new int[n];
		int hasil;
		int total = 0;

		Scanner inp = new Scanner(System.in);

		for(int i = 0;i < n; i++) {
			System.out.print("Masukkan Angka ke-"+(i+1)+": ");
			angka[i] = inp.nextInt();
			total = total + angka[i];
		}
		// for (int i = 0; i < nilai.length; i++) {

		// 	total = total + nilai[i];
		// }

		hasil = total / n;

		System.out.println("Hasil "+hasil);

		return hasil;
	}


	void hitungKRS(){
		
	}
	
   
}
