
/**
 * Write a description of class Animales4patas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    private static final int PUNTOS_VIDA_INICIALES = 100;
    private static final int REDUCCION_VIDA_AL_COMER = -10;
    // Variable que guarda cuantos kilogramos tiene la vaca.
    private int peso;
    // Puntos de vida del animal.
    private int puntosVida;
    // Sonido caracteristico del animal.
    private String sonidoCaracteristico;
    
    /**
     * Constructor for objects of class Animales4patas
     */
    public Animal()
    {
        puntosVida = PUNTOS_VIDA_INICIALES;
        peso = 0;
        sonidoCaracteristico = "";
    }
    
    /**
     * Metodo que muestra por pantalla el sonido caracterisitico del animal
     * 
     * @return    El peso del animal.
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(sonidoCaracteristico);
    }
    
    /**
     * Metodo para cambiar el peso del animal.
     */
    public void setPeso(int nuevoPeso)
    {
        peso = nuevoPeso;
    }
    
    /**
     * Metodo para cambiar el sonido caracteristico de cada animal
     */
    public void setSonidoCaracteristico(String sonido)
    {
        sonidoCaracteristico = sonido;
    }
    
    /**
     * Modifica los puntos de vida del animal dependiendo del numero
     * introducido por paramentro
     * 
     * @param puntos El numero de puntos de vida que se sumanran o restaran
     * a los actuales.
     */
    public void variaPuntosDeVida(int puntos)
    {
        puntosVida += puntos;
    }
    
    /**
     * Metodo que permite que los animales se alimenten
     */
    public void comer()
    {
        puntosVida += REDUCCION_VIDA_AL_COMER;
    }
    
    /**
     * Metodo que nos muestra la informacion del peso.
     */
    public int getPeso()
    {
        return peso;
    }
    
}
