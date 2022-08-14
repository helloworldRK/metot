import java.util.Scanner;
public class PalindromSayi {
        static void b(){
           int ters=0;
            Scanner input=new Scanner(System.in);
            System.out.println("bir sayi girin");
            int sayi=input.nextInt();
            int gecici=sayi;
            while(sayi!=0){
                int bas=sayi%10;
                ters=ters*10+bas;
                sayi/=10;
            }
            if(ters==gecici){
                System.out.println("Sayiniz Palindrom");
            }
        else{
                System.out.println("palindrom degil");
            }
        }
    public static void main(String[] args) {
        b();

    }
}
