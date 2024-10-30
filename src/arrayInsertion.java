import java.util.Arrays;

public class arrayInsertion {

    public static void main(String[] args) {

        // Inicializa o array com valores fixos
        int my_array[] = {24, 14, 56, 85, 36};

        // Define a posição do índice onde o novo valor será inserido, position 3
        int Index_position = 2;

        // Define o novo valor que será inserido

        int newValue = 5;



        // Exibe o array original antes da inserção
        System.out.println("Original Array before insertion: \n" + Arrays.toString(my_array));

        // Loop para deslocar os elementos para a direita
        for (int i = my_array.length - 1; i > Index_position; i--) {
            // Atribui o valor do elemento anterior ao elemento atual
            my_array[i] = my_array[i - 1];
        }

        // Insere o novo valor na posição especificada
        my_array[Index_position] = newValue;

        // Exibe o array modificado após a inserção
        System.out.println("New Array after insertion of value 5 : \n" + Arrays.toString(my_array));
    }
}
//
//Passo a Passo do Loop
//Início do Loop no Último Índice:
//
//O loop começa no último índice do array, que é my_array.length - 1.
//        Por exemplo, se o array tem 5 elementos, o último índice será 4 (5 - 1 = 4).


//Deslocamento dos Valores para a Direita:
//
//Em cada iteração do loop, o código my_array[i] = my_array[i - 1]; copia o valor do índice anterior (i - 1) para o índice atual (i).
//Isso desloca o valor do índice anterior para o índice atual, movendo-o uma posição para a direita.
//O loop continua fazendo isso de trás para frente (do último elemento até a posição Index_position + 1), garantindo que cada valor no array é deslocado apenas uma posição, sem perder nenhum dado.


//Condição de Parada:
//
//O loop para quando i é igual a Index_position + 1. Isso deixa a posição Index_position "livre" (sem ser sobrescrita pelo valor à direita).
//Agora, a posição Index_position estará disponível para receber o novo valor (newValue), sem sobrescrever nenhum dos valores originais.

