package org.nm.dsalgo.problems.others.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiffProductSum1281
{
    private static final Logger logger = LoggerFactory.getLogger(DiffProductSum1281.class);

    public int subtractProductAndSum (int n)
    {
        int pr = 1;
        int sum = 0;
        logger.debug("Number input - {}", n);
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            logger.debug("Quotient - {}, Remainder - {}", n, r);
            if(r > 0){
                pr *= r;
            }
            sum += r;
        }
        logger.debug("Product is - {}, Sum is - {}", pr, sum);
        return pr - sum;
    }
}
