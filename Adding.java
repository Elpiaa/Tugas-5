import com.Kerucut;
import com.Segitiga;
import com.Tabung;

import java.util.Scanner;


public class Adding {
    private static final int pilih = 0;
    static char ans = 'n';
    private static double a , t , x , y , z , r ;

    static Segitiga nilaiSegitiga = new Segitiga(a, t, x, y, z);
    static Tabung nilaiTabung = new Tabung(r, t);
    static Kerucut nilaiKerucut = new Kerucut(r, t);
    public static void main(String[] args) throws Exception{
        
        Scanner angka = new Scanner(System.in);

        do{
            System.out.println("-------------    Menghitung Bangun Ruang    -------------");
            System.out.println("               Input dalam satuan centimeter            ");
            
            System.out.println("----------------------------------------------------------");
    
            System.out.println("Menu Pilih : ");
            System.out.println("1. Segitiga");
            System.out.println("2. Tabung"); 
            System.out.println("3. Kerucut");
            System.out.println(" ");
            System.out.print("Pilih ? ");
            int pilih = angka.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("-----Segitiga-----");
                    nilaiSegitiga = inputData();
                    nilaiSegitiga.Keliling();
                    nilaiSegitiga.lsegitiga();
                    break;
                case 2 :

                    System.out.println("-----Tabung-----");
                    nilaiTabung = inpuTabung();
                    nilaiTabung.latabung();
                    nilaiTabung.lptabung();
                    nilaiTabung.lstabung();
                    nilaiTabung.lntabung();
                    nilaiTabung.vtabung();
                    break;

                case 3: 
                    System.out.println("-----Kerucut-----");
                    nilaiKerucut = inputKerucut();
                    nilaiKerucut.lakerucut();
                    nilaiKerucut.lpkerucut();
                    nilaiKerucut.lskerucut();
                    nilaiKerucut.vkerucut();
                    break;
                
            }
            
            System.out.println("Thank You....");
            System.out.println(" ");

        }while(pilih > 3);
        angka.close();
    }

    public static Segitiga inputData() {
        Segitiga Sinput ;
        double a , t , x , y , z ;
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan Alas : " );
        a = angka.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        t = angka.nextFloat();
        System.out.print("Masukkan x : ");
        x = angka.nextFloat();
        System.out.print("Masukkan y : ");
        y = angka.nextFloat();
        System.out.print("Masukkan z : ");
        z = angka.nextFloat();
        Sinput = new Segitiga(a , t , x ,y ,z);
        angka.close();
        return Sinput;
    }

    public static Tabung inpuTabung() {
        Tabung Tinput;
        double r , t ;
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        r = angka.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        t = angka.nextFloat();
        Tinput = new Tabung(r, t);
        angka.close();
        return Tinput;
    }

    public static Kerucut inputKerucut() {
        Kerucut Kinput;
        double r , t ;
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        r = angka.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        t = angka.nextFloat();
        Kinput = new Kerucut(r,t);
        angka.close();
        return Kinput;
    }
}
