package ccz.practise.playwithdatastructure.stack.example;

import ccz.practise.playwithdatastructure.queue.ArrayQueue;
import ccz.practise.playwithdatastructure.queue.Queue;
import ccz.practise.playwithdatastructure.stack.ArrayStack;
import ccz.practise.playwithdatastructure.stack.Stack;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 46043 on 2017/4/4.
 */
public class Infix2PostfixExpression {
    public static void main(String[] args) {
        String infixExpression = "((10+2)*2+2+3+4)*4+(2+3)+2+1*2*3+2*2"; //
        Queue<String> infixExpressionQueue = getInfixExpressionQueue(infixExpression);
        Queue<String> postfixExpressionQueue = new ArrayQueue<>();
        Stack<String> stack = new ArrayStack<>();

        while(infixExpressionQueue.size()>0) {
            String s = infixExpressionQueue.deQueue();
            String top = null;
            if(stack.size()>0) top = stack.getTop();

            if(NumberUtils.isCreatable(String.valueOf(s))) postfixExpressionQueue.enQueue(s);
            else if(StringUtils.equals(s, "(")) stack.push(s);
            else if(StringUtils.equals(s, ")")) {
                String pop = null;
                while(!StringUtils.equals(pop = stack.pop(),"(")) postfixExpressionQueue.enQueue(pop);
            }
            else if(top==null || StringUtils.equals(top, "(")) stack.push(s);
            else if((StringUtils.equals(s, "*") || StringUtils.equals(s, "/"))
                    && (StringUtils.equals(top, "+") || StringUtils.equals(top, "-"))) {
                stack.push(s);
            }
            else if((StringUtils.equals(s, "*") || StringUtils.equals(s, "/"))
                    && (StringUtils.equals(top, "*") || StringUtils.equals(top, "/"))) {
                while(stack.size()>0 && !StringUtils.equals(stack.getTop(), "(") && !StringUtils.equals(stack.getTop(), "+")&& !StringUtils.equals(stack.getTop(), "-")) postfixExpressionQueue.enQueue(stack.pop());
                stack.push(s);
            } else {
                while(stack.size()>0 && !StringUtils.equals(stack.getTop(), "(")) postfixExpressionQueue.enQueue(stack.pop());
                stack.push(s);
            }
        }
        while(stack.size()>0) postfixExpressionQueue.enQueue(stack.pop());

        while(postfixExpressionQueue.size()>0) {
            System.out.print(postfixExpressionQueue.deQueue());
        }
    }

    private static Queue<String> getInfixExpressionQueue(String infixExpression) {
        //将字符串分割成数组
        Set<String> symbolSet = new HashSet<>();
        symbolSet.addAll(Arrays.asList(new String[]{"+", "-", "*", "/", "(", ")"}));
        Queue<String> queue = new ArrayQueue<>();
        String numberStr = new String();
        for(String str : infixExpression.split("")) {
            if(symbolSet.contains(str)) {
                if(StringUtils.isNotBlank(numberStr)) queue.enQueue(numberStr);
                queue.enQueue(str);
                numberStr = new String();
            } else {
                numberStr += str;
            }
        }
        if(numberStr.length()>0) queue.enQueue(numberStr);

        return queue;
    }
}
