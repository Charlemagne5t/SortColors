import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void sortColorsTest1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new Solution().sortColors(nums);
        int[] expected = {0, 0, 1, 1, 2, 2};

        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void sortColorsTest2() {
        int[] nums = {2, 0, 1};
        new Solution().sortColors(nums);
        int[] expected = {0, 1, 2};

        Assert.assertArrayEquals(expected, nums);
    }
    @Test
    public void sortColorsTest3() {
        int[] nums = {1, 2, 0};
        new Solution().sortColors(nums);
        int[] expected = {0, 1, 2};

        Assert.assertArrayEquals(expected, nums);
    }
}
