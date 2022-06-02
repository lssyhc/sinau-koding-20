public class Assignment2{
  public static void main(String args[]){
    // Buatlah aplikasi untuk membadingan antara bilangan prima dan bukan prima menggukan for

    int number = 25;

    for(int i = 1; i <= number; i++){
      int divider = 0;
      for(int j = 1; j <= i; j++){
        if(i%j == 0){
          divider++;
        }
      }

      if(divider == 2){
        System.out.println(i + " bilangan prima");
      }else{
        System.out.println(i + " bukan bilangan prima");
      }
    }
  }
}