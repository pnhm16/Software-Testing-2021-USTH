Ex1.5
	1) Find last index of element
a) The program will not check the first value in the array because the condition for loop is wrong.
Modification:
	for(int i = x.length-1; i >= 0; i--)
b) Test case:
	test : x = null, y = 2
Because x is null the program will execute NullPointerException right off the bat.
c) Test case:
	test : x = [2, 3, 5]; y = 3; Expected = 1
Not result in an error state because 3 is in index 1 of the array.
d) Test case:
	test : x = [2, 3, 5]; y = 4; Expected = -1
Result in an error, but not a failure because 4 is not in the array.
e) Test case:
	x = [2, 3, 5]; y = 2; Expected = 0 
Actual = -1
Complete state is after the execute of count but right before return -1;



