import java.util.HashSet;

public class Q1 {
    public static boolean isRepeatedNum(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containDuplicate(int nums []) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 3, 4, 4};
        // System.out.println(isRepeatedNum(nums));
        System.out.println(containDuplicate(nums));
    }

}
