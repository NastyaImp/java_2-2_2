public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double result = service.calculate(60, 1.75);

        System.out.println(result);
    }
}


