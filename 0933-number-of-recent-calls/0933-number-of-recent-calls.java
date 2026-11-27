
class RecentCounter {
    int[] arr;
    int count;

    public RecentCounter() {
        arr = new int[10000];
        count = 0;
    }

    public int ping(int t) {
        arr[count++] = t;

        int result = 0;

        for (int i = 0; i < count; i++) {
            if (arr[i] >= t - 3000 && arr[i] <= t) {
                result++;
            }
        }

        return result;
    }
}
