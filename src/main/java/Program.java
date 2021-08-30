
import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escribe algo y luego presiona enter: ");
        String texto = scanner.nextLine();
        char[] arr = texto.toCharArray();
        int n = arr.length;
        String str = "";
        
        for (int i = n-1; i >-1; i--) {
            str=str+arr[i];
        }
        System.out.println(str);
    }
        
}
