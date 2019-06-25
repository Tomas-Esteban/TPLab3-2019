/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class Baldosa  implements IAccionesB{
    
    // Staticas
    public static Baldosa[] baldosas = new Baldosa[256];
    public static Baldosa cespedOscuro = new BaldosaCespedOscuro(0);
    public static Baldosa cespedOscuroSuperior = new BaldosaCespedOscuroSuperior(1);
    public static Baldosa cespedOscuroInferior = new BaldosaCespedOscuroInferior(2);
    public static Baldosa muralla = new BaldosaMuralla(3);  
    public static Baldosa rellenoNegro = new BaldosaRellenoNegro(4);
    public static Baldosa baldosapiso = new BaldosaPiso(8);
    public static final int ANCHO_BALDOSA = 32, ALTO_BALDOSA = 32;
    
    
    protected BufferedImage textura;
    protected final int id;
    
    public Baldosa(BufferedImage textura, int id){
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


