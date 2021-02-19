/**
 * NO EXTERNAL LIBRARIES OR PACKAGES SHOULD BE IMPORTED
 * Sorts an array into WiggleSort format
 *
 * @author 
 */
public class WiggleSort {
    /**
     * Given an integer array nums, reorders it such that nums[0] < nums[1]  >  nums[2] <  nums[3]...
     * @param nums array to sort
     * @return sorted array
    */

    /** MAKE SURE TO SWAP THE BIGGEST NUMBER AT THE START *** NEED TO CHECK FOR THAT **/

    public static int[] WiggleSort(int[] nums) { /** WiggleSort function **/
        for (int i = 1; i < nums.length; i++) { /** For loops that runs through the size of the array **/
            if (nums == null || nums.length <= 1) { /** Tests to see the array is NULL, or if the length is too small **/
                return new int[] {-1}; /** Returns -1 if above condition is true**/
            }
            if (i % 2 == 1) { /** Checks each index in the array and on every odd position, swaps elements to meet the right algorithm **/
                if (nums[i - 1] > nums[i]) {
                    swap(nums, i - 1, i);
                }
            } else { /** If it is not odd, meaning even indexes. Then the if statement checking a lower number swaps the two elements **/
                if (nums[i - 1] < nums[i]) {
                    swap(nums, i - 1, i);
                }
            }
        }
        return nums; /** Returns array after wiggle sort **/
    }

    public static void swap (int[] nums, int a, int b) { /** Swap function **/
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}