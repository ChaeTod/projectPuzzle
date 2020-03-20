package sample;

import java.util.Random;

public class Map {
    private Tile[][] arr;
    public void setArr(Tile[][] arr) {
        this.arr = arr;
    }

    public Tile[][] getArr() {
        return arr;
    }

    public Map() {
        initGame();
    }

    private void initGame() {
        arr = new Tile[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = new Tile();
            }
        }
    }

    public boolean isWinner() {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].isValue())
                    counter++;
            }
        }
        return counter == 0 || counter == 16;
    }

    public void toggleTiled(int code) {
        int x = code % 4; // column
        int y = code / 4; // row

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (!(x == i && y == j) && Math.abs(x - i) <= 1 && Math.abs(y - j) <= 1) {
                    arr[i][j].toggle();
                }

            }
        }

    }

    public void shuffle() {
        Random rnd = new Random();
        do {
            for (int i = 0; i < 47; i++)
                toggleTiled(rnd.nextInt(15));
        } while (isWinner());
    }

    public void print() {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i][j].isValue() ? " x " : " 0 ");
            System.out.println();
        }
        System.out.println();
    }



}
