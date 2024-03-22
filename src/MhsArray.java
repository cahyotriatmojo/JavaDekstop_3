import java.util.ArrayList;
public class MhsArray {
  

    String nama;
 String nim;
     ArrayList<Double> nilai;

    public MhsArray(String nama, String nim, ArrayList<Double> nilai) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        System.out.println(" "+nama);
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double hitungIPK() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.size();
    }
}

