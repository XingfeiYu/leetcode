package round1.integer;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?

 * Created by xingfeiy on 6/16/16.
 */
public class AddDigits {
    public int addDigits(int num) {
        num = num % 9;
        return num == 0 ? 9 : num;
    }
}
