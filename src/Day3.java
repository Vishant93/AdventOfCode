import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\visha\\Desktop\\day3.txt");
        List<String> input = Files.readAllLines(path, StandardCharsets.UTF_8);
        boolean[][] grid = new boolean[input.size()][];
        for (int r = 0; r < input.size(); r++) {
            grid[r] = new boolean[input.get(r).length()];
            for (int c = 0; c < input.get(r).length(); c++) {
                grid[r][c] = input.get(r).charAt(c) == '#';
            }
        }
        checkGrid(grid);
        checkGrid2(grid);
    }
    public static void checkGrid(boolean[][] grid) {
        System.out.println(countTrees(grid, 3, 1));
    }
    public static void checkGrid2(boolean[][] grid) {
        final int[][] moves = { { 1, 1 }, { 3, 1 }, { 5, 1 }, { 7, 1 }, { 1, 2 } };
        long product = 1;
        for (int[] m : moves) {
            product *= countTrees(grid, m[0], m[1]);
        }

        System.out.println(product);
    }
    public static int countTrees(boolean[][] grid, int right, int down) {
        int trees = 0;
        for (int r = 0, c = 0; r < grid.length; r += down, c += right) {
            trees += grid[r][c % grid[r].length] ? 1 : 0;
        }

        return trees;
    }
}
