Exercise 3.3

## enQueue(n) method

```Java
    @Test
    public void testEnQueue() {
    Object a = 1;
    BoundedQueue instance = new BoundedQueue(2);
    instance.enQueue(a);
    
    Assert.assertEquals(instance.toString(), "[1]");
    }
```

## deQueue() method

```Java
   @Test
    public void testDeQueue() {       
        Object a = 4;
        Object b = 5;
        BoundedQueue instance = new BoundedQueue(2);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.deQueue();
        
        Assert.assertEquals(instance.toString(), "[2]");
    }
```

## isEmpty() method

```Java
    @Test
    public void testIsEmpty() {        
        BoundedQueue instance = new BoundedQueue(2);
        assertEquals(instance.isEmpty(), true);
    }
```

## isFull() method

```Java
	@Test
	public void testIsFull() {  
        Object a = 1;
        BoundedQueue instance = new BoundedQueue(2);
        instance.enQueue(a);
        instance.enQueue(a);
        assertEquals(instance.isFull(), true);
    }
```

## toString() method

```Java
    @Test
    public void testToString() {    
        Object a = 3;
        Object b = 4;
        Object c = 5;
        BoundedQueue instance = new BoundedQueue(3);
        instance.enQueue(a);
        instance.enQueue(b);
        instance.enQueue(c);
        Assert.assertEquals(instance.toString(), "[3, 4, 5]");
    }
```
