package ru.alexn.gb;
// Alexey Nikolaev

import java.util.Random;
import java.util.Scanner;


public class HomeTasklesson4update {
    public static  char[][] map;
    public static final int SIZE=5;
    public static final int DOTS_TO_WIN=5;

    public static final char DOT_EMPTY='.';
    public  static final char DOT_X='X';
    public static final char DOT_0='0';

    public static Scanner sc=new Scanner(System.in);
    public static Random rand= new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin0(DOT_X)||checkDiagO(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin0(DOT_0)||checkDiagO(DOT_0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin0(char symb) {
        boolean cols,rows;
        for(int col=0; col< map.length;col++) {
            cols=true;
            rows=true;

            for(int row=0;row<map.length;row++) {
                cols &=(map[col] [row]==symb);
                rows &=(map[row] [col]==symb);
            }
            if(cols|| rows) return  true;
        }
        return false;
    }

    public static boolean checkDiagO (char symb) {
        boolean inright,inleft;
        inright=true;
        inleft=true;

        for (int i=0;i< map.length;i++) {
            inright &=(map[i][i]==symb);
            inleft &= (map[map.length-i-1][i]==symb);
        }
    if(inleft||inright) return true;
    return false;
    }


    /*public static boolean checkWin0(char symb) {
        if(map[0][0] == symb && map[0][1]==symb && map[0][2]==symb) return  true;
        if(map[1][0] == symb && map[1][1]==symb && map[1][2]==symb) return  true;
        if(map[2][0] == symb && map[2][1]==symb && map[2][2]==symb) return  true;

        if(map[0][0] == symb && map[1][0]==symb && map[2][0]==symb) return  true;
        if(map[0][1] == symb && map[1][1]==symb && map[2][1]==symb) return  true;
        if(map[0][2] == symb && map[1][2]==symb && map[2][2]==symb) return  true;

        if(map[0][0] == symb && map[1][1]==symb && map[2][2]==symb) return  true;
        if(map[2][0] == symb && map[1][1]==symb && map[0][2]==symb) return  true;
        return  false;

    }

     */
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn(){
        int x,y;
        do {
            x=rand.nextInt(SIZE);
            y=rand.nextInt(SIZE);
        } while (!isCellValid(x,y));

        System.out.println("Компьютер походил в точку "+(x+1)+" "+(y+1));
        map[y][x]=DOT_0;

    }

    public  static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введите  кординаты X Y");
            x=sc.nextInt()-1;
            y=sc.nextInt()-1;
        }while (!isCellValid(x,y));
        map[y][x]=DOT_X;
    }
    public static boolean isCellValid(int x,int y){
        if (x<0||x>=SIZE||y<0|| y>=SIZE) return false;
        if(map[x][y]==DOT_EMPTY) return true;
        return false;
    }

    public static void initMap(){
        map=new char[SIZE][SIZE];
        for (int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++) {
                map[i][j]=DOT_EMPTY;
            }
        }
    }

    public static void printMap(){
        for (int i=0;i<=SIZE;i++) {
            System.out.println(i+" ");
        }
        System.out.println();
        for (int i=0;i<SIZE;i++){
            System.out.println((i+1)+" ");
            for (int j=0;j<SIZE;j++) {
                System.out.println(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
