package BaseClass;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lulifei on 17/7/24.
 */
public class Max {
    public int getMax(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
    public static void writeFile(int results) {
        String fileName = "output.txt";
        try {
            FileWriter writer = new FileWriter(fileName, true);
            SimpleDateFormat format = new SimpleDateFormat();
            String time = format.format(new Date());
            writer.write("\n\t" + results + "\t"+ time);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
