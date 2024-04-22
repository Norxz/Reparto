package objects;

/**
 *
 * @author espin
 */
public class Box extends Guides{
    private double volume;
    private double volumetricWeight;
    private double weight;
    private double height;
    private double wide;
    private double large;
    private double price;

    public Box(double volume, double volumetricWeight, double weight, double height, double wide, double large, double price, String sender, String receiver, String adress) {
        super(sender, receiver, adress);
        this.volume = volume;
        this.volumetricWeight = volumetricWeight;
        this.weight = weight;
        this.height = height;
        this.wide = wide;
        this.large = large;
        this.price = price;
    }    
            
    public int priceCalculator(){
        if (weight > volumetricWeight) {
            return (int) (weight * 2);
        } else{
            return (int)(volumetricWeight * 2);
        }
    }
    
    public double volumenCalculator(){
        return weight*height*wide;
    }
    
    public double volumetricWeightCalculator(){
        return volume/5000;
    }

    public double getVolume() {
        return volume;
    }

    public double getVolumetricWeight() {
        return volumetricWeight;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWide() {
        return wide;
    }

    public double getLarge() {
        return large;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Box{" + "volume=" + volume + ", volumetricWeight=" + volumetricWeight + ", weight=" + weight + ", height=" + height + ", wide=" + wide + ", large=" + large + ", price=" + price + '}';
    }
    
    
}
