import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k,i,toplam=0,bolum=0,ortalama;
        System.out.println("Kaça Kadar: ");
        Scanner input = new Scanner(System.in);
        k = input.nextInt();


        for(i=1;i<k;i++){
            if(i % 12 == 0){


                toplam = toplam+i;
                bolum++;
                ortalama = toplam/bolum;
                System.out.println(ortalama);


            }
        }



    }
}