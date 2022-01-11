package two

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        var stack = Stack<Char>()
        for (i in s){
            if (i == '(') stack.push(i)
            else if (i == '{') stack.push(i)
            else if (i == '[') stack.push(i)
            else if (i == ')' && stack.isNotEmpty() && stack.peek() == '(') stack.pop()
            else if (i == '}' && stack.isNotEmpty() && stack.peek() == '{') stack.pop()
            else if (i == ']' && stack.isNotEmpty() && stack.peek() == '[') stack.pop()
            else return false
        }
        return stack.empty()
    }
}
