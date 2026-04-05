//NIM : 13020240084
//NAMA : ZULFAJRIN
//HARI : JUMAT
/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
    public static void main(String[] args) {

        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;


        Bool1 = true; Bool2 = false;

        TF = Bool1 && Bool2;
        System.out.println("Bool1 && Bool2 = " + TF);

        TF = Bool1 || Bool2;
        System.out.println("Bool1 || Bool2 = " + TF);

        TF = !Bool1;
        System.out.println("!Bool1 = " + TF);

        TF = Bool1 ^ Bool2;
        System.out.println("Bool1 ^ Bool2 = " + TF);

        i = 5; j = 2;

        hsl = i + j;
        System.out.println("i + j = " + hsl);

        hsl = i - j;
        System.out.println("i - j = " + hsl);

        hsl = i * j;
        System.out.println("i * j = " + hsl);

        hsl = i / j;
        System.out.println("i / j = " + hsl);

        hsl = i % j;
        System.out.println("i % j = " + hsl);

        x = 5; y = 5;

        res = x + y;
        System.out.println("x + y = " + res);

        res = x - y;
        System.out.println("x - y = " + res);

        res = x * y;
        System.out.println("x * y = " + res);

        res = x / y;
        System.out.println("x / y = " + res);

        System.out.println("i == j : " + (i == j));
        System.out.println("i != j : " + (i != j));
        System.out.println("i < j  : " + (i < j));
        System.out.println("i > j  : " + (i > j));
        System.out.println("i <= j : " + (i <= j));
        System.out.println("i >= j : " + (i >= j));

        System.out.println("x != y : " + (x != y));
        System.out.println("x < y  : " + (x < y));
        System.out.println("x > y  : " + (x > y));
        System.out.println("x <= y : " + (x <= y));
        System.out.println("x >= y : " + (x >= y));
    }
}