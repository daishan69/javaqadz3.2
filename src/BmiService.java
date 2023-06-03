public class BmiService {
    public int calculate(int weight , double x) {
        double index = weight / x;
        return (int) index ;

    }
}
