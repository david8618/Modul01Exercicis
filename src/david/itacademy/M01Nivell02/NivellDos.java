package david.itacademy.M01Nivell02;

public class NivellDos {

    public static void main(String[] args) {
    /*
	Nivell 2
	Declara una variable double. Assigna-li un valor amb 4 decimals
	Declara variables de tipus: int, float i string
	Fes un "cast" de la variable double a cada una de les variables
	que has creat anteriorment per inicialitzar-les i pinta-les per pantalla.
	 */
        //Variable double
        double a=3.1415;
        //Variables int, float i string
        int b;
        float c;
        String miVariable;

        //Casting de double a int
        b=(int)a;
        System.out.println("El resultat de fer un casting de double a int es: " + b);
        //Casting de double a float
        c= (float) a;
        System.out.println("El resultat de fer un casting de double a float es: " + c);
        //Casting de double a String
        miVariable=String.valueOf(a);
        System.out.println("El resultat de fer un casting de double a String es: " + miVariable);
    }
}
