/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author mpgsa
 */
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Calendar c = new GregorianCalendar();
        c.set(2018, Calendar.APRIL, 6, 10, 55, 0);
        Date debut = c.getTime();
        
        c.set(2018, Calendar.APRIL, 6, 11, 2, 0);
        Date fin = c.getTime();
        
        Tetee tetee = new Tetee(
                debut, Boire.Qualite.MAUVAIS, fin, Tetee.Sein.DROIT);
        
        double quantML = 55;
        Biberon biberon = new Biberon(quantML, debut, Boire.Qualite.BON);
        
        Boire boire = new Boire(debut, Boire.Qualite.MOYEN);
        
        System.out.println(tetee);
        System.out.println(biberon);
        System.out.println(boire);
        
        tetee.setSein(Tetee.Sein.GAUCHE);
        tetee.setQualite(Boire.Qualite.BON);
        biberon.setQuantite(80);
        biberon.setDebut(new Date(10000));
        
        System.out.println(tetee);
        System.out.println(biberon);
        System.out.println(boire);
        
    }
    
}
