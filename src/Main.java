public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 80.5;
        double mansHeight = 1.8 * 2;
        double bodyMassIndex = service.calculate(bodyMass, mansHeight);
        System.out.println("Индекс тела: " + bodyMassIndex);


    }


}
