/**
 * @param args the command line arguments
 */
public class Test
{
public static void main(String[] args) {
    /**
     * Vytvorime telefon, jak jsme zvykli
     */
    CellPhone phone = new CellPhone("050277-22-222751-3");

    /**
     * Vytvorime sim kartu, je zvykem pouzit teckovaci notaci z obalujici tridy
     * Jinak zde zadny rozdil neni. Vnorenou tridou pouze rikame, ze se jedna
     * o SIMCard k mobilnimu telefonu (ne k cemukoliv jinemu, kdyby ji to nahodou
     * take melo).
     */
    CellPhone.SIMCard card = new CellPhone.SIMCard("77623456");
    phone.setCard(card);

    /**
     * Nechame vypsat objekt telefonu, pripominam, ze se zavola metoda toString
     */
    System.out.println(phone);
}
}