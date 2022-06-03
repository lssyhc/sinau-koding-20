import java.util.Scanner;

public class Assignment3{
  public static void main(String[] args){
    while(true){
      Scanner scan = new Scanner(System.in);

      System.out.println("##### Menghitung Keliling dan Luas Bangun Datar #####");
      System.out.println("1. Keliling persegi");
      System.out.println("2. Luas persegi");
      System.out.println("3. Keliling persegi panjang");
      System.out.println("4. Luas persegi panjang");
      System.out.println("5. Keliling segitiga");
      System.out.println("6. Luas segitiga");
      System.out.println("7. Keliling lingkaran");
      System.out.println("8. Luas lingkaran");
      System.out.println("9. Keluar");
      System.out.print("Masukkan pilihan Anda (angka)): ");

      String input = scan.nextLine();
      int parseInput = Integer.parseInt(input);
      
      if(parseInput == 1){
        Persegi psg = new Persegi();
        psg.keliling();
      }else if(parseInput == 2){
        Persegi psg = new Persegi();
        psg.luas();
      }else if(parseInput == 3){
        PersegiPanjang psgPjg = new PersegiPanjang();
        psgPjg.keliling();
      }else if(parseInput == 4){
        PersegiPanjang psgPjg = new PersegiPanjang();
        psgPjg.luas();
      }else if(parseInput == 5){
        Segitiga sgt = new Segitiga();
        sgt.keliling();
      }else if(parseInput == 6){
        Segitiga sgt = new Segitiga();
        sgt.luas();
      }else if(parseInput == 7){
        Lingkaran lgkrn = new Lingkaran();
        System.out.println(lgkrn.keliling());
      }else if(parseInput == 8){
        Lingkaran lgkrn = new Lingkaran();
        System.out.println(lgkrn.luas());
      }
      else if(parseInput == 9){
        System.out.println("##### TERIMAKASIH #####");
        break;
      }else{
        System.out.println("##### PILIHAN TIDAK VALID #####");
      }
    }
  }
}

class Persegi{
  Scanner scan = new Scanner(System.in);

  void keliling(){
    System.out.print("Masukkan sisi: ");
    int sisi = scan.nextInt();
    System.out.println("Keliling persegi adalah " + (4 * sisi));
  }

  void luas(){
    System.out.print("Masukkan sisi: ");
    int sisi = scan.nextInt();
    System.out.println("Luas persegi adalah " + (sisi * sisi));
  }
}

class PersegiPanjang{
  Scanner scan = new Scanner(System.in);
  
  void keliling(){
    System.out.print("Masukkan panjang: ");
    int panjang = scan.nextInt();
    System.out.print("Masukkan lebar: ");
    int lebar = scan.nextInt();
    System.out.println("Keliling persegi panjang adalah " + (2 * (panjang + lebar)));
  }

  void luas(){
    System.out.print("Masukkan panjang: ");
    int panjang = scan.nextInt();
    System.out.print("Masukkan lebar: ");
    int lebar = scan.nextInt();
    System.out.println("Luas persegi panjang adalah " + (panjang * lebar));
  }
}

class Segitiga{
  Scanner scan = new Scanner(System.in);
  
  void keliling(){
    System.out.print("Masukkan sisi pertama: ");
    int sisi1 = scan.nextInt();
    System.out.print("Masukkan sisi kedua: ");
    int sisi2 = scan.nextInt();
    System.out.print("Masukkan sisi ketiga: ");
    int sisi3 = scan.nextInt();
    System.out.println("Keliling segitiga adalah " + (sisi1 + sisi2 + sisi3));
  }

  void luas(){
    System.out.print("Masukkan alas: ");
    int alas = scan.nextInt();
    System.out.print("Masukkan tinggi: ");
    int tinggi = scan.nextInt();
    System.out.println("Luas segitiga adalah " + ((alas * tinggi) / 2));
  }
}

class Lingkaran{
  Scanner scan = new Scanner(System.in);
  double pi = Math.PI;

  double keliling(){
    System.out.print("Masukkan diameter lingkaran: ");
    int diameter = scan.nextInt();
    double jariJari = diameter / 2;
    return (2 * pi * jariJari) / (pi * diameter);
  }

  double luas(){
    System.out.print("Masukkan diameter lingkaran: ");
    int diameter = scan.nextInt();
    double jariJari = diameter / 2;
    return pi * jariJari * jariJari;
  }
}