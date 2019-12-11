package homeWork8;

public class Main {

    public static void main(String[] args) {

    snakeGo();
    }

    private static void snakeGo() {
        int row = 9; //вертикаль
        int cell = 5;//горизонталь

        int directionY = row-1;
        int directionX = cell;

        int[][] arr = new int[row][cell];

        int x = 0;//горизонталь
        int y = 0;//вертикаль
        int i = 0;//счетчик

        for (int k = 0; k <= row*cell ; k++) {


            //слева-направо
            for (int j = 0; j < directionX; j++) {
                arr[y][x++]=++i;
            }

            if (directionX < 1 || directionY < 1){
                break;
            }
            directionX--;
            y++;
            x--;



            //сверху-вниз
            for (int j = 0; j < directionY; j++) {
            arr[y++][x]= ++i;
            }

            if (directionX < 1 || directionY < 1){
                break;
            }
            directionY--;
            y--;
            x--;


            //справа-налево
            for (int j = 0; j <directionX ; j++) {
                arr[y][x--]= ++i;
            }

            if (directionX < 1 || directionY < 1){
                break;
            }
            directionX--;
            y--;
            x++;

           //снизу-вверх
            for (int j = 0; j <directionY ; j++) {
              arr[y--][x]= ++i;
            }

            if (directionX < 1 || directionY < 1){
                break;
            }
            directionY--;
            y++;
            x++;



        }

        //вывести результат в консоль
        for (int k = 0; k < row; k++) {
            for (int j = 0; j <cell ; j++) {
                System.out.print(arr[k][j]+"\t");

            }
            System.out.println();

        }


    }


}
