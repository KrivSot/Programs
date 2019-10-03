/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Scanner;
import java.lang.String;

/*******************************************************************************
 * Třída {@code Test} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Test
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("zadej text:");
        String nacteno = sc.next();//vytvorit program, který převede anglické slovo v singuláru do pluláru za použítí pravidel. vytvořit třídu slovo, která bude vracet plurál přivoláním konstruktoru předám slovo s tím atributem budeme pracovat bude tam metoda get plural, Metody je samohlaska, je souhlaska funkce poslední a předposlední.
        System.out.println("napsal jsi: "+ nacteno);
        System.out.print("Zadej číslo 1: ");
        int c1 = sc.nextInt();
        if(nacteno.charAt(nacteno.length() - 1) == 'e')
        {
            System.out.println("E");
        }
        System.out.println("Načetl jsi: "+c1);
        System.out.print("Zadej číslo 2: ");
        int c2 = sc.nextInt();
        int soucet = c1+c2;
        System.out.println("Součet je: "+ soucet);
        
    }
}
