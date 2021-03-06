package cn.n0nb0at.leetcodeexercise.two_sum;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guopeng
 * @date 2019/2/18
 */
@Service
public class TwoSum {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]¡1
     *
     * @param nums 输入数组
     * @param target 目标和
     * @return 相加为目标和的数组下标
     */
    public int[] twoSum(int[] nums, int target) {
        for (int first = 0; first < nums.length; first++) {
            for (int second = first + 1; second < nums.length; second++) {
                if (target == (nums[first] + nums[second])) {
                    return new int[] {first, second};
                }
            }
        }
        throw new IllegalArgumentException("无对应解");
    }

    /**
     * HashMap 实现
     *
     * @param nums 输入数组
     * @param target 目标和
     * @return 相加为目标和的数组下标
     */
    public int[] twoSumByHashMap(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (hashMap.containsKey(complement)) {
                return new int[] {hashMap.get(complement), index};
            }
            hashMap.put(nums[index], index);
        }
        throw new IllegalArgumentException("无对应解");
    }
}
