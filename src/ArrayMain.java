import java.util.ArrayList;
import java.util.Iterator;

public class ArrayMain {


    public static void main(String[] args) {
        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<MhsArray> mahasiswaList = new ArrayList<MhsArray>();

       // menambahkan data mahasiswa ke dalam ArrayList
       ArrayList<Double> nilai1 = new ArrayList<Double>();
       nilai1.add(3.5);
       nilai1.add(3.0);
       nilai1.add(4.0);
       mahasiswaList.add(new MhsArray("Budi", "12345", nilai1));

       MhsArray nhs = new MhsArray("joko", "a11", nilai1);
       nhs.getNama();

       // menampilkan data mahasiswa dan IPK menggunakan Iterator
       Iterator<MhsArray> iterator = mahasiswaList.iterator();
       while (iterator.hasNext()) {

           //System.out.println("Nama: " + MhsArray.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: " );
       }
    }
}

