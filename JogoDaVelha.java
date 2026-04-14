import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jogadorAtual = 'X';
        boolean jogoAcabou = false;
        Scanner scanner = new Scanner(System.in);

        while (!jogoAcabou) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", digite linha e coluna (0-2): ");

            int linha = scanner.nextInt();
            int col = scanner.nextInt();

            if (linha >= 0 && linha < 3 && col >= 0 && col < 3 && tabuleiro[linha][col] == ' ') {
                tabuleiro[linha][col] = jogadorAtual;
                jogoAcabou = verificarVitoria(tabuleiro, jogadorAtual);

                if (jogoAcabou) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                } else if (tabuleiroCheio(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Empate! Deu velha.");
                    jogoAcabou = true;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimento inválido. Tente novamente.");
            }
        }
        scanner.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean verificarVitoria(char[][] t, char j) {
        // Linhas e Colunas
        for (int i = 0; i < 3; i++) {
            if ((t[i][0] == j && t[i][1] == j && t[i][2] == j) ||
                    (t[0][i] == j && t[1][i] == j && t[2][i] == j)) return true;
        }
        // Diagonais
        return (t[0][0] == j && t[1][1] == j && t[2][2] == j) ||
                (t[0][2] == j && t[1][1] == j && t[2][0] == j);
    }

    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
