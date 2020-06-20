package org.nm.dsalgo.problems.others.easy;

import org.junit.Test;
import org.nm.dsalgo.problems.others.ds.ListNode;

import static org.junit.Assert.*;

public class BinaryLinkedListToInteger1290Test
{

    private BinaryLinkedListToInteger1290 inst = new BinaryLinkedListToInteger1290();

    @Test
    public void tetOne ()
    {
        int result = getInteger(buildFromArray(new int[] { 1, 0, 1 }));
        assertTrue(5 == result);
    }

    private ListNode buildFromArray (int[] input)
    {
        ListNode headNode  = new ListNode(input[0], null);
        ListNode prevNode = headNode;

        for (int i = 1; i < input.length; i++) {
            ListNode curNode = new ListNode();
            curNode.val = input[i];
            if (prevNode != null) {
                prevNode.next = curNode;
            }
            prevNode = curNode;
        }
        return headNode;
    }

    private int getInteger (ListNode node)
    {
        return inst.getDecimalValueBitManipulation(node);
    }
}