public class Assignment{
  public static void main(String args[]){
    /*
    Buatlah aplikasi untuk menampilkan angka 1-50, ketika angka n habis dibagi 3 maka keluar tulisan "n habis dibagi 3", dan jika n habis dibagi 5 maka keluar tulisan "n habis dibagi 5"
    */
    for(int n = 1; n <= 50; n++){
      System.out.println(n);
      if(n % 3 == 0){
        System.out.println(n + " habis dibagi 3");
      }else if(n % 5 == 0){
        System.out.println(n + " habis dibagi 5");
      }
    }
  }
}