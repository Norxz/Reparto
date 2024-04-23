package objects;

/**
 *
 * @author lokci
 */
public class Guides {

    private String sender;
    private String receiver;
    private String direction;
    private double distance;

    /**
     * Constructor
     *
     * @param sender
     * @param receiver
     * @param direction
     * @param distance
     */
    public Guides(String sender, String receiver, String direction, double distance) {
        this.sender = sender;
        this.receiver = receiver;
        this.direction = direction;
        this.distance = distance;
    }

    /**
     *  Obtiene el remitente
     * 
     * @return
     */
    public String getSender() {
        return sender;
    }

    /**
     *  Obtiene el receptor
     * 
     * @return
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     *  Obtiene la dirección
     * 
     * @return
     */
    public String getDirection() {
        return direction;
    }

    /**
     *  Obtiene la distancia
     * 
     * @return
     */
    public double getDistance() {
        return distance;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Guides{" + "sender=" + sender + ", receiver=" + receiver + ", direction=" + direction + ", distance=" + distance + '}';
    }

}
