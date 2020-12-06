import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day5 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File(("C:\\Users\\visha\\Desktop\\day5.txt")));
        SortedSet<Integer> seats = new TreeSet<Integer>();

        int max = 0;
        while (reader.hasNext()) {
            String bin = reader.nextLine().replaceAll("[FL]", "0").replaceAll("[BR]",
                    "1");
            seats.add(Integer.parseInt(bin, 2));
            max = Math.max(max, seats.last());
        }

// part 1
        System.out.println("max seat id: " + max);

        int seat = max;
        while (seats.contains(seat)) {
            seat--;
        }

// part 2
        System.out.println("missing seat: " + seat);
    }
}

