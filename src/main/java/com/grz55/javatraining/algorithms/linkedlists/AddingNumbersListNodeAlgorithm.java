package com.grz55.javatraining.algorithms.linkedlists;

/*
    Simplified Leet Code algorithm of adding ListNode numbers
    Result is not as ListNode
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }
}

class AddingNumbersListNodeAlgorithm {

    public static int addTwoNumbers(ListNode l1, ListNode l2) {

        int firstNumber = listNodeToNumber(l1);
        int secondNumber = listNodeToNumber(l2);
        int resultNumber;

        System.out.println("First number " + firstNumber);
        System.out.println("Second number " + secondNumber);
        resultNumber = firstNumber + secondNumber;
        System.out.println("Result number " + resultNumber);
        return resultNumber;
    }

    private static int listNodeToNumber(ListNode l1) {
        boolean hasNext = true;
        int result = 0;
        int multiplier = 1;
        ListNode temp = l1;
        do {
            hasNext = temp.hasNext();
            result = result + temp.val * multiplier;
            if (hasNext) {
                temp = temp.next;
            }
            multiplier *= 10;
        } while (hasNext);

        return result;
    }

    public static void main(String[] args) {
        ListNode listNode342 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode465 = new ListNode(5, new ListNode(6, new ListNode(4)));
        int result = addTwoNumbers(listNode342, listNode465);

        ListNode listNode599 = new ListNode(9, new ListNode(9, new ListNode(5)));
        ListNode listNode499 = new ListNode(9, new ListNode(9, new ListNode(4)));
        int result2 = addTwoNumbers(listNode599, listNode499);
    }
}
