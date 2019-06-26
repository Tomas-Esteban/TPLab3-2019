package Graficos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import Interfaces.IAccionesB;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que se encarga de setear las "baldosas" (piso,tablero,etc) para su uso en la interfaz grafica
 * 
 * 
 * @param ancho y alto de las baldosas
 * @param textura
 * @param id
 * 
 */

public class ImgBaldosa  implements IAccionesB{
    
    // Staticas
    public static ImgBaldosa[] baldosas = new ImgBaldosa[256];
    public static ImgBaldosa cespedOscuro = new ImgBaldosaCespedOscuro(0);
    public static ImgBaldosa cespedOscuroSuperior = new ImgBaldosaCespedOscuroSuperior(1);
    public static ImgBaldosa cespedOscuroInferior = new ImgBaldosaCespedOscuroInferior(2);
    public static ImgBaldosa muralla = new ImgBaldosaMuralla(3);  
    public static ImgBaldosa rellenoNegro = new ImgBaldosaRellenoNegro(4);
    public static ImgBaldosa baldosapiso = new ImgBaldosaPiso(8);
    public static ImgBaldosa baldosacastillo = new ImgBaldosaCastillo(9);
    public static ImgBaldosa baldosavida = new ImgVida(10);
    public static ImgBaldosa baldosaoro = new ImgOro(11);
    
    public static final int ANCHO_BALDOSA = 32, ALTO_BALDOSA = 32;
    
    
    protected BufferedImage textura;
    protected final int id;
    
    public ImgBaldosa(BufferedImage textura, int id){
        this.textura = textura;
        this.id = id;
        
        baldosas[id] = this;
    }
    
    public boolean esSolido(){
        return false;
    }
    

    @Override
    public void actualizar(){
        
    }
    
    @Override
    public void renderizar(Graphics g, int x, int y){
        g.drawImage(textura, x, y, ANCHO_BALDOSA, ALTO_BALDOSA, null);
    }
}


