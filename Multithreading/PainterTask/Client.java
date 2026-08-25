public class Client {

    public static void main(String[] args) throws InterruptedException {

        int[][] image = new int[4][4];

        ImagePainter painter = new ImagePainter(image);

        painter.paintImage(5);

        int[][] paintedImage = painter.getImage();

        System.out.println("Painted Image:");

        for (int i = 0; i < paintedImage.length; i++) {

            for (int j = 0; j < paintedImage[i].length; j++) {

                System.out.print(paintedImage[i][j] + " ");

            }

            System.out.println();

        }

    }

}