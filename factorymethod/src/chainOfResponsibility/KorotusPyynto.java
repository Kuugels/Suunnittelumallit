/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

/**
 *
 * @author Samuli Käkönen
 */
public class KorotusPyynto {
    
    private int korotusPyynto;
    
    public KorotusPyynto(int pyynto){
        this.korotusPyynto = pyynto;
    }
    
    public void setKorotusPyynto(int pyynto) {
        this.korotusPyynto = pyynto;
    }
    
    public int getPyynto() {
        return this.korotusPyynto;
    }
}
