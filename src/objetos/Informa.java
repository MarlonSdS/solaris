/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Marlo
 */
public class Informa {
    public Double tarifaKwh;
    public Double valM;
    public Double wattsM;
    public Double valA;
    public Double areaR;
    public Double custo;
    
    public int qtPaineis;
    public int qtMeses;
    
    
    //Decidimos usar como modelo base um painel 1,65m² e geração diária de 945W/h
    public Double tamanhoPainel = 1.65;
    public Double energiaPainel = 945.0;
    public Double precoPainel = 700.0;
}
