package Letcode;

public class PrimeNumbers {
    public static void main(String[] args) {
        int sayac=0;
        for(int i=2; i<100; i++){
            for(int k=1; k<100; k++){
                if(i<k){
                    break;
                }
                //Bir sayac tutuyoruz Asal sayılar kendisi ve 1 haric hicbir sayiya bölünemediginden sayac en fazla 2 olabilir.
                if(i%k==0){
                        sayac++;

                }
            }
            //Sayac 2 oluyorsa sayı asal sayidir.
            if(sayac==2){
                System.out.print(i+" ");
            }
            sayac=0;
        }
    }
}
