/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Principal.Heroe;
import Escenario.Escenario;
import Graficos.Recurso;
import Pantallas.Juego;
import java.awt.Graphics;

/**
 *
 * @author Pardo
 */
public class EstadoJuego extends Estado {

    
    private Heroe heroe;
    private Escenario escenario;
    
    
    public EstadoJuego(Juego juego){
        super(juego);
        escenario = new Escenario("src/recursos/escenarios/escenario1.txt");
        heroe = new Heroe(100, 100);
        
    }
    
    @Override
    public void actualizar() {
        escenario.actualizar();
        heroe.actualizar();
    }

    @Override
    public void renderizar(Graphics g) {
        
        escenario.renderizar(g);
        //heroe.renderizar(g);
        //g.drawImage(Recurso.cespedOscuro, 0, 0, null);
    }
    
}
