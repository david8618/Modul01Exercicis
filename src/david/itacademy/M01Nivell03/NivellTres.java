package david.itacademy.M01Nivell03;

public class NivellTres {

    public static void main(String[] args) {
    /*
	Nivell 3
	Declara un array de numeros int e inicialitzala amb valors
	del 1 al 10 Rota l’array sense utilitzar un array auxiliar ni llibreries.
	Pots utilizar una variable auxiliar.
	 */
        //Array int amb valors del 1 al 10
        int[] miArray = {1,2,3,4,5,6,7,8,9,10};
        //Variable Auxiliar
        int numActual;
        //Imprimeixo l'array en l'ordre correcte
        for (int i:miArray) { System.out.print(i + " "); }
        //Utilitzo el mètode bombolla invertit
        for (int i = 0; i < miArray.length; i++) {
            for (int j=0; j < miArray.length-1; j++) {
                if(miArray[j]<miArray[j+1]) { //Si número actual es < número següent
                    //Utilitzo la variable Auxiliar
                    numActual = miArray[j]; //la nova variable guardara el valor del numero actual del array
                    miArray[j] = miArray[j + 1]; //al array li donem el valor del numero següent
                    miArray[j + 1] = numActual; // finalment el número següent li donem el valor que hi havia a la variable auxiliar
                }
            }
        }
        System.out.println();
        //Imprimim per pantalla la array ordenat al reves
        for (int j: miArray) { System.out.print(j + " "); }
    }
}
