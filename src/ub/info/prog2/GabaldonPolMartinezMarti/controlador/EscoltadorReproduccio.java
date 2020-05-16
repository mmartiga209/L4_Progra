/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.GabaldonPolMartinezMarti.controlador;

import ub.info.prog2.GabaldonPolMartinezMarti.model.FitxerMultimedia;
import ub.info.prog2.GabaldonPolMartinezMarti.model.LlistaFitxers;
import ub.info.prog2.utils.EscoltadorReproduccioBasic;
import ub.info.prog2.utils.ReproException;


/**
 *
 * @author GabaldonPolMartinezMarti
 */
public class EscoltadorReproduccio extends EscoltadorReproduccioBasic {
    private LlistaFitxers llistaReproduint;
    private boolean reproduccioCiclica;
    private boolean reproduccioReverse;
    private int reproduint;
    
    /**
     * Constructor de la classe, posa els atributs ciclica i reverse per defecte a false
     */
    public EscoltadorReproduccio(){
        reproduccioCiclica = false;
        reproduccioReverse = false;
    }
    
    /**
     * Comença la reproducció d'una llista de fitxers o un sol fitxer
     * @param llistaReproduint Llista que es vol reproduir, si és un sol fitxer serà una llista d'un sol fitxer
     * @param reproduccioCiclica Indica si la reproducció cíclica està posada
     * @param reproduccioReverse Indica si la reproducció reversa està posada
     * @throws ReproException Tira excepció en cas d'error en la reproducció
     */
    public void iniciarReproduccio(LlistaFitxers llistaReproduint, boolean reproduccioCiclica, boolean reproduccioReverse) throws ReproException{
        this.llistaReproduint = llistaReproduint;
        this.reproduccioCiclica = reproduccioCiclica;
        this.reproduccioReverse = reproduccioReverse;

        if(!reproduccioReverse){
            reproduint = 0;
            ((FitxerMultimedia)llistaReproduint.getAt(reproduint)).reproduir();           

        }

        else{
            reproduint = llistaReproduint.getSize() - 1;
            ((FitxerMultimedia) llistaReproduint.getAt(reproduint)).reproduir();
          
        }
            
    }
    
    /**
     * Crida al mètode d'acabar cançó
     */
    public void skip(){
        onEndFile();
    }
    
    /**
     * Es crida quan s'acaba de reproduir un fitxer o quan es vol saltar. 
     */
    @Override
    protected void onEndFile() {
        next();
    }

    /**
     * Passa a reproduir el següent fitxer de la llista, té en compte els mètodes de reproducció
     */
    @Override
    protected void next() { 
        if(hasNext()){
            if(!reproduccioReverse){
                reproduint = (reproduint + 1) % llistaReproduint.getSize();
                try{
                    ((FitxerMultimedia) llistaReproduint.getAt(reproduint)).reproduir();
                }
                catch(ReproException e){
                    
                }
            }
            else{
                reproduint = (reproduint - 1);
                if(reproduint<0)
                    reproduint = llistaReproduint.getSize() + reproduint;
                
                try{
                    ((FitxerMultimedia) llistaReproduint.getAt(reproduint)).reproduir();
                }
                catch(ReproException e){
                    System.out.println(e);
                }
                
            }
        }
        else{
            
        }
        
    }
    
    /**
     * Mira si la cançó té següent a la llista de reproducció
     * @return Booleà si té següent cançó
     */
    @Override
    protected boolean hasNext() {
        if(reproduccioCiclica){
            return true; 
        }
        else{
            if(reproduccioReverse){
                if(reproduint-1>=0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(reproduint+1 < llistaReproduint.getSize()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
    
    /**
     * 
     * @return La llista que s'està reproduint
     */
    public LlistaFitxers getLlistaReproduint() {
        return llistaReproduint;
    }
    
    /**
     * 
     * @return El nombre del fitxer que s'està reproduint
     */
    public int getReproduint() {
        return reproduint;
    }
    
    /**
     * Resta 1 a l'int que guarda el fitxer que s'està reproduint 
     */
    public void decrementReproduint() {
        reproduint--;
    }

}
