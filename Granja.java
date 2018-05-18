
/**
 * Control de animales.
 * 
 * @author (Lorena Alonso Pedreira) 
 * @version (16/05/2018)
 */
public class Granja
{
    public void alimentar(Animal animal)
    {
        animal.comer();
    }
    
    public void haceEmitirSonidoCaracteristico(Animal animal)
    {
        animal.emitirSonidoCaracteristico();
    }
    
    public void vacunar(AnimalVacunado animal)
    {
        animal.vacunar();
    }
    
}
