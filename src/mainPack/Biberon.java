/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import java.util.Date;

/**
 *
 * @author mpgsa
 */
public class Biberon extends Boire
{
    private double quantite;

    public Biberon()
    {
    }

    public Biberon(double quantite, Date debut, Qualite qualite)
    {
        super(debut, qualite);
        this.quantite = quantite;
    }

    public double getQuantite()
    {
        return quantite;
    }

    public void setQuantite(double quantite)
    {
        this.quantite = quantite;
    }

    @Override
    public String toString()
    {
        return "Biberon{" + "quantite=" + quantite + '}';
    }
    
    
    
}
