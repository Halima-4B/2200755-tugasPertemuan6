/* 
Buat class main untuk menguji memasukkan alas, tinggi dan sisi untuk menghitung 
luas dan keliling segitiga
*/

package tugas6;

class Segitiga{
    double alas;
    double tinggi;
    double sisi;

    Segitiga (double alasBaru, double tinggiBaru, double sisiBaru){
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    double getLuas(){
        return 0.5 * alas * tinggi;
    }

    double getKeliling(){
        return alas + tinggi + sisi;
    }
}

public class pertemuan6{
    
    public static void main(String[] args){

        // Menampilkan luas dan keliling segitiga1
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        System.out.println("Segitiga 1");
        System.out.println("Luas     = " + segitiga1.getLuas());
        System.out.println("Keliling = " + segitiga1.getKeliling());

        // Menampilkan luas dan keliling segitiga2
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("\nSegitiga 2");
        System.out.println("Luas     = " + segitiga2.getLuas());
        System.out.println("Keliling = " + segitiga2.getKeliling());

        // Menampilkan luas dan keliling segitiga3
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("\nSegitiga 3");
        System.out.println("Luas     = " + segitiga3.getLuas());
        System.out.println("Keliling = " + segitiga3.getKeliling());
    }
}