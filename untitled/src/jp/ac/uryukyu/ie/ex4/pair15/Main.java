package jp.ac.uryukyu.ie.ex4.pair15;

import jdk.incubator.http.MultiMapResult;

import java.io.*;

public class Main {
    MapRead mapRead = new MapRead(); //map.txtを読み込んだ迷路インスタンスを作成
    Player player = new Player(); //map.txtの初期位置にプレイヤーインスタンスを作成
    Display nowMap = new Display(); //現状(プレイヤー現在位置を含んだ迷路)を表示
    /**
     * プレイヤーインスタンスの移動
     * 入力待ち状態
     * 上:k,下:j,右:l,左:h
     * キー入力が行われると、現状表示が実行される
     */
}

class MapRead {
    public static void main(String args[]){
        try{
            File file = new File("/Users/e175766/Desktop/Univ.Ryukyu/Artificial_Interigent_course/1_TheSecondHarf/programming_seminor2/Ex3/prog2_ex3/src/prog2-ex4/untitled/src/map.txt");
            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}

class Player {
}

class Display {
}