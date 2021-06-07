package text;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ClassName:TextDemo3
 * Package:text
 * Description:
 *
 * @Author:HP
 * @date:2021/6/6 21:55
 */
public class TextDemo3 {
    //寻找第k大
//    public int findKth(int[] a, int n, int K) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2 - o1);
//        for(int i = 0; i < n; i++) {
//            queue.offer(a[i]);
//        }
//        while(K - 1 != 0) {
//            queue.remove();
//            K--;
//        }
//        return queue.remove();
//    }

//    public int maxsumofSubarray (int[] arr) {
//        int[] dp = new int[arr.length];
//        dp[0] = arr[0];
//        int max = arr[0];
//        for(int i = 1; i < arr.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + arr[i],arr[i]);
//            max = Math.max(dp[i],max);
//        }
//        return max;
//    }

    //最长公共子序列-II
//    public String LCS (String s1, String s2) {
//        int n1 = s1.length();
//        int n2 = s2.length();
//        String[][] dp = new String[n1 + 1][n2 + 1];
//        for(int i = 0;i <= n1; i++) {
//            for(int j = 0; j <= n2; j++) {
//                if(i == 0 || j == 0) {
//                    dp[i][j] = "";
//                } else if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
//                } else {
//                    dp[i][j] = dp[i - 1][j].length() > dp[i][j - 1].length() ? dp[i - 1][j]:dp[i][j - 1];
//                }
//            }
//        }
//        if(dp[n1][n2] == "") return "-1";
//        return dp[n1][n2];
//    }

    //容器盛水问题
//    public long maxWater (int[] arr) {
//        int n = arr.length;
//        if(arr == null || n == 0 || n== 2) return 0;
//        int l = 0,r = n - 1,i = l,j = r;
//        long v = 0;
//        while(i < j) {
//            if(arr[l] < arr[r]) {
//                if(arr[++i] < arr[l]) {
//                    v += arr[l] - arr[i];
//                } else {
//                    l = i;
//                }
//            }else {
//                if(arr[--j] < arr[r]) {
//                    v += arr[r] - arr[j];
//                } else {
//                    r = j;
//                }
//            }
//        }
//        return v;
//    }

    //删除链表的倒数第n个节点
//    public ListNode removeNthFromEnd (ListNode head, int n) {
//        if(head == null) return null;
//        ListNode fast = head;
//        ListNode slow = head;
//        while(n - 1 != 0) {
//            if(fast.next != null) {
//                fast = fast.next;
//                n--;
//            }
//        }
//        ListNode prev = null;
//        while(fast.next != null) {
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next;
//        }
//        if(slow == head) {
//            head = head.next;
//            return head;
//        }
//        prev.next = slow.next;
//        return head;
//    }

    //删除有序链表中重复出现的元素
//    public ListNode deleteDuplicates (ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        ListNode cur = head;
//        ListNode prev = newHead;
//        while(cur != null && cur.next != null) {
//            if(cur.next != null && cur.val == cur.next.val) {
//                while(cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//                prev.next = cur.next;
//            } else {
//                prev = cur;
//            }
//            cur = cur.next;
//        }
//        return newHead.next;
//    }
    public static void main(String[] args) {

    }
}
