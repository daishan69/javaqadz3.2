public class BmiService {
    public int calculate(int weight , double squared ) {
        double index = weight / squared;
        return (int) index ;

    }
}
