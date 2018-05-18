
/**
 * Clase donde se mostraran las caracteristicas de los mamiferos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MamiferoMutante extends Animal
{
    private static final int INCREMENTO_COMER = 2;
    private int calidadRaza;
    
    public MamiferoMutante(int calidadRaza)
    {
        super();
        this.calidadRaza = calidadRaza;
    }
    
    public void comer()
    {
        setPeso(getPeso()+INCREMENTO_COMER);
        super.comer();
        if (calidadRaza >= 5) {
            variaPuntosDeVida(calidadRaza);
        }
    }
  
}
