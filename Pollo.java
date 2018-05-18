
/**
 * Datos del pollo.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (16/05/2018)
 */
public class Pollo extends Ave implements AnimalVacunado
{
    private static final int INCREMENTO_VACUNA = 10;
    private static final int PESO_INICIAL = 1;
    private static final String SONIDO_CARACTERISTICO = "PIO PIO";
    
    public Pollo(boolean modificado)
    {
        super(modificado);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
    
    /**
     * Metodo que aumenta los puntos de vida del animal en 10.
     */
    public void vacunar()
    {
       variaPuntosDeVida(INCREMENTO_VACUNA);
    }
    
    
    
}
