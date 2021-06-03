import static org.junit.Assert.*;
import org.junit.*;
import junit.framework.JUnit4TestAdapter;

public class BoundedQueueTest {

	@Test
	public void testEnqueueToFull() throws QueueFullException {
		
		/* Test should not throw QueueFullException */
		
		BoundedQueue q = new BoundedQueue(5);
		for (int i = 1; i < 6; i++)
			q.enqueue(i);
		
		assertTrue(q.print().equals("1 2 3 4 5"));
		
	}
	
	@Test
	public void testDequeueToEmpty() throws QueueFullException, QueueEmptyException {
		
		/* Test should not throw QueueEmptyException */

		BoundedQueue q = new BoundedQueue(5);
		for (int i = 1; i < 6; i++)
			q.enqueue(i);
		
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
		assertEquals(4, q.dequeue());
		assertEquals(5, q.dequeue());
		
	}
	
	@Test(expected = Exception.class)
	public void testEnqueuePastCapacity() throws QueueFullException {
		
		/* Test should throw QueueFUllException */
		
		BoundedQueue q = new BoundedQueue(5);
		for (int i = 1; i < 7; i++)
			q.enqueue(i);
		
	}
	
	@Test(expected = Exception.class)
	public void testDequeuePastEmpty() throws QueueFullException, QueueEmptyException {
		
		/* Test should throw QueueEmptyException */
		
		BoundedQueue q = new BoundedQueue(5);
		for (int i = 1; i < 6; i++)
			q.enqueue(i);
		
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
		assertEquals(4, q.dequeue());
		assertEquals(5, q.dequeue());
		
		q.dequeue();
	}
	
	@Test(expected = Exception.class)
	public void testPotpourri() throws QueueFullException, QueueEmptyException {

		/* JUnit for various test cases involving enqueue and dequeue together */
		
		BoundedQueue q = new BoundedQueue(5);
		BoundedQueue q2 = new BoundedQueue(1000000);
		
		for (int i = 1; i < 6; i++)
			q.enqueue(i);
		
		assertEquals(1, q.dequeue());
		
		q.enqueue(6);
		
		assertTrue(q.print().equals("2 3 4 5 6"));
		
		for (int i = 2; i < 6; i++)
			assertEquals(i, q.dequeue());
		
		assertTrue(q.print().equals("6"));
		
		/* Testing on size of 1000000 */
		
		for (int i = 1; i < 100001; i++) {
			q2.enqueue(100001-i);
			assertEquals(100001-i, q2.dequeue());
		}
		
		assertTrue(q2.print().equals(""));
		
		q2.dequeue();
		
		
	}

	public static junit.framework.Test suite(){
  		return new JUnit4TestAdapter(BoundedQueueTest.class);
 	}

}
