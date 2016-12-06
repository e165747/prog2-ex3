package jp.ac.uryukyu.ie.e165746;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by e165746 on 2016/11/29.
 */
public class ExMain {

    public static void main(String[] args){
        String filename = "./src/main/jp/ac/uryukyu/ie/e165746/map.txt";
        List strings = new ArrayList();
        Scanner scanner;

        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        //System.out.println("リストをそのまま出力してみる");
        //System.out.println(strings);

        // 要素毎に出力してみる
        //System.out.println("\n\n要素毎に出力してみる");
        for(int i=0; i<strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}
