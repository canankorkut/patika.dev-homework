import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        for(int i = 2; i < 100; i++){
            boolean kontrol = true;
            for(int k = 2; k < i; k++){
                if ( i % k == 0){
                    kontrol = false;
                    break;
                }
            }
            if (kontrol){
                System.out.print(i + " ");
            }
        }

    }
}
