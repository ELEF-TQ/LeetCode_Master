class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image; 
        fill(image, sr, sc, image[sr][sc], color); 
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int originalColor, int color) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }

        image[sr][sc] = color;

        fill(image, sr + 1, sc, originalColor, color); // DOWN
        fill(image, sr - 1, sc, originalColor, color); // UP
        fill(image, sr, sc + 1, originalColor, color); // RIGHT
        fill(image, sr, sc - 1, originalColor, color); // LEFT
    }
}
