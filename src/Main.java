//Andrés Felipe Ortega Cárdenas


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sedan sedan = new sedan();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Que?");
        int op = teclado.nextInt();

        switch (op){
            case 1:
                sedan.gas();
            break;
            case 2:
                sedan.brake();
            break;
        }
    }
}