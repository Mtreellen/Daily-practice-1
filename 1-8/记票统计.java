package 每日一题.day26;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-09 17:43
 * @description
 */
public class 记票统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n1 = Integer.parseInt(scanner.nextLine());
            String s1 = scanner.nextLine();
            int n2 = Integer.parseInt(scanner.nextLine());
            String s2 = scanner.nextLine();
            GetVoteResult(s1,s2,n1,n2);
        }
    }

    private static void GetVoteResult(String s1,String s2,int n1,int n2){
        int invalid = 0;
        String[] split1 = s1.split("\\s");
        int[] count = new int[n1];
        String[] split2 = s2.split("\\s");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(split1[i].equals(split2[j])){

                    count[i] ++;
                }
            }
        }
        int temp = 0;
        for(int i=0;i<n1;i++){
            temp += count[i];
        }
        invalid = n2-temp;

        for(int i=0;i<n1;i++){
            System.out.println(split1[i]+" "+":"+" "+count[i]);
        }
        System.out.println("Invalid : "+invalid);
    }
}
