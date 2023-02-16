
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < N;i++)
            list.add(in.nextInt());
        int sum = 0;
        for (Integer L : list) {
            sum+=L;
        }
        int max = sum / K;
        for(int i = max; i > 0; i--){
            int temp = 0;
            for (Integer L : list)
                temp += L / i;
            if(temp == K) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
