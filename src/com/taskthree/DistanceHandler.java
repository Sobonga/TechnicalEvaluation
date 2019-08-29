package com.taskthree;

public class DistanceHandler  {

    public static void main(String[] args) {
        int distances[][] ;
        distances = new int[7][7];

        distances[0][0] = 0;
        distances[1][0] = 365;
        distances[2][0] = 381;
        distances[3][0] = 220;
        distances[4][0] = 1325;
        distances[5][0] = 808;
        distances[6][0] = 673;

        System.out.println(distances[0][0]);
        System.out.println(distances[1][0]);
        System.out.println(distances[2][0]);
        System.out.println(distances[3][0]);
        System.out.println(distances[4][0]);
        System.out.println(distances[5][0]);
        System.out.println(distances[6][0]);
    }

}
