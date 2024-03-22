import java.util.ArrayList;
import java.util.Scanner;


public class Main{

	static int n;

	public static void main(String[] args) {
		int usia, semester;
		String nim, nama;


		System.out.print("Masukkan Jumlah KRS saat ini: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();

		String[] krs = new String[n];
		for(int i = 0;i < n;i++) {
			System.out.println("KRS ke-"+(i+1));
			System.out.print("Nama KRS yang di tempuh: ");
			krs[i] = inp.next();
		}
		
			System.out.print("Masukkan NIM: ");
			nim = inp.next();
			System.out.print("Masukkan Nama: ");
			nama = inp.next();
			System.out.print("Masukkan Usia: ");
			usia = inp.nextInt();
			System.out.print("Masukkan Semester: ");
			semester = inp.nextInt();

			System.out.println(" Hasil Inputan \n");

			Mahasiswa hb = new Mahasiswa(nim, nama, semester, usia, krs);
			Mahasiswa ap = new Mahasiswa(nim, nama, semester, usia, krs);
		
			hb.infoMahasiswa();
			ap.hitungRataNilai(n);
		setMahasiswa(nim,nama, usia, semester, krs);
    }
	
	
    public static void setMahasiswa(String nim, String nama, int usia, int semester, String krs[]) {
		ArrayList<Mahasiswa> mhs = new ArrayList<>();
		for(int i=0; i < n; i++) {
			mhs.add(new Mahasiswa(nim,nama,usia,semester,krs));  //krs[i]
		}
		
		cetakMahasiswa(mhs);
	}
	
	public static void cetakMahasiswa(ArrayList<Mahasiswa> list) {
		for(int i = 0;i < n;i++) {
			Mahasiswa mhs = list.get(i);
			System.out.println("Nama KRS ke-"+(i+1));
			System.out.println(" "+mhs.krs[i]);
		}
		
	}

	


	


}

