
/**
 * Datos de la vaca.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (16/05/2018)
 */
public class Vaca extends MamiferoMutante implements AnimalVacunado
{
    private static final int PESO_INICIAL = 25;
    private static final String SONIDO_CARACTERISTICO = "Muu";
    private static final int INCREMENTO_VACUNA = 30;
 
    public Vaca(int calidadRaza)
    {
        super(calidadRaza);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
    
    /**
     * Metodo que aumenta los puntos de vida del animal en 30.
     */
    public void vacunar()
    {
       variaPuntosDeVida(INCREMENTO_VACUNA);
    }
    
}
