package org.nm.dsalgo.problems.others.easy;

/**
 * <pre>
 *     On a plane there are n points with integer coordinates points[i] = [xi, yi]. Your task is to find the minimum time in seconds to visit all points.
 * You can move according to the next rules:
 *     In one second always you can either move vertically, horizontally by one unit or diagonally (it means to move one unit vertically and one unit horizontally in one second).
 *     You have to visit the points in the same order as they appear in the array.
 *     Input: points = [[1,1],[3,4],[-1,0]]
 * Output: 7
 * Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
 * Time from [1,1] to [3,4] = 3 seconds
 * Time from [3,4] to [-1,0] = 4 seconds
 * Total time = 7 seconds
 * Example 2:
 * Input: points = [[3,2],[-2,2]]
 * Output: 5
 * Constraints:
 *     points.length == n
 *     1 <= n <= 100
 *     points[i].length == 2
 *     -1000 <= points[i][0], points[i][1] <= 1000
 * </pre>
 */
public class MinTimeVisitPoints1266
{
    public int minTimeToVisitAllPoints (int[][] points)
    {
        int[] prevPoint = points[0];
        int jumps = 0;
        int i = 1;
        while (i < points.length) {
            int[] curPoint = points[i];
            int xDiff = curPoint[0] - prevPoint[0];
            int yDiff = curPoint[1] - prevPoint[1];
            int minDiff = Math.abs(xDiff) > Math.abs(yDiff) ? Math.abs(yDiff) : Math.abs(xDiff);
            if (xDiff == 0 && yDiff == 0) {
                jumps += 0;
            }
            else if (xDiff == 0) {
                jumps += Math.abs(yDiff);
            }
            else if (yDiff == 0) {
                jumps += Math.abs(xDiff);
            }
            else if (isInQ1(xDiff, yDiff)) {
                jumps += Math.abs(minDiff);
                prevPoint[0] = prevPoint[0] - minDiff;
                prevPoint[1] = prevPoint[1] + minDiff;
                continue;
            }
            else if (isInQ2(xDiff, yDiff)) {
                jumps += Math.abs(minDiff);
                prevPoint[0] = prevPoint[0] + minDiff;
                prevPoint[1] = prevPoint[1] + minDiff;
                continue;
            }
            else if (isInQ3(xDiff, yDiff)) {
                jumps += Math.abs(minDiff);
                prevPoint[0] = prevPoint[0] - minDiff;
                prevPoint[1] = prevPoint[1] - minDiff;
                continue;
            }
            else if (isInQ4(xDiff, yDiff)) {
                jumps += Math.abs(minDiff);
                prevPoint[0] = prevPoint[0] + minDiff;
                prevPoint[1] = prevPoint[1] - minDiff;
                continue;
            }
            i++;
            prevPoint = curPoint;
        }
        return jumps;
    }

    private boolean isInQ1 (int xDiff, int yDiff)
    {
        return xDiff < 0 && yDiff > 0;
    }

    private boolean isInQ2 (int xDiff, int yDiff)
    {
        return xDiff > 0 && yDiff > 0;
    }

    private boolean isInQ3 (int xDiff, int yDiff)
    {
        return xDiff < 0 && yDiff < 0;
    }

    private boolean isInQ4 (int xDiff, int yDiff)
    {
        return xDiff > 0 && yDiff < 0;
    }

    /**
     * In anyway you go from one point to other, Max
     * you will cover is the maximum difference between co-ordinates
     * of two points.
     * @param points
     * @return
     */
    public int minTimeToVisitAllPointsEff(int[][] points){
        int seconds = 0;
        for(int i =1; i < points.length ; i++){
            int xDiff = Math.abs(points[i][0] - points[i-1][0]);
            int yDiff = Math.abs(points[i][1] - points[i-1][1]);
            seconds += Math.max(xDiff, yDiff);
        }
        return seconds;
    }
}
