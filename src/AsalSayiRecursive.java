import java.util.Scanner;
public class AsalSayiRecursive {
    /*1 ile 100 arası asal int sayi;
    for (int i = 2; i <= 100; i++) {
     sayi = 0;
     for (int j = 2; j <= i / 2; j++) {
      if (i % j == 0)
     sayi++;
       }
       if(sayi==0){
       System.out.println(i);
       }*/
    static void Asal(int sayi, int i) {
        if (i == sayi) {
            System.out.print(" asal sayidir.");
            return;
        } else if (sayi % i == 0) {
            System.out.print(" asal değildir.");
            return;
        }
        Asal(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();

        Asal(sayi, 2);
    }
}
