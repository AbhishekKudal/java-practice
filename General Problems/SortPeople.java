//2418. Sort the People

// https://leetcode.com/problems/sort-the-people/

class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            int last = heights.length - i - 1;
            int maxIndex = getMaxIndex(heights, 0, last);
            swap(heights, maxIndex, last);
            swap(names, maxIndex, last);
        }
        return names;

    }

    static int getMaxIndex(int arr[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] > arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void swap(String arr[], int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
