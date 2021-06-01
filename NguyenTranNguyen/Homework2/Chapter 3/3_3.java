import org.junit.Assertions;
import org.junit.BeforeEach;
import org.junit.Test;

class BoundedQueueTest {
	
	private BoundedQueue queue;

	@BeforeEach
	public void setUp() {
		this.queue = new BoundedQueue(3);
	}
	
	@Test
	public void testEnqueue() {
		String elem = "New Element";
		this.queue.enQueue(elem);
		Assertions.assertFalse(queue.isEmpty());
	}
	
	@Test
	public void testDequeue() {
		String elem = "New Element";
		this.queue.enQueue(elem);
		Assertions.assertEquals(elem, this.queue.deQueue());
	}
	
	@Test
	public void testFull() {
		String elem1, elem2, elem3;
		elem1 = "1";
		elem2 = "2";
		elem3 = "3";
		
		this.queue.enQueue(elem1);
		this.queue.enQueue(elem2);		
		this.queue.enQueue(elem3);
		Assertions.assertTrue(this.queue.isFull());
	}

	@Test
	public void testEmpty() {
		Assertions.assertTrue(this.queue.isEmpty());
	}
	
	@Test
	public void testToString() {
		String elem1, elem2, elem3;
		elem1 = "1";
		elem2 = "2";
		elem3 = "3";
		
		this.queue.enQueue(elem1);
		this.queue.enQueue(elem2);
		this.queue.enQueue(elem3);
		
		Assertions.assertEquals("[1, 2, 3]", this.queue.toString());
	}
}