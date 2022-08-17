import java.util.Scanner;

public class UsAlma {
        static int pow(int base,int exp){
            //eger taban 1 veya us 0 ise 1 döndürecek
            if (base == 1 || exp == 0) {
                return 1;
            }
            //taban, ornek: 3 ise 3*2*1 e kadar
            return pow(base,exp-1)*base;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b,e;
        System.out.println("tabani : ");
        b= scanner.nextInt();
        System.out.println("usu : ");
        e = scanner.nextInt();
        System.out.println(pow(b,e));


    }
}
