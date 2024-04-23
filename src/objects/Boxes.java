package objects;

/**
 *
 * @author espin
 */
public class Boxes extends Guides {

    private double volume;
    private double volumetricWeight;
    private double weight;
    private double height;
    private double wide;
    private double large;
    private double price;

    /**
     * Constructor
     *
     * @param volume
     * @param volumetricWeight
     * @param weight
     * @param height
     * @param wide
     * @param large
     * @param price
     * @param sender
     * @param receiver
     * @param direction
     * @param distance
     */
    public Boxes(double volume, double volumetricWeight, double weight, double height, double wide, double large, double price, String sender, String receiver, String direction, double distance) {
        super(sender, receiver, direction, distance);
        this.volume = volume;
        this.volumetricWeight = volumetricWeight;
        this.weight = weight;
        this.height = height;
        this.wide = wide;
        this.large = large;
        this.price = price;
    }

    /**
     *  Obtiene el volumen
     * 
     * @return
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Obtiene el precio
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Box{" + "volume=" + volume + ", volumetricWeight=" + volumetricWeight + ", weight=" + weight + ", height=" + height + ", wide=" + wide + ", large=" + large + ", price=" + price + '}';
    }

}
