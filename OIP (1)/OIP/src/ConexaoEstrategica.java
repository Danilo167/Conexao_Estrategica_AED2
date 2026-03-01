import java.util.Scanner;

public class ConexaoEstrategica {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int R = leitor.nextInt();
        int C = leitor.nextInt();
        int M = leitor.nextInt();

        int[][] matriz = new int[R][C];

        int contador = 1;

        for (int i = 0; i < R; i++) {

            for (int j = 0; j < C; j++) {
                matriz[i][j] = contador;

                contador++;

                if (contador >M) {
                    contador = 1;
                }
            }
        }

        for (int i = 1; i < R; i++)  {

            for (int j = 0; j < C; j++) {

                int valorMenor = matriz[i - 1][j];

                if (j > 0) {

                    if (matriz[i - 1][j - 1] < valorMenor) {
                        valorMenor = matriz[i - 1][j - 1];
                    }
                }

                if (j<C - 1) {

                    if (matriz[i - 1][j + 1] < valorMenor) {
                        valorMenor = matriz[i - 1][j + 1];
                    }
                }

                matriz[i][j] += valorMenor;
            }
        }

        int P = matriz[R - 1][0];

        for (int j = 1; j < C; j++) {

            if (matriz[R - 1][j] < P) {
                P = matriz[R - 1][j];
            }
        }

        System.out.println(P);

        leitor.close();

    }
}

