import java.util.Scanner;
import java.util.ArrayList;

public class Mainmhs {

	static int n;
    

	public static void main(String[] args) {

        String nama, nim;

        ArrayList<Mhs> mhs = new ArrayList<>();


		System.out.print("Masukkan Jumlah Data: ");
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();

		// String[] nim = new String[n];
		// String[] nama = new String[n];
		Double[] ipk = new Double[n];
        System.out.print("Masukkan NIM: ");
        nim = inp.next();
        System.out.print("Masukkan Nama: ");
        nama = inp.next();
    
		for(int i = 0;i < n;i++) {
			System.out.println("Data ke-"+(i+1));
			
			System.out.print("Masukkan IPK: ");
			ipk[i] = inp.nextDouble();
		}
        
        Mhs mhs = new Mhs(nim, nama, ipk);
        mhs.infoMahasiswa();
 
		setMahasiswa(nim,nama,ipk);
	}
	
	public static void setMahasiswa(String nim, String nama, Double ipk[]) {
		ArrayList<Mhs> mhs = new ArrayList<>();
		for(int i=0; i < n;i++) {
			mhs.add(new Mhs(nim,nama,ipk));
		}
		
		cetakMahasiswa(mhs);
	}
	
	public static void cetakMahasiswa(ArrayList<Mhs> list) {
		for(int i = 0;i < n;i++) {
			Mhs mhs = list.get(i);
			System.out.println("Data ke-"+(i+1));
			
			System.out.println("IPK: "+mhs.ipk);
		}
        
		
	}


}
    

