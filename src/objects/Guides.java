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

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getDirection() {
        return direction;
    }

    public double getDistance() {
        return distance;
    }

}
