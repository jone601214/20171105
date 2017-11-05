import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        switch (a)
        { case 1:
            if(a<=19)
                System.out.printf("Capricorn");
            else
                System.out.printf("Aquarius");
            break;
            case 2:
                if(a<=18)
                    System.out.printf("Aquarius");
                else
                    System.out.printf("Pisces");
                break;
            case 3:
                if(a<=20)
                    System.out.printf("Pisces");
                else
                    System.out.printf("Aries");
                break;
            case 4:
                if(a<=19)
                    System.out.printf("Aries");
                else
                    System.out.printf("Taurus");
                break;
            case 5:
                if(a<=20)
                    System.out.printf("Taurus");
                else
                    System.out.printf("Gemini");
                break;
            case 6:
                if(a<=21)
                    System.out.printf("Gemini");
                else
                    System.out.printf("Cancer");
                break;
            case 7:
                if(a<=22)
                    System.out.printf("Cancer");
                else
                    System.out.printf("Leo");
                break;
            case 8:
                if(a<=22)
                    System.out.printf("Leo");
                else
                    System.out.printf("Virgo");
                break;
            case 9:
                if(a<=22)
                    System.out.printf("Virgo");
                else
                    System.out.printf("Libra");
                break;
            case 10:
                if(a<=23)
                    System.out.printf("Libra");
                else
                    System.out.printf("Scorpio");
                break;
            case 11:
                if(a<=22)
                    System.out.printf("Scorpio");
                else
                    System.out.printf("Sagittarius");
                break;
            case 12:
                if(a<=21)
                    System.out.printf("Sagittarius");
                else
                    System.out.printf("Capricorn");
                break;
        }
    }
}
