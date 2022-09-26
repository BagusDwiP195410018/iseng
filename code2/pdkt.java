import java.util.Scanner;
import java.lang.Math;

public class pdkt {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String pdkt;
        String tembak;
        String jawab;
        String balas;

        System.out.println("kamu mau gak jadi pacarku?");
        tembak = input.nextLine();
        if (tembak.equals("iya aku mau")) {
            System.out.println("yessss. sekarang kita jadian");
            balas = input.nextLine();
            if (balas.equals("kamu janji bakal setia ya")) {
                System.out.println("ya sayankkuh");
            } else {
                System.out.println("kamu juga harus setia");
            }
        } else {
            System.out.println("kenapa kok kamu menolak");
            jawab = input.nextLine();
            if (jawab.equals  ("soalnya kamu terlalu baik")) {
                System.out.println("oh kamu udah punya cowok");
            } else {
                System.out.println("makasih udah mau temenan");
            }
        }
    }
}
