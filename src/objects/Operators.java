package objects;

/**
 *
 * @author lokci
 */
public class Operators {

    /**
     * Calcula el precio
     *
     * @param weight
     * @param volumetricWeight
     * @return
     */
    public static int priceCalculator(double weight, double volumetricWeight) {
        if (weight > volumetricWeight) {
            return (int) (weight * 2);
        } else {
            return (int) (volumetricWeight * 2);
        }
    }

    /**
     * Calcula el volumen
     *
     * @param weight
     * @param height
     * @param wide
     * @return
     */
    public static double volumenCalculator(double weight, double height, double wide) {
        return weight * height * wide;
    }

    public static double distanceCalculator() {
        return (Math.random() * 990) + 10;
    }

    /**
     * Calcula el peso volumetrico
     *
     * @param volume
     * @return
     */
    public static double volumetricWeightCalculator(double volume) {
        return volume / 5000;
    }

}
