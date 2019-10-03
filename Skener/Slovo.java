/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Scanner;


/*******************************************************************************
 * Instance třídy {@code Slovo} představují ...
 * The {@code Slovo} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Slovo
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================

char koncovka;
char koncovka2;
String slovo;
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
     */
    public Slovo(String slovo)
    {
        this.slovo = DejMnCislo(slovo);
    }

    public boolean IsSamohlaska(String slovo)
    {
        switch(slovo.charAt(slovo.length() - 1))
        {
            case 'a': koncovka = 'a'; return true;
            case 'e': koncovka = 'e';  return true;
            case 'i': koncovka = 'i';   return true; 
            case 'o': koncovka = 'o';   return true;
            case 'u': koncovka = 'u';   return true;
            case 'y': koncovka = 'y';   return true;
            default: koncovka = slovo.charAt(slovo.length() - 1); return false;
        }
    }
    
    public String dejPlural()
    {
        return slovo;
    }
    
    public String DejMnCislo(String slovo)
    {
        koncovka = slovo.charAt(slovo.length()-1);
        koncovka2 = slovo.charAt(slovo.length()-2);
        if(IsSamohlaska(slovo) ==false )
        {
            return PluralSouhlaska(slovo);
        }
        else
        {
            return PluralSamohlaska(slovo);
        }
    }                                         
    
    public String PluralSouhlaska(String slovo)
    {
        if(koncovka == 's' || koncovka == 'x' || koncovka == 'z' || (koncovka == 'h' && koncovka2 =='c') || (koncovka == 'h' && koncovka2 =='s'))
            {
                return slovo+"es";
            }
            else
            {
                return slovo+"s";
            }
    }
    
    public String PluralSamohlaska(String slovo)
    {
        switch(koncovka)
            {
                case 'y': if(IsSamohlaska(String.valueOf(koncovka2)) == false)
                          {
                            StringBuilder slovo2 = new StringBuilder(slovo);
                            slovo2.setCharAt(slovo.length()-1,'i');
                            return slovo2+"es";
                            
                          }
                          else
                          {
                              return slovo+"s";
                          }
                case 'o':
                          if(IsSamohlaska(String.valueOf(koncovka2)) == false)
                          {
                            StringBuilder slovo2 = new StringBuilder(slovo);
                            slovo2.setCharAt(slovo.length()-1,'o');
                            return slovo2+"es";
                          }
                          else
                          {
                              return slovo+"s";
                          }
                case 'e': if (koncovka =='e' && koncovka2=='f')
                            {
                               StringBuilder slovo2 = new StringBuilder(slovo);
                               slovo2.setCharAt(slovo.length()-2, 'v');
                               return slovo2+"s";
                            }
            }
            return slovo+"s";
    }
//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
