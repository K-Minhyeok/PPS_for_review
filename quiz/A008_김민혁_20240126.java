package quiz;
import java.util.Scanner;

public class A008_김민혁_20240126 {

        public static void main(String[] args) {


            int i, j, count, numOfPeople;
        double sum = 0;
        double average;
        double[] score;
        double[] avg;
        double[] result;
        int pass;

            Scanner s = new Scanner(System.in);
            count = s.nextInt();

            avg = new double[count];

            for (i = 0; i < count; i++) {
                sum = 0;
                numOfPeople = s.nextInt();
                score = new double[numOfPeople];

                for (j = 0; j < numOfPeople; j++) {
                    score[j] = s.nextDouble();
                    sum += score[j];
                }
                average = sum / numOfPeople;
                avg[i] = average;
                pass = 0;

                for (int k = 0; k < numOfPeople; k++) {
                    if (avg[i] < score[k]) {
                        pass++;
                    }
                }


                System.out.printf("%.3f%%\n", (pass / (double)numOfPeople) * 100);
            }

        }
    }

