
/**
 * Datos del cerdo.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (16/05/2018)
 */
public class Cerdo extends MamiferoMutante implements AnimalVacunado
{
    private static final int PESO_INICIAL_CERDO = 15;
    private static final int INCREMENTO_VACUNA = 20;
    private static final String SONIDO_CARACTERISTICO = "Oink, oink";
    
    public Cerdo(int calidadRaza)
    {
        super(calidadRaza);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
    
    /**
     * Metodo que aumenta los puntos de vida del animal en 20.
     */
    public void vacunar()
    {
       variaPuntosDeVida(INCREMENTO_VACUNA);
    }
    
}