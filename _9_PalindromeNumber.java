import java.lang.StringBuffer;
class Solution {
    public boolean isPalindrome(int x) 
    {
        StringBuffer br= new StringBuffer(Integer.toString(x));
        StringBuffer rev= new StringBuffer(Integer.toString(x));
        rev.reverse();
        return (rev.toString().equals(br.toString()))? true: false;
    }
}
