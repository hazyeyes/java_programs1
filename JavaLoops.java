import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int result = a;
            int x = 1;
            StringBuilder series = new StringBuilder();
            
            for(int j = 1; j < n+1 ; j++) {
                result += x * b;
                x *= 2;
                series.append(result).append(" ");
            }
            System.out.println((series.toString().trim()));
        }
        in.close();
    }
}   
