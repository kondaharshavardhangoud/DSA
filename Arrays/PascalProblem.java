package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalProblem {
    private static void pascalProblem(int row,int column){
        long result =1;
        for(int i=0;i<column;i++){
            result *=(row-i);
            result /=(i+1);
        }
        System.out.print(result+" ");
    }

    private static void pascalProblem(int row){
        int res1 = 1;
        System.out.print(res1+" ");
        for(int i=1;i<row;i++){
            res1 = res1 * (row-i);
            res1 = res1/i;
            System.out.print(res1+" ");
        }
    }

    private static List<List<Integer>> pascalTriangleProblem(int row){
        List<List<Integer>> result = new ArrayList<>(); 
        for(int i=1;i<=row;i++){
            List<Integer> lt = new ArrayList<>();
            int res2=1;
            lt.add(res2);
            for(int col=1;col<i;col++){
                res2 = res2* (i-col)/col;
                lt.add(res2);
            }
            result.add(lt);
        }
        return result;
    }
    public static void main(String[] args) {
        int r= 6;
        int c = 4;
      //  pascalProblem(r-1, c-1);

        int r1=15;
      //  pascalProblem(r1);

        int n = 5;
        System.out.println(pascalTriangleProblem(n));

    }
}
