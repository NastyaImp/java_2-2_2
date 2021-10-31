public class BmiService {
    public double calculate(int weight, double height) {

        double heightInMeters = (double) height * height;
        double bodyMassIndex = weight / heightInMeters;

        return bodyMassIndex;
    }
}
