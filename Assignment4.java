import java.util.*;

public class Assignment4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    try{
      while(true){
        System.out.println("##### Menghitung Keliling dan Luas Bangun Datar #####");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan Anda (angka)): ");

        int input = scan.nextInt();

        if(input == 5){
          System.out.println("##### TERIMAKASIH #####");
          break;
        }
        
        switch(input){
          case 1:
            Persegi persegi = new Persegi();
            int konfirmasiPersegi = konfirmasi();

            if(konfirmasiPersegi == 1){
              double kelPersegi = persegi.keliling();
              int kelPersegiInt = (int)kelPersegi;
              System.out.println("Keliling persegi adalah " + kelPersegiInt);
            }else if(konfirmasiPersegi == 2){
              persegi.luas();
            }
            break;

          case 2:
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            int konfirmasiPersegiPanjang = konfirmasi();

            if(konfirmasiPersegiPanjang == 1){
              double kelPersegiPanjang = persegiPanjang.keliling();
              int kelPersegiPanjangInt = (int)kelPersegiPanjang;
              System.out.println("Keliling persegi panjang adalah " + kelPersegiPanjangInt);
            }else if(konfirmasiPersegiPanjang == 2){
              persegiPanjang.luas();
            }
            break;

          case 3:
            Segitiga segitiga = new Segitiga();
            int konfirmasiSegitiga = konfirmasi();

            if(konfirmasiSegitiga == 1){
              double kelSegitiga = segitiga.keliling();
              int kelSegitigaInt = (int)kelSegitiga;
              System.out.println("Keliling segitiga adalah " + kelSegitigaInt);
            }else if(konfirmasiSegitiga == 2){
              segitiga.luas();
            }
            break;

          case 4:
            Lingkaran lingkaran = new Lingkaran();
            int konfirmasiLingkaran = konfirmasi();

            if(konfirmasiLingkaran == 1){
              System.out.println("Keliling lingkaran adalah " + lingkaran.keliling());
            }else if(konfirmasiLingkaran == 2){
              lingkaran.luas();
            }
            break;

          default:
            System.out.println("##### PILIHAN TIDAK VALID #####");
        }
      }
    }catch(InputMismatchException e){
      System.out.println("##### INPUT YANG DIMASUKKAN HARUS BERUPA ANGKA #####");
    }
  }

  public static int konfirmasi(){
    Scanner scan = new Scanner(System.in);

    System.out.println("Mau menghitung apa?");
    System.out.println("1. Keliling\n2. Luas");
    System.out.print("Masukkan pilihan Anda (angka): ");
    return scan.nextInt();
  }
}

abstract class Keliling{
  public abstract double keliling();
}

interface Luas{
  public void luas();
}

class Persegi extends Keliling implements Luas{
  Scanner scan = new Scanner(System.in);

  @Override
  public double keliling(){
    System.out.print("Masukkan sisi: ");
    int sisi = scan.nextInt();
    return 4 * sisi;
  }

  @Override
  public void luas(){
    System.out.print("Masukkan sisi: ");
    int sisi = scan.nextInt();
    System.out.println("Luas persegi adalah " + (sisi * sisi));
  }
}

class PersegiPanjang extends Keliling implements Luas{
  Scanner scan = new Scanner(System.in);

  @Override
  public double keliling(){
    System.out.print("Masukkan panjang: ");
    int panjang = scan.nextInt();
    System.out.print("Masukkan lebar: ");
    int lebar = scan.nextInt();
    return 2 * (panjang + lebar);
  }

  @Override
  public void luas(){
    System.out.print("Masukkan panjang: ");
    int panjang = scan.nextInt();
    System.out.print("Masukkan lebar: ");
    int lebar = scan.nextInt();
    System.out.println("Luas persegi panjang adalah " + (panjang * lebar));
  }
}

class Segitiga extends Keliling implements Luas{
  Scanner scan = new Scanner(System.in);

  @Override
  public double keliling(){
    System.out.print("Masukkan sisi pertama: ");
    int sisi1 = scan.nextInt();
    System.out.print("Masukkan sisi kedua: ");
    int sisi2 = scan.nextInt();
    System.out.print("Masukkan sisi ketiga: ");
    int sisi3 = scan.nextInt();
    return sisi1 + sisi2 + sisi3;
  }

  @Override
  public void luas(){
    System.out.print("Masukkan alas: ");
    int alas = scan.nextInt();
    System.out.print("Masukkan tinggi: ");
    int tinggi = scan.nextInt();
    System.out.println("Luas segitiga adalah " + ((alas * tinggi) / 2));
  }
}

class Lingkaran extends Keliling implements Luas{
  Scanner scan = new Scanner(System.in);
  double pi = Math.PI;

  @Override
  public double keliling(){
    System.out.print("Masukkan diameter lingkaran: ");
    int diameter = scan.nextInt();
    double jariJari = diameter / 2;
    return (2 * pi * jariJari) / (pi * diameter);
  }

  @Override
  public void luas(){
    System.out.print("Masukkan diameter lingkaran: ");
    int diameter = scan.nextInt();
    double jariJari = diameter / 2;
    System.out.println("Luas lingkaran adalah " + (pi * jariJari * jariJari));
  }
}