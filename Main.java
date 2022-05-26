import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input data");
        Scanner scanner = new Scanner(System.in);
        int Sx1 = scanner.nextInt();
        int Sy1 = scanner.nextInt();
        int Sx2 = scanner.nextInt();
        int Sy2 = scanner.nextInt();
        int H = scanner.nextInt();
        int C1x = scanner.nextInt();
        int C1y = scanner.nextInt();
        int C2x = scanner.nextInt();
        int C2y = scanner.nextInt();
        int C3x = scanner.nextInt();
        int C3y = scanner.nextInt();
        int dmg = 0;

        //new coordination system
        Sy1 = Sy1 - H;
        Sy2 = Sy2 - H;
        C1y = C1y - H;
        C2y = C2y - H;
        C3y = C3y - H;

        // angle check

        if (C1x == Sx1 && C1y == (-Sy1)) {
            dmg = dmg + 25;
        }
        if (C2x == Sx1 && C2y == (-Sy1)) {
            dmg = dmg + 25;
        }
        if (C3x == Sx1 && C3y == (-Sy1)) {
            dmg = dmg + 25;
        }
        if (C1x == Sx2 && C1y == (-Sy2)) {
            dmg = dmg + 25;
        }
        if (C2x == Sx2 && C2y == (-Sy2)) {
            dmg = dmg + 25;
        }
        if (C3x == Sx2 && C3y == (-Sy2)) {
            dmg = dmg + 25;
        }

        if (C1x == Sx2 && C1y == (-Sy1)) {
            dmg = dmg + 25;
        }
        if (C2x == Sx2 && C2y == (-Sy1)) {
            dmg = dmg + 25;
        }
        if (C3x == Sx2 && C3y == (-Sy1)) {
            dmg = dmg + 25;
        }
        if (C1x == Sx1 && C1y == (-Sy2)) {
            dmg = dmg + 25;
        }
        if (C2x == Sx1 && C2y == (-Sy2)) {
            dmg = dmg + 25;
        }
        if (C3x == Sx1 && C3y == (-Sy2)) {
            dmg = dmg + 25;
        }

        // line check
        // down line
        if (C1y == (-Sy2) && ((C1x > Sx1 && C1x < Sx2) || (C1x < Sx1 && C1x > Sx2))) {
            dmg = dmg + 50;
        }
        if (C2y == (-Sy2) && ((C2x > Sx1 && C2x < Sx2) || (C2x < Sx1 && C2x > Sx2))) {
            dmg = dmg + 50;
        }
        if (C3y == (-Sy2) && ((C3x > Sx1 && C3x < Sx2) || (C3x < Sx1 && C3x > Sx2))) {
            dmg = dmg + 50;
        }
        // upper line
        if (C1y == (-Sy1) && ((C1x > Sx1 && C1x < Sx2) || (C1x < Sx1 && C1x > Sx2))) {
            dmg = dmg + 50;
        }
        if (C2y == (-Sy1) && ((C2x > Sx1 && C2x < Sx2) || (C2x < Sx1 && C2x > Sx2))) {
            dmg = dmg + 50;
        }
        if (C3y == (-Sy1) && ((C3x > Sx1 && C3x < Sx2) || (C3x < Sx1 && C3x > Sx2))) {
            dmg = dmg + 50;
        }
        //right line

        if (C1x == Sx1 && ((C1y > Sy1 && C1y < Sy2) || (C1y < Sy1 && C1y > Sy2))) {
            dmg = dmg + 50;
        }
        if (C2x == Sx1 && ((C2y > Sy1 && C2y < Sy2) || (C2y < Sy1 && C2y > Sy2))) {
            dmg = dmg + 50;
        }
        if (C3x == Sx1 && ((C3y > Sy1 && C3y < Sy2) || (C3y < Sy1 && C3y > Sy2))) {
            dmg = dmg + 50;
        }
        //left line
        if (C1x == Sx2 && ((C1y > Sy1 && C1y < Sy2) || (C1y < Sy1 && C1y > Sy2))) {
            dmg = dmg + 50;
        }
        if (C2x == Sx2 && ((C2y > Sy1 && C2y < Sy2) || (C2y < Sy1 && C2y > Sy2))) {
            dmg = dmg + 50;
        }
        if (C3x == Sx2 && ((C3y > Sy1 && C3y < Sy2) || (C3y < Sy1 && C3y > Sy2))) {
            dmg = dmg + 50;
        }
        //body

        if((C1x > Sx1 && C1x < Sx2) || (C1x < Sx1 && C1x > Sx2) && (C1y > Sy1 && C1y < Sy2) || (C1y < Sy1 && C1y > Sy2)){
            dmg = dmg + 100;
        }
        if((C2x > Sx1 && C2x < Sx2) || (C2x < Sx1 && C2x > Sx2) && (C2y > Sy1 && C2y < Sy2) || (C2y < Sy1 && C2y > Sy2)){
            dmg = dmg + 100;
        }
        if((C3x > Sx1 && C3x < Sx2) || (C3x < Sx1 && C3x > Sx2) && (C3y > Sy1 && C3y < Sy2) || (C3y < Sy1 && C3y > Sy2)){
            dmg = dmg + 100;
        }
        System.out.println(dmg + "%");

            }
        }