package david.itacademy.M01Fase02;

public class FaseSegona {

    public static void main(String[] args) {
        /*
	- Fase 2
	Sabent que l’any 1948 es un any de traspàs:
	Creeu una constant amb el valor de l’any (1948).
	Creeu una variable que guardi cada quan hi ha un any de traspàs
	Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu
	el valor resultant en una variable.
	Mostreu per pantalla el resultat del càlcul.
	Feu servir un bucle for, mostrant tots aquests anys.
	 */
        //Variables constant
        final int ANYTRASPAS=1948;

        //Variable per contar anys
        int guardar=0;
        //Variable any de naixement
        int naixement=1986;

        /*
        Que es un any de traspàs: Any de traspàs és el divisible entre 4, llevat que sigui any secular
        -últim de cada segle, acabat en «00» -, en aquest cas també ha de ser divisible entre 400.
         */
        System.out.println("Anys de tràspas des de " + ANYTRASPAS + " fins " + naixement);
        for (int i = ANYTRASPAS; i < naixement; i++) {
            if(i%4==0){guardar++;
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("Nombre d'anys de tràspas des de " + ANYTRASPAS + " fins " + naixement + ": " + guardar );
    }

}
