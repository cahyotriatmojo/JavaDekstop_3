//import java.util.ArrayList;

public class Mhs{
        String nim;
        String nama;
        Double ipk[];
        //ArrayList<Double> ipk;
        
        public Mhs(String nim, String nama, Double ipk[]) {
            this.nim = nim;
            this.nama = nama;
            this.ipk = ipk;
        }
        
        void infoMahasiswa(){
            System.out.println(" "+nama);
            System.out.println(" "+nim);
        }
        
}
    
