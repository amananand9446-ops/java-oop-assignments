import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImagePainter {

    private final int[][] image;
    private final ExecutorService executor;

    public ImagePainter(int[][] image) {
        this.image = image;
        this.executor = Executors.newFixedThreadPool(4);
    }

    public void paintImage(int baseColor) throws InterruptedException {

        int rows = image.length;
        int cols = image[0].length;

        int halfRows = rows / 2;
        int halfCols = cols / 2;

        // Top Left
        Future<?> q1 = executor.submit(() ->
                paintQuadrant(0, halfRows, 0, halfCols, baseColor));

        // Top Right
        Future<?> q2 = executor.submit(() ->
                paintQuadrant(0, halfRows, halfCols, cols, 2 * baseColor));

        // Bottom Left
        Future<?> q3 = executor.submit(() ->
                paintQuadrant(halfRows, rows, 0, halfCols, 3 * baseColor));

        // Bottom Right
        Future<?> q4 = executor.submit(() ->
                paintQuadrant(halfRows, rows, halfCols, cols, 4 * baseColor));

        try {
            q1.get();
            q2.get();
            q3.get();
            q4.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

    private void paintQuadrant(int startRow,
                               int endRow,
                               int startCol,
                               int endCol,
                               int color) {

        for (int i = startRow; i < endRow; i++) {

            for (int j = startCol; j < endCol; j++) {

                image[i][j] = color;

            }

        }

    }

    public int[][] getImage() {
        return image;
    }

}