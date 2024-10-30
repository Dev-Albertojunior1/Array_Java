public class traverse {

    public static void main (String[] args){
        int LA[] = {1,3,5,7,9};

        System.out.print("The original array elements are:\n ");

        for (int i=0;i<LA.length;i++){
            System.out.printf("LA[%d] = %d \n" , i , LA[i]);
        }
    }
}

//LA[%d] exibe o índice do elemento, onde %d será substituído pelo valor de i.
//= %d exibe o valor do elemento do array LA[i], onde %d será substituído pelo valor contido em LA[i].
//        \n adiciona uma nova linha após cada elemento exibido.
//        Parâmetros:
//i é passado como primeiro parâmetro e substitui o primeiro %d.
//        LA[i] é passado como segundo parâmetro e substitui o segundo %d.