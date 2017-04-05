package ccz.practise.playwithdatastructure.stack.example;

import ccz.practise.playwithdatastructure.queue.Queue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by visionsky on 2017/4/5.
 */
public class Infix2PostfixExpressionTest {
    @Test
    public void testInfix2PostfixExpression() {
        String infixExpression = "((10+2)*2+2+3+4)*4+(2+3)+2+1*2*3+2*2";
        final Queue<String> postfixExpressionQueue = Infix2PostfixExpression.infix2PostfixExpression(infixExpression);
        String actual = new String();
        while(postfixExpressionQueue.size()>0) {
            actual += postfixExpressionQueue.deQueue();
        }
        Assert.assertEquals("102+2*2+3+4+4*23++2+12*3*+22*+", actual);
    }
}
