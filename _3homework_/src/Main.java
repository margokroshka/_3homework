import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        main13();
    }

    public static void main1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }

    }


    public static void main2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("январь");
        } else if (a == 2) {
            System.out.println("февраль");
        } else if (a == 3) {
            System.out.println("февраль");
        } else if (a == 4) {
            System.out.println("февраль");
        } else if (a == 5) {
            System.out.println("февраль");
        } else if (a == 6) {
            System.out.println("февраль");
        } else if (a == 7) {
            System.out.println("февраль");
        } else if (a == 8) {
            System.out.println("февраль");
        } else if (a == 9) {
            System.out.println("февраль");
        } else if (a == 10) {
            System.out.println("февраль");
        } else if (a == 11) {
            System.out.println("февраль");
        } else if (a == 12) {
            System.out.println("февраль");
        } else {
            System.out.println("нет такого месяца");
        }

    }

    public static void main3() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Четное");
        }
    }

    public static void main4() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > (-5)) {
            System.out.println("warm");
        } else if (t > (-20) && ((-5) >= t)) {
            System.out.println("normal");
        } else if (t > (-20) && ((-5) >= t)) {
            System.out.println("cold");
        }
    }


    public static void main5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("желтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
            case 5:
                System.out.println("голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("феолетовый");
                break;
            default:
                System.out.println("нет такого цвета");
        }
    }

    public static void main6() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main7() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

    }

    public static void main8() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int s = 1;
        for (int i = 1; i < x + 1; i++) {
            s = (i + x);
        }
        System.out.println(s);
    }

    public static void main9() {
        int x = 7;
        int r = 0;
        while (r <= 91) {
            r = r + x;
            System.out.println(r);
        }
    }


    public static void main10() {
        int x = (-5);
        int r = 0;
        while (r >=-(40)) {
            System.out.println(r);
            r = r +x;
            System.out.println(r);
        }
    }

    public static void main11() {

        int r = 10;
        int s ;
        while (r <=20) {
            s = r *r;
            System.out.println(s);
            r++;
        }
    }

    public static void main12() {
        int x=1;
        int y=1;
        int z;
        System.out.print(x+" " +y+" "+ " ");
        for (int i = 3; i <=11; i++) {
            z = (y + x);
            System.out.print(z+" " );
            x=y;
            y=z;
        }
        System.out.println( );
    }

    public static void main14() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if ( (i *j) == i  ) {//|| (i - j) == 3 || (i - j) == 4) {
                    System.out.print(i);
                } else if ( (i *j) == j){
                    System.out.print(" "+j+" ");
                }
                else if ( (i *j) == j*2){
                    System.out.print(" "+(j*2)+" ");
                }
                else if ( (i *j) == i*2){
                    System.out.print(" "+(i*2)+" ");
                }
                else if ( (i *j) == j*3){
                    System.out.print(" "+(j*3)+" ");
                }
                else if ( (i *j) == i*3){
                    System.out.print(" "+(i*3)+" ");
                }
                else if ( (i *j) == j*4){
                    System.out.print(" "+(j*4)+" ");
                }
                else if ( (i *j) == i*4){
                    System.out.print(" "+(i*4)+" ");
                }
                else if ( (i *j) == j*5){
                    System.out.print(" "+(j*5)+" ");
                }
                else if ( (i *j) == i*5){
                    System.out.print(" "+(i*5)+" ");
                }
                else if ( (i *j) == j*6){
                    System.out.print(" "+(j*6)+" ");
                }
                else if ( (i *j) == i*6){
                    System.out.print(" "+(i*6)+" ");
                }
                else if ( (i *j) == j*7){
                    System.out.print(" "+(j*7)+" ");
                }
                else if ( (i *j) == i*7){
                    System.out.print(" "+(i*7)+" ");
                }
                else if ( (i *j) == j*8){
                    System.out.print(" "+(j*8)+" ");
                }
                else if ( (i *j) == i*8){
                    System.out.print(" "+(i*8)+" ");
                }
                else if ( (i *j) == j*9){
                    System.out.print(" "+(j*9)+" ");
                }
                else if ( (i *j) == i*9){
                    System.out.print(" "+(i*9)+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main13() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        float s = (float) x;
        int y = scann.nextInt();
        for (int i = 1; i <=y; i++) {
            s=s+s*0.07f;
        }
        System.out.println("Конечная сумма вклада составляет:"+s);
    }
}
