import java.util.HashMap

class Leetcode0001TwoSum {
    //map to record
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for(i in 0..nums.size - 1){
            if(map.containsKey(target - nums[i])){
                val tmp = map.get(target - nums[i])!!.toInt()
                val ans : IntArray = intArrayOf(tmp,i)
                return ans
            }
            map.put(nums[i],i)
        }
        return intArrayOf()
    }
}