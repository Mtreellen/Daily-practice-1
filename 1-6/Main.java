package practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ellen
 * @date 2019-01-06 23:06
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String desc = scanner.nextLine();
        String src = scanner.nextLine();
        System.out.println(strDelete(desc, src));
    }
    private static StringBuilder strDelete(String desc, String src) {
        ArrayList<Character> listDesc = new ArrayList<>();
        ArrayList<Character> listSrc = new ArrayList<>();
        char[] descs = desc.toCharArray();
        char[] srcs = src.toCharArray();
        for (char ch : descs) {
            listDesc.add(ch);
        }
        for (char ch : srcs){
            listSrc.add(ch);
        }
        listDesc.removeAll(listSrc);
        StringBuilder sb = new StringBuilder();
        for (char ch : listDesc){
            sb.append(ch);
        }
        return sb;
    }
}
