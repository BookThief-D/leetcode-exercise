package cn.n0nb0at.leetcodeexercise.two_sum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guopeng
 * @date 2019/2/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TwoSumTests {
    @Autowired
    private TwoSum twoSumService;

    @Test
    public void validResult() {
        Assert.assertArrayEquals(new int[] {0, 1}, twoSumService.twoSum(new int[] {2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[] {0, 2}, twoSumService.twoSum(new int[] {2, 7, 11, 15}, 13));
        Assert.assertArrayEquals(new int[] {0, 3}, twoSumService.twoSum(new int[] {2, 7, 11, 15}, 17));
        Assert.assertArrayEquals(new int[] {1, 2}, twoSumService.twoSum(new int[] {2, 7, 11, 15}, 18));
        Assert.assertArrayEquals(new int[] {1, 3}, twoSumService.twoSum(new int[] {2, 7, 11, 15}, 22));
        Assert.assertArrayEquals(new int[] {2, 3}, twoSumService.twoSum(new int[] {2, 7, 11, 15}, 26));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidResult() {
        twoSumService.twoSum(new int[] {2, 7, 11, 15}, 1);
    }
}
