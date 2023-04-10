import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>mymap=new HashMap<>();
        Stack<Character>mystack=new Stack<>();
       // '(', ')', '{', '}', '['
        mymap.put(')','(');
        mymap.put('}','{');
        mymap.put(']','[');
        for (char temp:s.toCharArray())
        {
            if (!mymap.containsKey(temp))
            {
                mystack.push(temp);
            }
            else
            {
                if (mystack.size()==0)
                    return false;
                if( mymap.get(temp)!=mystack.pop())
                {
                    return false;
                }
            }

        }
        if (mystack.size()!=0)
                return false;
        return true;
    }
}
