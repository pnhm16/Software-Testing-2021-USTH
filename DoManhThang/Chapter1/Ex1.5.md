#### 1.5: Below are four faulty programs. Each includes test inputs that result in failure. Answer the following questions about each program.

a) wrong with the given code
* Find last index of element
If we want to consider all the elements in the array then the condition i must be greater than or equal to 0 (int i = x.length - 1; i >= 0; i--)
*Find last index of zero
To find the last index of an element in an array, we need to invert the loop so that we search from high to low (int i = x.length - 1; i >= 0; i--)
*Count positive elements
A positive number is a number greater than zero, not zero (x[i] > 0)
* Count odd or positive elements
the odd number condition is that the operator of odd number divided by 2 must be non-zero (x[i]%2 != 0)

b)Test cases that does not execute the fault:
Find last index of element: x = [3, 5, 0], y = 0
Find last index of zero: x = [3, 0, 5]
Count positive elements: x = [-1, 0, 1]
Count odd or positive elements: x = [0, 2, 3]

c)Test cases that execute the fault:
Find last index of element: x = [0, 3, 5], y = 0
Find last index of zero: x = [0, 3, 5]
Count positive elements: x = [0, 2, 3]
Count odd or positive elements: x = [-1, 0, 1]

f)
*Find last index of element
public int findLast(int[] x, int y) {
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

*Find last index of zero
public static int lastZero(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == 0) {
                return i;
            }
        }
        return -1;
    }

*Count positive elements
public int countPositive(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                count++;
            }
        }
        return count;
    }
	
* Count odd or positive elements
public int oddOrPos(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != || 0 x[i] > 0) {
                count++;
            }
        }
        return count;
    }
