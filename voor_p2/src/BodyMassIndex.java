public class BodyMassIndex {
    private double userHeight;
    private double userWeight;
    public BodyMassIndex(double height, double weight) {
        userHeight = height;
        userWeight = weight;
    }

    public double calcBMI() {
        double BMI = (userWeight*703)/(userHeight*userHeight);
        return roundTwoPlaces(BMI);
    }

    public int calcBMICategory() {
        double BMI = calcBMI();
        roundTwoPlaces(BMI);
        if (BMI < 18.50)                 //class quote "2 decimal places for calculations, 1 for printing" 60" and 94.5 ib gives 18.45BMI and rounds to 18.5, appearing to display wrong category
             return 1;
        else if (BMI < 25.00)
             return 2;
        else if (BMI < 30)
             return 3;
        else return 4;
    }
    private double roundTwoPlaces(double value) {
        int roundPlace = 2;
        double scale = Math.pow(10, roundPlace);
        return value = Math.round(value*scale)/scale;
    }
}


