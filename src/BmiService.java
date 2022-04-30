public class BmiService {

    public double calculate(double bodyMass, double mansHeight) {

        double bodyMassIndex = bodyMass / mansHeight;
        return bodyMassIndex;

    }


}
