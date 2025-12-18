package timus.task_2023;

import java.util.Scanner;

public class CurrentStep {
    private int n;
    String[][] box1 = {{"Alice","Ariel","Aurora"}, {"Phil","Peter","Olaf"}, {"Phoebus","Ralph","Robin"}};
    String[][] box2 = {{"Bambi","Belle","Bolt"}, {"Mulan","Mowgli","Mickey"}, {"Silver","Simba","Stitch"}};
    String[][] box3 = {{"Dumbo","Genie","Jiminy"}, {"Kuzko","Kida","Kenai"}, {"Tarzan","Tiana","Winnie"}};


    public void setN(int n) {
        this.n = n;
    }

    public void showStep() {
        Scanner in = new Scanner(System.in);
        int step = 0;
        int tempBox = 1;
        for (int i = 0; i < n; i++){
            String author = in.nextLine();
            for (int j = 0; j < 3; j++){
                for (int z = 0; z < 3; z++){
                    if (author.equals(box1[j][z])){
                        if (tempBox == 2){
                            step++;
                        } else if( tempBox == 3){
                            step += 2;
                        }
                        tempBox = 1;
                    } else if (author.equals(box2[j][z])) {
                        if (tempBox != 2) {
                            step++;
                            tempBox = 2;
                        }
                    } else if (author.equals(box3[j][z])) {
                        if (tempBox == 2){
                            step++;
                        } else if (tempBox == 1) {
                            step += 2;
                        }
                        tempBox = 3;
                    }
                }
            }
        }
        System.out.println(step);
    }

}
