import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Main {
    public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int num = Integer.parseInt(br.readLine());
        
        System.out.println(s.charAt(num-1));
        
        br.close();
        
    }
}