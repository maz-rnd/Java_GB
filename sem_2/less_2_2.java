/*
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.
 */
public class less_2_2 {
    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int Color) {
        int oColor = image[sr][sc];
        if (oColor == Color) {
            return image;
        }
        int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        image[sr][sc] = Color;
        for (int i = 0; i < dir.length; i++) {
            int nextX = sr + dir[i][0];
            int nextY = sc + dir[i][1];
            if (nextX < 0 || nextX >= image.length || nextY < 0 || nextY >= image[0].length) {
                continue;
            }
            if (image[nextX][nextY] != oColor) {
                continue;
            }
            floodFill(image, nextX, nextY, Color);
        }
        return image;
    }
}
