package Arrays.Rotation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Amata on 5/6/2016 AD.
 */
public class SolutionTest {
    @Test
    public void rotate() throws Exception {
        Solution sol = new Solution();
        assertArrayEquals(new int[]{3,4,5,1,2},sol.rotate(new int[]{1,2,3,4,5}, 3));
        assertArrayEquals(new int[]{4,5,1,2,3},sol.rotate(new int[]{1,2,3,4,5}, 2));
    }

    @Test
    public void reverse() throws Exception {
        Solution sol = new Solution();

        assertArrayEquals(new int[]{5,4,3,2}, sol.reverse(new int[]{2,3,4,5}, 0, 3));
        assertArrayEquals(new int[]{2,3,4,5}, sol.reverse(new int[]{2,3,4,5}, 0, 0));
        assertArrayEquals(new int[]{2,3,4,5}, sol.reverse(new int[]{2,3,4,5}, 1, 1));
        assertArrayEquals(new int[]{3,2,4,5}, sol.reverse(new int[]{2,3,4,5}, 0, 1));
        assertArrayEquals(new int[]{4,3,2,5}, sol.reverse(new int[]{2,3,4,5}, 0, 2));
        assertArrayEquals(new int[]{2,4,3,5}, sol.reverse(new int[]{2,3,4,5}, 1, 2));
        assertArrayEquals(new int[]{2,5,4,3}, sol.reverse(new int[]{2,3,4,5}, 1, 3));
        assertArrayEquals(new int[]{2,3,5,4}, sol.reverse(new int[]{2,3,4,5}, 2, 3));
        assertArrayEquals(new int[]{5,4,3,2,6,7,8}, sol.reverse(new int[]{2,3,4,5,6,7,8}, 0, 3));
        assertArrayEquals(new int[]{2,3,4,8,7,6,5}, sol.reverse(new int[]{2,3,4,5,6,7,8}, 3, 6));
        assertArrayEquals(new int[]{8,7,6,5,4,3,2}, sol.reverse(new int[]{2,3,4,5,6,7,8}, 0, 6));
    }

}