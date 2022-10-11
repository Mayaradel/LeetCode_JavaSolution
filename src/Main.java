import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] s_new = s.toCharArray();
        char[] t_new = t.toCharArray();

        Arrays.sort(s_new);
        Arrays.sort(t_new);

        if (Arrays.compare(s_new, t_new) == 0) {
            System.out.println("true");
            return true;
        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        if (nums.length == 0) return null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        return ans;

    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i <= j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;

        }

    }

    public class ListNode {
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
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;

    }

    /*
     * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
     */

    public static int romanToInt(String s) {
        int sol = 0;
        char[] s_new = s.toCharArray();

        return sol;

    }

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> expectedNums = new ArrayList<Integer>();
        int output = expectedNums.size();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                expectedNums.add(nums[i]);

            }

        }
        return output;

    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int solve = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                solve = i;
                break;
            }
            if (nums[i] != nums.length) solve = nums.length;

        }
        System.out.println(solve);
        return solve;

    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==val){
        //        nums[i]=nums[n-1];
        //        n--;
        //     }
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        //isAnagram("mayar", "yamar");
        int[] array = {0, 3, 1, 2, 5};
//		System.err.println(array.length);
//		twoSum(array, 10);
        missingNumber(array);
    }
}

