
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        double x = (height * height);
        int index = service.calculate(weight ,x);
        System.out.println(index);



    }
}