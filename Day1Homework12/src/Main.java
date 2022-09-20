public class Main {
    public static void main(String[] args) {
        String[][] siniflarVeSubeler = new String[3][3];

        siniflarVeSubeler[0][0]="A";
        siniflarVeSubeler[0][1]="B";
        siniflarVeSubeler[0][2]="C";


        siniflarVeSubeler[1][0]="1";
        siniflarVeSubeler[1][1]="2";
        siniflarVeSubeler[1][2]="3";


        siniflarVeSubeler[2][0]="15";
        siniflarVeSubeler[2][1]="20";
        siniflarVeSubeler[2][2]="17";


        for(int i=0;i<3;i++){
            System.out.println(siniflarVeSubeler[i]);
            for (int j=0;j<3;j++){
                System.out.println(siniflarVeSubeler[i][j]);
            }
        }
    }
}