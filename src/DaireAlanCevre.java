import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[]args) {
        int r;
        double pi=3.14,alan,alfa;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz:");
        r=inp.nextInt();
        System.out.print("Dairenin merkez aci olcusunu giriniz :");
        alfa=inp.nextInt();
        alan=(pi*(r*r)*alfa)/360;
        System.out.println("Dairenin Diliminin Alani:"+alan);

    }
}
