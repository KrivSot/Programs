/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */



/*******************************************************************************
 * Instance třídy {@code Dům} představují ...
 * The {@code Dům} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Dům
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================

Obdélník obdélník1;
Obdélník komin;
Trojúhelník strecha;
Obdélník dvere;
Obdélník okno;
Elipsa okno2;
Elipsa klika;
private static Dům instance = null;

//##############################################################################
//\CI== STATIC INITIALIZER (CLASS CONSTRUCTOR) =================================
//\CG== CLASS (STATIC) GETTERS AND SETTERS =====================================
//\CM== OTHER NON-PRIVATE CLASS (STATIC) METHODS ===============================
//\CP== PRIVATE AND AUXILIARY CLASS (STATIC) METHODS ===========================



//##############################################################################
//\IC== CONSTANT INSTANCE ATTRIBUTES (FIELDS) ==================================
//\IV== VARIABLE INSTANCE ATTRIBUTES (FIELDS) ==================================



//##############################################################################
//\II== CONSTRUCTORS AND FACTORY METHODS =======================================
    /***************************************************************************
      *  Vykreslí dům s výchozími atributy.
       */
    private Dům()
    {
        obdélník1 = new Obdélník(100, 100, 100, 100,Barva.OKROVÁ);
        komin = new Obdélník(obdélník1.getX()+5,obdélník1.getY()-55, 20, 45,Barva.ŠEDÁ); 
        strecha = new Trojúhelník(obdélník1.getX()-5, obdélník1.getY()-70,110,70,Barva.ČERVENÁ);
        dvere = new Obdélník(obdélník1.getX()+60, obdélník1.getY()+40, 30, 60,Barva.HNĚDÁ);
        okno = new Obdélník(obdélník1.getX()+15, obdélník1.getY()+40,30,30,Barva.AZUROVÁ);
        okno2 = new Elipsa(obdélník1.getX()+40, obdélník1.getY()-40,20,20,Barva.AZUROVÁ);
        klika = new Elipsa(obdélník1.getX()+80, obdélník1.getY()+65, 7, 7,Barva.ZLATÁ);
    }
    
    public static Dům Inicializuj()
    {
        if (instance == null)
        {
            instance = new Dům();
        }
        return instance;
    }
    
    /******
     * Vykreslí dům se zvolenými barvami
     */
    private Dům(Barva zed, Barva komín, Barva střecha, Barva dveře, Barva okno1, 
               Barva okno_střecha, Barva kilka)
    {
        obdélník1 = new Obdélník(100, 100, 100, 100,zed);
        komin = new Obdélník(obdélník1.getX()+5,obdélník1.getY()-55, 20, 45,komín); 
        strecha = new Trojúhelník(obdélník1.getX()-5, obdélník1.getY()-70,110,70,střecha);
        dvere = new Obdélník(obdélník1.getX()+60, obdélník1.getY()+40, 30, 60,dveře);
        okno = new Obdélník(obdélník1.getX()+15, obdélník1.getY()+40,30,30,okno1);
        okno2 = new Elipsa(obdélník1.getX()+40, obdélník1.getY()-40,20,20,okno_střecha);
        klika = new Elipsa(obdélník1.getX()+80, obdélník1.getY()+65, 7, 7,kilka);               
    }
    
    /***
     * Vykreslí dům na zadaných souřadnicích
     */
    private Dům(int x, int y)
    {
        obdélník1 = new Obdélník(x, y, 100, 100,Barva.OKROVÁ);
        komin = new Obdélník(obdélník1.getX()+5,obdélník1.getY()-55, 20, 45,Barva.ŠEDÁ); 
        strecha = new Trojúhelník(obdélník1.getX()-5, obdélník1.getY()-70,110,70,Barva.ČERVENÁ);
        dvere = new Obdélník(obdélník1.getX()+60, obdélník1.getY()+40, 30, 60,Barva.HNĚDÁ);
        okno = new Obdélník(obdélník1.getX()+15, obdélník1.getY()+40,30,30,Barva.AZUROVÁ);
        okno2 = new Elipsa(obdélník1.getX()+40, obdélník1.getY()-40,20,20,Barva.AZUROVÁ);
        klika = new Elipsa(obdélník1.getX()+80, obdélník1.getY()+65, 7, 7,Barva.ZLATÁ);             
    }
    
    /**
     * Umožní uživately nastavit barvu pro všechny objekty.
     */
    public void SetBarvaBarak(Barva zed, Barva komín, Barva střecha, Barva dveře, Barva okno1, 
                        Barva okno_střecha, Barva kilka)
    {
        obdélník1.setBarva(zed);
        komin.setBarva(komín);
        strecha.setBarva(střecha);
        dvere.setBarva(dveře);
        okno.setBarva(okno1);
        okno2.setBarva(okno_střecha);
        klika.setBarva(kilka);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu zdi.
     */
    public void SetBarvaZed(Barva zed)
    {
        obdélník1.setBarva(zed);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu komínu.
     */
    public void SetBarvaKomin(Barva komín)
    {
        komin.setBarva(komín);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu střechy.
     */
    public void SetBarvaStrecha(Barva střecha)
    {
        strecha.setBarva(střecha);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu dveří.
     */
    public void SetBarvaDveře(Barva dveře)
    {
        dvere.setBarva(dveře);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu okna, které se nachází na zdi.
     */
    public void SetBarvaOkno(Barva okno1)
    {
        okno.setBarva(okno1);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu okna, které se nachází na střeše.
     */
    public void SetBarvaOknoStřecha(Barva okno_střecha)
    {
        okno2.setBarva(okno_střecha);
        Aktualizuj();
    }

    /**
     * Umožní uživately nastavit barvu kliky.
     */
    public void SetBarvaKlika(Barva kilka)
    {
        klika.setBarva(kilka);
        Aktualizuj();
    }
    
    /**
     * Posune dům do leva.
     */
    public void PosunVlevo()
    {
        obdélník1.posunVlevo();
        komin.posunVlevo();
        strecha.posunVlevo();
        dvere.posunVlevo();
        okno.posunVlevo();
        okno2.posunVlevo();
        klika.posunVlevo();
        Aktualizuj();
    }

    /**
     * Posune dům do prava.
     */
    public void PosunVpravo()
    {
        obdélník1.posunVpravo();
        komin.posunVpravo();
        strecha.posunVpravo();
        dvere.posunVpravo();
        okno.posunVpravo();
        okno2.posunVpravo();
        klika.posunVpravo();
        obdélník1.zobraz();
        Aktualizuj();
    }
    
    /**
     * Posune dům vzhůru.
     */
    public void PosunNahoru()
    {
        obdélník1.posunVzhůru();
        komin.posunVzhůru();
        strecha.posunVzhůru();
        dvere.posunVzhůru();
        okno.posunVzhůru();
        okno2.posunVzhůru();
        klika.posunVzhůru();
        Aktualizuj();
    }
    
    /**
     * Posune dům dolu.
     */
    public void PosunDolu()
    {
        obdélník1.posunDolů();
        komin.posunDolů();
        strecha.posunDolů();
        dvere.posunDolů();
        okno.posunDolů();
        okno2.posunDolů();
        klika.posunDolů();
        Aktualizuj();
    }
    
    public void PosunDoprava(int x)
    {
        obdélník1.posunVpravo(x);
        komin.posunVpravo(x);
        strecha.posunVpravo(x);
        dvere.posunVpravo(x);
        okno.posunVpravo(x);
        okno2.posunVpravo(x);
        klika.posunVpravo(x);
        Aktualizuj();
    }
    
    public void PosunDoleva(int x)
    {
        obdélník1.posunVlevo(x);
        komin.posunVlevo(x);
        strecha.posunVlevo(x);
        dvere.posunVlevo(x);
        okno.posunVlevo(x);
        okno2.posunVlevo(x);
        klika.posunVlevo(x);
        Aktualizuj();
    }
    
    public void PosunOknoLevo()
    {
        okno.posunVlevo();
        Aktualizuj();
    }
    
    /**************
     * Aktualizuje plátno a vykreslí znova všechny objekty třídy Dům
       */
    public void Aktualizuj()
    {
        obdélník1.zobraz();
        komin.zobraz();
        strecha.zobraz();
        dvere.zobraz();
        okno.zobraz();
        okno2.zobraz();
        klika.zobraz();
    }
    
    public void PosunOknoLevo(int x)
    {
        okno.posunVlevo(x);
        Aktualizuj();
    }
    
    public void PosunOknoVpravo()
    {
        okno.posunVpravo();
        Aktualizuj();
    }
    
    public void PosunOknoVpravo(int x)
    {
        okno.posunVpravo(x);
        Aktualizuj();
    }
//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
