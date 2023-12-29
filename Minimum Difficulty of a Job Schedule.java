class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int size = jobDifficulty.length;

         if(d > size) {
            return -1;
        }

        int temp[][] = new int[d + 1][size + 1];

         for(int num[] : temp) {
            Arrays.fill(num, Integer.MAX_VALUE/2);
        }

        temp[0][0] = 0;

        for(int i=1;i<=d;i++) {
            for(int j=1;j<=size;j++) {
                int maxDiff = 0;

                for(int k=j;k>=i;k--) {
                    maxDiff = Math.max(maxDiff, jobDifficulty[k - 1]);
                    temp[i][j] = Math.min(temp[i][j], temp[i - 1][k - 1] + maxDiff);
                }
            }
        }
        return temp[d][size];
    }
}
