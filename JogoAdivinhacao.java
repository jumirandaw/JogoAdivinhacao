import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Gera um número aleatório entre 1 e 100
        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1; // número entre 1 e 100
        
        // Define o número máximo de tentativas
        int tentativasMaximas = 10;
        int tentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");
        
        // Loop até o jogador acertar ou esgotar as tentativas
        while (tentativas < tentativasMaximas) {
            System.out.print("Digite sua tentativa: ");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                acertou = true;
                break;
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("O número sorteado é menor que " + palpite + ". Tente novamente.");
            }
        }
        
        // Caso o jogador não tenha acertado o número
        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número sorteado era: " + numeroSorteado);
        }
        
        scanner.close();
    }
}
