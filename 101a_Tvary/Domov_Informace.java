/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Domov_Informace} představují ...
 * The {@code Domov_Informace} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Domov_Informace
{
    private static Dům DŮM = Dům.Inicializuj();
    private final String jméno;
    private Půda půda;
    String [] text = new String[5];
    Boolean puda = false;
    int pocet = 0;
    
    public Domov_Informace(String jméno)
    {
        this.jméno = jméno;
    }
    
    public String getJméno()
    {
        return jméno;
    }
    
    public String pridej_vec(String vecf)
    {
        if(pocet!=5)
        {
            text [pocet] = vecf;
            puda = true;
            return text[pocet];
        }   
        else
        {
            return null;
        }
        
    }
    
    public String toString()
    {
        String veci;
        if(puda)
        {
            veci = "Na půdě jsou"+text[0]+" , "+text[1]+" , "+text[2]+" , "+text[3]+" , "+text[4];
        }
        else
        {
          veci = "Na půdě nejsou žádne věci";
        }
        return "Ahoj jsem chytrý barák s názvem "+jméno+". Mám půdu, suterén a sklep."+veci;
    }

    public static class Půda
    {
        private String [] Veci = new String [5];
        private String Text;
        private int Pocet_veci;
        private Boolean veci = false;
        
        public Půda()
        {
            
        }
        
        public String PridatVec(String vec)
        {
            if(Pocet_veci !=5)
            {
                Veci[Pocet_veci] = vec;
                veci = true;
                return Veci[Pocet_veci];
            }
            else
            {
                System.out.println("Víc už se na půdu nevejde");
                return null;
            }
        }
    }

}
