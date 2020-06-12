package org.nm.dsalgo.problems.greedy;

import java.util.Arrays;

public class CookyGreed
{
    public int contentChildren (int[] g, int[] s)
    {
        if (g != null && g.length > 0 && s != null & s.length > 0) {
            Arrays.sort(g);
            Arrays.sort(s);
            int contentChildren = 0;
            int greedIdx = 0, cookieIdx = 0;
            while (greedIdx < g.length && cookieIdx < s.length) {
                if (s[cookieIdx] >= g[greedIdx]) {
                    contentChildren++;
                    greedIdx++;
                }
                cookieIdx++;
            }
            return contentChildren;
        }
        return 0;
    }
}
