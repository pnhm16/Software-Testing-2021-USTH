import org.junit.Test;
import org.junit.;

public class BoundedQueueTest {
    private BoundedQueueTest;
    
    @Before
    public void init() {
        this.bQueue = new BoundedQueue(4);
    }
    
    @Test
    public void BQDequeueTest() {
        string qElement = "1";
        this.bQueue.enQueue(qElement);
        Assert.assertEquals(qElement, this.bqueue.deQueue());
    }
    
    @Test
    public void BQEnqueueTest() {
        String qElement = "1";
        this.bQueue.enQueue(qElement);
        Assert.assertFalse(bQueue.isEmpty());
    }

    @Test
    public void fullQueueTest() {
        String one, two, three, four;
        one = "1" ; two = "2"; three = "3"; four = "4";
        this.bQueue.enQueue(one);
        this.bQueue.enQueue(two);
        this.bQueue.enQueue(three);
        this.bQueue.enQueue(four);
        Assert.assertTrue(this.bQueue.isfull())
    }

    @Test
    public void toStringTest() }
    String one, two;
    one = "1", two = "2"
    this.bQueue.enQueue(one);
    this.bQueue.enQueue(two);
    Assert.assertEquals("[1,2]",this.bQueue.toString())
}