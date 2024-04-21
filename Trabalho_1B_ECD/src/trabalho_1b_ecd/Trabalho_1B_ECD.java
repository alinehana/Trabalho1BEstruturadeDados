package trabalho_1b_ecd;

import java.util.Scanner;

public class Trabalho_1B_ECD {
    public static void main(String[] args) {
    //Entrada de Dados do vetor
    Scanner s = new Scanner(System.in);
    System.out.println("Insira o tamanho do vetor: ");
    int N = s.nextInt();
    
    int[] vetor = new int[N];
    System.out.println("Digite os elementos do vetor: ");
    for(int i=0; i<N; i++){
    vetor[i]=s.nextInt();
    }
    
    //Menu de Opcoes
    System.out.println("Escolha o metodo de ordenacao: ");
    System.out.println("1 - Ordenacao por Insercao");
    System.out.println("2 - Ordenacao por Selecao");
    System.out.println("3 - Ordenacao Bolha");
    int opcao = s.nextInt();
    
    // Selecionar e chamar o método de ordenação adequado
    switch (opcao) {
            case 1 -> {
                Ordenacao.insercao(vetor);
            }
            case 2 -> {
                Ordenacao.selecao(vetor);
            }
            case 3 -> {
                Ordenacao.bolha(vetor);
            }
            default -> System.out.println("Opcao invalida");
        }
    }
    //Exibição dos resultados
    public static void exibirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}