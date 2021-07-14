package david.itacademy.M01Fase03;

public class FaseTercera {

    public static void main(String[] args) {
    /*
	- Fase 3
	Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
	En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui,
	en cas de ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.
	 */
        //Variable booleana inicialitzada en false
        boolean traspas = false;
        //Variable any de naixement
        int naixement=1986;
        //Variables String
        String anyTrue="L'any " + naixement + " és de tràspas.";
        String anyFalse="L'any " + naixement + " no és de tràspas.";

        if(naixement%4==0) {
            traspas=true;
            System.out.println(anyTrue);
        }else System.out.println(anyFalse);

    }
}
