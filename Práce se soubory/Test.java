/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

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
    public static void main(String[] args)throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String filePath = "testovani.txt";
        String fileEncoding = "UTF-8";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Chcete číst(r) nebo přepsat(w)");
        String vyber = sc.next();
        
        if(vyber.equals("r")){
        int wordCount = 0;
        int lineCount = 0;
        int characterCount = 0;
        //vytvorime novou bufferovanou ctecku s danym kodovanim z FileInputStreamu
        BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        String line = null;
        while((line = bReader.readLine()) != null)
        {   //Dokud mane k dispozici dalsi radek
            characterCount += line.length();
            lineCount++;
            
            StringTokenizer tokenizer = new StringTokenizer(line, " \\u0009");
            wordCount += tokenizer.countTokens();
        }
        
        bReader.close();
        
        System.out.println("Pocet znaku: "+characterCount);
        System.out.println("Pocet slov: "+wordCount);
        System.out.println("Pocet radku: "+lineCount);
        }
        else if(vyber.equals("w"))
        {
            Scanner sn = new Scanner(System.in);
            BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),fileEncoding));
            System.out.print("Zadejte text: ");
            String text = sn.nextLine();
            System.out.println(text);
            bWriter.write(text);
            bWriter.close();
            System.out.println("text se přepsal");
        }
        else {System.out.println("Špatný znak");}
    }
}
