package org.nm.dsalgo.problems.others.easy;

import org.nm.dsalgo.problems.others.ds.ListNode;

public class BinaryLinkedListToInteger1290
{
    public int getDecimalValue (ListNode head)
    {
        return getValueRecur(head)[1];
    }

    private int[] getValueRecur (ListNode node)
    {
        int[] result = new int[2];
        if (node.next == null) {
            result[0] = 0;
            result[1] = 1 * node.val;
        }
        else {
            int[] prevResult = getValueRecur(node.next);
            result[0] = ++prevResult[0];
            result[1] = ((int)Math.pow(2, result[0]) * node.val) + prevResult[1];
        }
        return result;
    }

    /**
     * We can image this as shifting bits left each time and adding the current value.
     *
     * E.g.,
     *
     * 1. 0 and add n-1 position value to this.
     * 2. Multiply by 2 and add n-2 position to this.
     *
     * If we imagine this, we can see that bits are moving left at each step and value of the current
     * binary digit is getting added.
     *
     * Take 1101
     *
     * Step 1
     * 2 *0 + 1 (0th) - > Binary 1
     * 2 * (1 Prev Value) is like moving binary to left and + 1 (1st) -> Binary 11, Decimal - 3
     * 2 * (3 Prev Value), Moving to left and + 0 (2nd) -> 110 -> 5
     * 2 * (5), << 1 + 1 (3rd) : 1101, 11
     *
     * Shifting left is nothing but multiplying by 2
     * Adding the current binary is nothing but putting the value in the new left position.
     *
     * @param head
     * @return
     */
    public int getDecimalValueGood(ListNode head) {
        int res = 0;
        while (head != null) {
            res *= 2;
            res += head.val;
            head = head.next;
        }
        return res;
    }

    public int getDecimalValueBitManipulation(ListNode head) {
        int res = 0;
        while (head != null) {
            /*
             Moving bits left at each step to make room for new bit.
             In the end all bits will be placed correct.
             */
            res = res << 1;
            res += head.val;
            head = head.next;
        }
        return res;
    }
}
