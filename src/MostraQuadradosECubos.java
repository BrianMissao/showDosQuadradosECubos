import java.util.Scanner;

public class MostraQuadradosECubos {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroDeLinhasAMostrar = obterNumeroDeLinhasAMostrar("Show dos quadrados e cubos\nDigite o número de linhas a mostrar:");
        mostrar(numeroDeLinhasAMostrar);
    }

    private static int obterNumeroDeLinhasAMostrar(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }

    private static void mostrar(int numeroDeLinhasAMostrar) {
        int quadradoDoNumeroDaLinhaSendoMostradaNoMomento = 0;
        int cuboDoNumeroDaLinhaSendoMostradaNoMomento = 0;
        for (int numeroDaLinhaSendoMostradaNoMomento = 1; numeroDaLinhaSendoMostradaNoMomento <= numeroDeLinhasAMostrar; numeroDaLinhaSendoMostradaNoMomento++) {
            quadradoDoNumeroDaLinhaSendoMostradaNoMomento = numeroDaLinhaSendoMostradaNoMomento * numeroDaLinhaSendoMostradaNoMomento;
            cuboDoNumeroDaLinhaSendoMostradaNoMomento = quadradoDoNumeroDaLinhaSendoMostradaNoMomento * numeroDaLinhaSendoMostradaNoMomento;
            System.out.printf("%d %d %d%n", numeroDaLinhaSendoMostradaNoMomento, quadradoDoNumeroDaLinhaSendoMostradaNoMomento, cuboDoNumeroDaLinhaSendoMostradaNoMomento);
        }
    }
}
