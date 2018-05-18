import java.util.Random;
/**
 * Write a description of class Ave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AveMutante extends Animal
{
    private static final int INCREMENTO_COMER = 1;
    private boolean modificadoGeneticamente;

    /**
     * Constructor for objects of class Ave
     */
    public AveMutante(boolean modificado)
    {
        super();
        modificadoGeneticamente = modificado;
    }

    public void comer() 
    {
        setPeso(getPeso() + INCREMENTO_COMER);
        if (modificadoGeneticamente) {
            Random aleatorio = new Random();
            if (aleatorio.nextBoolean()) {  //50% de posibilidades
                super.comer();
            }
        }
        else{
            super.comer();
        }
    }
}
