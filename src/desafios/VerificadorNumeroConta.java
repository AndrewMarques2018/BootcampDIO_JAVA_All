package desafios;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conta bancária (8 dígitos):");
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);

            // Se não houver exceção, significa que o número de conta é válido
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            // Captura a exceção IllegalArgumentException lançada pela verificação
            System.out.println("Erro: " + e.getMessage());

        } finally {
            // Fechar o scanner para liberar recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (numeroConta.length() != 8) {
            // Lança uma exceção com a mensagem apropriada
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
