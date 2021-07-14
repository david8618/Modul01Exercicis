package david.itacademy.M01Fase01;

public class FasePrimera {

    public static void main(String[] args) {
	/*
	- Fase 1
	Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
	Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
	Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
	Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
	 */
        //Crear tres variables String
        String nom="David";
        String cognom1="Díaz";
        String cognom2="Zamarreño";

        //Crear tres variables int
        int dia=18;
        int mes=6;
        int any=1986;

        //Mostrar dades string concatenades
        System.out.println(cognom1 + " " + cognom2 + ", " + nom);

        //Mostrar dades int concatenades
        System.out.println(dia + "/" + mes + "/" + any);
    }
}
