// solution number 1
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[i].length + 1) / 2; j++) {
                temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[i].length - 1 - j] ^ 1;
                image[i][image[i].length - 1 - j] = temp;

            }

        }

        return image;
    }

}

// solution number 2
class solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[i].length) / 2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;

            }

            for (int j = 0; j < (image[i].length); j++) {
                if (image[i][j] == 0)
                    image[i][j] = 1;
                else if (image[i][j] == 1)
                    image[i][j] = 0;

            }

        }

        return image;

    }
}