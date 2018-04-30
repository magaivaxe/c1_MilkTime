package mainPack;

import java.util.Date;

/**
 * With extends the Tetee is Boire.
 * Tette have access to all methods from Boire 
 * @author mpgsa
 */
public class Tetee extends Boire
{
	public enum Sein {GAUCHE, DROIT};
        
	private Date fin;
	private Sein sein;

    public Tetee(Date fin, Sein sein, Date debut, Qualite qualite)
    {
        super(debut, qualite);
        this.fin = fin;
        this.sein = sein;
    }


    public Date getFin() {
            return fin;
    }

    public void setFin(Date fin) {
            this.fin = fin;
    }

    public Sein getSein() {
            return sein;
    }

    public void setSein(Sein sein) {
            this.sein = sein;
    }

    public long getDuree()
    {
            return (fin.getTime() - super.getDebut().getTime())/(1000*60);
    }

    @Override
    public String toString() {
            // Donnez le debut, la fin, la duree (en minutes)
            // Le debut et la fin soit jour mois annee heure minute

            System.out.println(getDebut());

            return "Tetee [" + 
                            "debut=" + getDebut() + ", " + 
                            "fin=" + fin + ", " + 
                            "duree=" + getDuree() + ", " +  
                            "sein=" + sein + ", " + 
                            "qualite=" + getQualite() + 
                            "]";
    }
}
