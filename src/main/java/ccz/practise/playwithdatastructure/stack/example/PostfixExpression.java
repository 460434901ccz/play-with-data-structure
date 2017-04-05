package ccz.practise.playwithdatastructure.stack.example;

import ccz.practise.playwithdatastructure.queue.ArrayQueue;
import ccz.practise.playwithdatastructure.queue.Queue;
import ccz.practise.playwithdatastructure.stack.ArrayStack;
import ccz.practise.playwithdatastructure.stack.Stack;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.*;

/**
 * Created by 46043 on 2017/4/4.
 */
public class PostfixExpression {

    private static Map<String, Integer> symbolLevelMap = new HashMap<>();

    static {
        symbolLevelMap.put(null, 0);
        symbolLevelMap.put("(", 0);
        symbolLevelMap.put("+", 1);
        symbolLevelMap.put("-", 1);
        symbolLevelMap.put("*", 2);
        symbolLevelMap.put("/", 2);
        symbolLevelMap.put("^", 3);
    }

    public static void main(String[] args) {
        String infixExpression = "((10+2)*2+2+3+4)*4+(2+3)+2+1*2*3+2*2"; //

        Queue<String> postfixExpressionQueue = infix2PostfixExpression(infixExpression);

        while(postfixExpressionQueue.size()>0) {
            System.out.print(postfixExpressionQueue.deQueue());
        }
    }

    public static Queue<String> infix2PostfixExpression(String infixExpression) {
        Queue<String> infixExpressionQueue = getInfixExpressionQueue(infixExpression);
        Queue<String> postfixExpressionQueue = new ArrayQueue<>();
        Stack<String> stack = new ArrayStack<>();

        while(infixExpressionQueue.size()>0) {
            String s = infixExpressionQueue.deQueue();
            String top = null;
            if(stack.size()>0) top = stack.getTop();

            if(NumberUtils.isCreatable(String.valueOf(s))) postfixExpressionQueue.enQueue(s);
            else if(StringUtils.equals(s, "("))stack.push(s);
            else if(StringUtils.equals(s, ")")) {
                String pop = null;
                while(!StringUtils.equals(pop = stack.pop(),"(")) postfixExpressionQueue.enQueue(pop);
            }
            else if(symbolLevelMap.get(s) > symbolLevelMap.get(top)) stack.push(s);
            else {
                while(stack.size()>0 && !StringUtils.equals(stack.getTop(), "(") && (symbolLevelMap.get(s) <= symbolLevelMap.get(stack.getTop())))
                    postfixExpressionQueue.enQueue(stack.pop());
                stack.push(s);
            }
        }
        while(stack.size()>0) postfixExpressionQueue.enQueue(stack.pop());

        return postfixExpressionQueue;
    }

    private static Queue<String> getInfixExpressionQueue(String infixExpression) {
        //将字符串分割成数组
        Set<String> symbolSet = new HashSet<>();
        symbolSet.addAll(Arrays.asList(new String[]{"+", "-", "*", "/", "(", ")"}));

        Queue<String> infixExpressionQueue = new ArrayQueue<>();
        String numberStr = new String();
        for(String str : infixExpression.split("")) {
            if(symbolSet.contains(str)) {
                if(StringUtils.isNotBlank(numberStr)) infixExpressionQueue.enQueue(numberStr);
                infixExpressionQueue.enQueue(str);
                numberStr = new String();
            } else {
                numberStr += str;
            }
        }
        if(numberStr.length()>0) infixExpressionQueue.enQueue(numberStr);

        return infixExpressionQueue;
    }
}
