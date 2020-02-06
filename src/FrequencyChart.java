import java.util.Scanner;

public class FrequencyChart {

    //Variable
    private int[] list;
    private String chart = "";

    //Constructor
    public FrequencyChart(int[] inp){
        list = inp;
    }

    //Method
    public String makeChart(){
        int oneCt = 0; //0-10
        int twoCt = 0; //11-20
        int threeCt = 0; //21-30
        int fourCt = 0; //31-40
        int fiveCt = 0; //41-50
        int sixCt = 0; //51-60
        int sevenCt = 0; //61-70
        int eightCt = 0; //71-80
        int nineCt = 0; //81-90
        int tenCt = 0; //91-100

        //Reading through list
        for (int num : list){
            if (num >= 0 && num <= 10){
                oneCt++;
            } else if (num >= 11 && num <= 20){
                twoCt++;
            } else if (num >= 21 && num <= 30){
                threeCt++;
            } else if (num >= 31 && num <= 40){
                fourCt++;
            } else if (num >= 41 && num <= 50){
                fiveCt++;
            } else if (num >= 51 && num <= 60){
                sixCt++;
            } else if (num >= 61 && num <= 70){
                sevenCt++;
            } else if (num >= 71 && num <= 80){
                eightCt++;
            } else if (num >= 81 && num <= 90){
                nineCt++;
            } else if (num >= 91 && num <= 100){
                tenCt++;
            }
        }

        //Create String
        chart += " 0 - 10 | ";
        for (int i = 0; i < oneCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "11 - 20 | ";
        for (int i = 0; i < twoCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "21 - 30 | ";
        for (int i = 0; i < threeCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "31 - 40 | ";
        for (int i = 0; i < fourCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "41 - 50 | ";
        for (int i = 0; i < fiveCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "51 - 60 | ";
        for (int i = 0; i < sixCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "61 - 70 | ";
        for (int i = 0; i < sevenCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "71 - 80 | ";
        for (int i = 0; i < eightCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "81 - 90 | ";
        for (int i = 0; i < nineCt; i++){
            chart += "*";
        }
        chart += "\n";

        chart += "91 - 100| ";
        for (int i = 0; i < tenCt; i++){
            chart += "*";
        }

        return chart;
    }








    //------------------------------------------------------------------------------------------------------------------
    //Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data values one at a time, followed by enter: ");
        int val = 0;
        for (int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());

    }
    //------------------------------------------------------------------------------------------------------------------
}
