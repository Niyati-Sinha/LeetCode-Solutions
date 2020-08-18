//String buffer
import java.lang.StringBuffer;
class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0)
            flag=-1;
        StringBuffer br= new StringBuffer(Integer.toString(x));
        if(flag==-1)
            br.deleteCharAt(0);
        StringBuffer rev=br.reverse();
        if(flag==-1)
            rev.insert(0,"-");
        long res=Long.parseLong(rev.toString());
        return (((res>Integer.MAX_VALUE) || (res<Integer.MIN_VALUE))? 0:(int)res);
    } 
}
