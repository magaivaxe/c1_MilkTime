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
public class Boire
{
    public enum Qualite {BON, MOYEN, MAUVAIS};
    private Date debut;
    private Qualite qualite;

    //Default constructor
    public Boire()
    {
    }
    //Parametric constructor
    public Boire(Date debut, Qualite qualite)
    {
        this.debut = debut;
        this.qualite = qualite;
    }

    public Date getDebut()
    {
        return debut;
    }

    public void setDebut(Date debut)
    {
        this.debut = debut;
    }

    public Qualite getQualite()
    {
        return qualite;
    }

    public void setQualite(Qualite qualite)
    {
        this.qualite = qualite;
    }
    
    
    
}
