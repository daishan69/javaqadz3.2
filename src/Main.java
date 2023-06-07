
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        double  squared = (height * height);
        int index = service.calculate(weight ,squared);
        System.out.println(index);



    }
}