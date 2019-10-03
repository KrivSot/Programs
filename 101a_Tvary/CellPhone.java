/**
 * Trida mobilniho telefonu
 * @author Pavel Micka
 */
public class CellPhone {

    /**
     * International Mobile Equipment Identity
     *
     * Field je final - imai nelze zmenit
     */
    private final String imei;
    private SIMCard card;

    /**
     * Konstruktor, kazdy telefon ma imai
     * @param imei
     */
    public CellPhone(String imei) {
        this.imei = imei;
    }

    /**
     * @return the imai
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param card the card to set
     */
    public void setCard(SIMCard card) {
        this.card = card;
    }

    @Override
    public String toString() {
        String phoneNumber = null;
        if (this.card != null) {
            phoneNumber = "Obsahuji SIM kartu s telefonnim cislem: " + card.phoneNumber + "."; //primy pristup k fieldum vnitrni tridy
        } else {
            phoneNumber = "Neobsahuji zadnou SIM kartu.";
        }
        return "Jsem mobilni telefon a mam imei: " + imei + ". " + phoneNumber;
    }

    /**
     * Vnorena trida SIM karty
     */
    public static class SIMCard {

        private String phoneNumber;

        public SIMCard(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        /**
         * Setter na telefonni cislo (coz snad v realnem svete jde :-])
         * @param phoneNumber
         */
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}