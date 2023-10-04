import java.util.Scanner;
public class sumpahcumanyoba{
    public static void main(String[] args) {
        Scanner input0 = new Scanner (System.in);
        double jumlah, angka1, angka2 ;
        char operator;
        System.out.print("masukkan angka :");
        angka1 = input0.nextDouble();
        System.out.print("masukkan angka kedua");
        angka2 = input0.nextDouble();
        System.out.println("operator:");
        operator = input0.next().charAt(0);

    switch (operator){
        case '+':
            jumlah= angka1 + angka2;
            System.out.println(angka1 + "+" + angka2 + "=" + jumlah );
            break;
        case '-':
            jumlah = angka1 - angka2;
            System.out.println(angka1 + "-" + angka2 + "=" + jumlah);
            break;


    }

        




    }
}