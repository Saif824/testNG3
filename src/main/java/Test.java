public class Test {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[2][3];

        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 7;
        twoDimArray[0][2] = 9;
        twoDimArray[1][0] = 4;
        twoDimArray[1][1] = 4;
        twoDimArray[1][2] = 15;
       // System.out.println(twoDimArray[1].length);

        for (int i=0; i<twoDimArray.length; i++) {
            for (int j=0; j<twoDimArray[i].length; j++){
                System.out.print(twoDimArray[i][j]+" ");
            }

            System.out.println();
        }

    }
}
