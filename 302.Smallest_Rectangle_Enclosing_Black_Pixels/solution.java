class Solution {
    public int minArea(char[][] image, int x, int y) {
        int hori = image[0].length;
        int ver = image.length;
        int up = binarySearch(image, true, 0, x, 0, hori, true);
        int down = binarySearch(image, false, x + 1, ver, 0, hori, true);
        int left = binarySearch(image, true, 0, y, up, down, false);
        int right = binarySearch(image, false, y + 1, hori, up, down, false);
        return (down - up) * (right - left);
    }
    public int binarySearch(char[][] image, boolean s, int i, int j, int low, int high, boolean direction){
        while(i < j){
            int mid = i + (j - i) / 2, k = low;
            //while(k < high && direction ? image[mid][k] == '0' : image[k][mid] == '0')
            if(direction){
                while(k < high && image[mid][k] == '0')
                    ++k;
            }
            if(!direction){
                while(k < high && image[k][mid] == '0')
                    ++k;
            }
            if(k < high == s)
                j = mid;
            else
                i = mid + 1;
        }
        return i;
    }
}
