import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        int peso = sc.nextInt();
        System.out.print("Digite a sua altura (em metros): ");
        double alturaCorporal = sc.nextDouble();

        double Imc = peso / (alturaCorporal * alturaCorporal);
        System.out.println("Seu IMC é: " + Imc);

        if (Imc >= 18.5 && Imc <= 25) {
            System.out.println("Você está no peso ideal");
        } else {
            System.out.println("Você está fora do peso ideal");
        }

        sc.close();

    }
}
