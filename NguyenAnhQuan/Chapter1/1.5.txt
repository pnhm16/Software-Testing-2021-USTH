-findLast solution
a) The loop must start with 0 index:
for (int i=x.length-1; i>=0; i--)
b) if x = null, y = 7, before the loop, it will result in NullPointerException
c) x = [5,6,7]; y=6, return 1, because y = 6 is in index 1, there is no error
d) x = [5,6,7]; y=8, return -1, because 8 is not in x
e) x [5,6,5]; y=5; expected 2, return 0, because i has valeu 0, not at the end of array
- lastZero solution:
a) the loop shoue be:
for (int i=x.length-1; i >=0; i--)
b) All input will result in fault
c) If x=[1], return -1,  input has length 0 or 1, there is no error
d) If x=[2,0,4], return 1, there is an error when array has more than 1 element, sice the values if index increase
e) If x=[0,1,0], expected 2, return 0, index i has value 0, however it should be at the end of the array
-countPositive solution
a)Test condition should be:
if (x[i] > 0)
b) If x = [], return 0, because we give empty array array here
c) If x = [2,3,4], return 3, because it not contain 0
d) Every array contain 0 will lead to error, and lead to failure
e) if x = [-5, 0, 1, 2], expected 2, return 3, because it contain 0
-oddOrPos solution
a) Condition should be:
if (x[i]%2 == -1 || x[i] > 0)
b) if x[], return 0 , because array is empty
c) if x=[1,2,3], return 3, because array doesn’t contain negative value
d) If array contain negative value, it will result in error and failure, regardless the rest are positive
e) if x=[-1, 0, 1, 2], expected 3, return 2, because it not count -1 value
