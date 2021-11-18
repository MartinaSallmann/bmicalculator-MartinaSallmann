/*

Name: Martina Sallmann
Email: s51124@edu.campus02.at
Matrikel-Number: 52100303


 */


public class BMICalculator {

    private String firstname;
    private String lastname;
    private char gender;
    private int bodyHeight;
    private double bodyWeight;

    public BMICalculator(String firstname, String lastname, char gender, int bodyHeight, double bodyWeight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;


    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getGender() {
        return gender;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    private double round(double value) {

        double height_new = getBodyHeight();
        height_new = height_new/100;

        return Math.round(value * 100) / 100D;
    }

    public double calculateBMI() {

        return round(bodyWeight / ((bodyHeight / 100) * (bodyHeight / 100)));

    }

    public int calculateBMICategory() {

        double bmi = calculateBMI();


        if (gender == 'm') {
            if (bmi < 16) {
                return -2;
            } else if (bmi < 18.4) {
                return -1;
            } else if (bmi < 24.9) {
                return 0;
            } else if (bmi < 34.9) {
                return 1;
            } else {
                return 2;
            }
        }

        if (gender == 'w') {
            if (bmi < 15) {
                return -2;
            } else if (bmi < 17.4) {
                return -1;
            } else if (bmi < 23.9) {
                return 0;
            } else if (bmi < 33.9) {
                return 1;
            } else {
                return 2;
            }

        }
        return 0;
    }


    public String getBMICategoryName() {

       if (calculateBMICategory() == -2){
           return "Sehr starkes Untergewicht";
       }else if (calculateBMICategory() == -1){
           return "Untergewicht";
       } else if (calculateBMICategory() == 0){
           return "Normalgewicht";
       }else if (calculateBMICategory() == 1){
           return "Übergewicht";
       }else{
           return "Sehr starkes Übergewicht";
       }
        
        
    }

    }

