package trabalho_1b_ecd;

import static trabalho_1b_ecd.Trabalho_1B_ECD.exibirVetor;

public class Ordenacao {
    public static void insercao(int[] vetor) {
        int chave; //o primeiro valor a ser obtido, como começa pelo segundo do vetor, é o 20, no caso
        int j; //diz a posicao do segundo laço
        
        for(int i=1; i<vetor.length; i++){
            chave = vetor[i]; //chave recebe o elemento do vetor i
            
            for(j=i-1;(j>=0 && vetor[j]>chave ); j--){
            vetor[j+1] = vetor[j]; //é quando troca de posição
        }
            vetor[j+1] = chave;
        }
        
        String msg = "";
        for (int i=0; i<vetor.length;i++){
            msg = msg + vetor[i] +  " - ";
        }
        System.out.println("Vetor ordenado por insercao:");
        exibirVetor(vetor);
    }
    
    public static void selecao(int[] vetor) {
        //VERIFICA AS POSICOES
        //temos dois laços de repetição
         for (int i=0; i<vetor.length;i++){ //primeiro laço
             int posicaoMenor = i; //chave
             
             for(int j=i+1;j<vetor.length;j++){ //segundo laço, que está sempre a direita do primeiro laço (por isso o +1)
                 if(vetor[j]<vetor[posicaoMenor]){
                     posicaoMenor = j;
                 }
             }
         
         //REALIZA A TROCA DAS POSICOES DEPOIS DE VERIFICAR
         if(posicaoMenor !=i){
             int aux=vetor[i];
             vetor[i]=vetor[posicaoMenor]; //Faz a troca
             vetor[posicaoMenor]=aux;
         }
         }
         
        String msg = "";
        for (int i=0; i<vetor.length;i++){
            msg = msg + vetor[i] +  " - ";
        }
        System.out.println("Vetor ordenado por selecao:");
        exibirVetor(vetor);
    }
    
    public static void bolha(int[] vetor) {
        boolean houveTroca=true;
        
        while(houveTroca){
            houveTroca=false;
            
            for(int i=0;i<vetor.length-1;i++){
                if(vetor[i]>vetor[i+1]){
                    int aux=vetor[i];
                    vetor[i]=vetor[i+1];
                    vetor[i+1]=aux;
                    houveTroca=true;
                }
            }
        }
        String msg = "";
        for (int i=0; i<vetor.length;i++){
            msg = msg + vetor[i] +  " - ";
        }
        System.out.println("Vetor ordenado por bolha:");
        exibirVetor(vetor);
    }
}