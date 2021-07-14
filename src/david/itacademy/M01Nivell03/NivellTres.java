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
        //Recorro el array inicialitzat
        for (int i = 0; i < miArray.length; i++) {
            //ensenyo por pantalla els valor del array
            System.out.print(miArray[i]+ " ");
            /*
            L'indico amb un condicional que quan el valor de i sigui 10,
            recorri l'array en ordre invertit.
             */
            if(miArray[i]==10){
                System.out.println();
                for (int k = miArray.length-1; k >=0; k--) {
                    System.out.print(miArray[k]+" ");
                    //Quan arriba al valor 1 surt del loop
                }
            }
        }
    }
}
