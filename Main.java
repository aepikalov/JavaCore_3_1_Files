package JavaCore_3_1_Files;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File games = new File("D://Games");
        File temp = new File("D://Games//temp");
        File src = new File("D://Games//src");
        File res = new File("D://Games//res");
        File savegames = new File("D://Games//savegames");
        File main = new File("D://Games//src//main");
        File test = new File("D://Games//src//test");
        File mainJava = new File("D://Games//src//main//Main.java");
        File utilsJava = new File("D://Games//src//main//Utils.java");
        File drawables = new File("D://Games//res//drawables");
        File vectors = new File("D://Games//res//vectors");
        File icons = new File("D://Games//res//icons");
        File tempTxt = new File("D://Games//temp//temp.txt");
        try {
            if (games.mkdir()) sb.append("Каталог \"D:/Games\" создан\n");
            if (temp.mkdir()) sb.append("Каталог \"D:/Games/temp\" создан\n");
            if (src.mkdir()) sb.append("Каталог \"D:/Games/src\" создан\n");
            if (res.mkdir()) sb.append("Каталог \"D:/Games/res\" создан\n");
            if (savegames.mkdir()) sb.append("Каталог \"D:/Games/savegames\" создан\n");
            if (main.mkdir()) sb.append("Каталог \"D:/Games/src/main\" создан\n");
            if (test.mkdir()) sb.append("Каталог \"D:/Games/src/test\" создан\n");
            if (mainJava.createNewFile()) sb.append("Файл \"D:/Games/src/main/Main.java\" создан\n");
            if (utilsJava.createNewFile()) sb.append("Файл \"D:/Games/src/main/Utils.java\" создан\n");
            if (drawables.mkdir()) sb.append("Каталог \"D:/Games/res/drawables\" создан\n");
            if (vectors.mkdir()) sb.append("Каталог \"D:/Games/res/vectors\" создан\n");
            if (icons.mkdir()) sb.append("Каталог \"D:/Games/res/icons\" создан\n");
            if (tempTxt.createNewFile()) sb.append("Файл \"D:/Games/temp/temp.txt\" создан\n");
            FileWriter log = new FileWriter("D://Games//temp//temp.txt", false);
            log.write(sb.toString());
            log.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("D://Games//temp//temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
