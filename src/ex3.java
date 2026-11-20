import java.util.Scanner;

public static void main(String[] args) {
    String paraula = "w3resource";
    if (paraula.length() < 2) {
        System.out.println();

    }else {
        String part1 = paraula.substring(0, 2);
        String part2 = paraula.substring(paraula.length() - 2);
        System.out.println(part1 + part2);
    }

}
