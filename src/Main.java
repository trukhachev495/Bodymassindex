public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 80.5;
        double h2 = 3.24;
        double i = service.calculate(m,h2);
        System.out.println("Индекс тела: " +i);



    }


}
