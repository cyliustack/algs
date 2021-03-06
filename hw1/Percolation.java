import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    int[][] grid;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        grid = new int[n][n];
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++ ) {
                grid[i][j] = 0;
                System.out.format("%d ", grid[i][j]);
            }
            System.out.format("\n");
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {}

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return true;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return true;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return true;
    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation p1 = new Percolation(10);
        System.out.println("Percolation begins.");
    }
}
