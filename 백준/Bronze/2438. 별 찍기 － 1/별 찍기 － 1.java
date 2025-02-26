import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<=n-1; i++){
            for(int j=0 ;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
		br.close();
    
    }
}