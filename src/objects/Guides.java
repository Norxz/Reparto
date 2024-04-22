package objects;

/**
 *
 * @author lokci
 */
public class Guides {
    private String sender;
    private String receiver;
    private String adress;

    public Guides(String sender, String receiver, String adress) {
        this.sender = sender;
        this.receiver = receiver;
        this.adress = adress;
    }    

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getAdress() {
        return adress;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Guides{" + "sender=" + sender + ", receiver=" + receiver + ", adress=" + adress + '}';
    }
    
    
    
}
