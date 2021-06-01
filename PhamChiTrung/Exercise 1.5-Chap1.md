# Ex1.5

* Program 1

a, Explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.

The code here is not right, because we need the for loop to go from the top to the bottom, but in this code, it only goes from the top to the element next to the bottom, so it can't have a perfect solution.

public static int findLast (int[] x, int y)
{ 
 
   for (int i=x.length-1; i >= 0; i--) 
   {
      if (x[i] == y) 
      {
         return i;
      }
   }
   return -1;
}
b
If possible, give a test case that does not execute the fault. If not, briefly explain why not.

test case
x=[7,9]
y=9
c
If possible, give a test case that executes the fault, but does not result in an error state. If not, briefly explain why not.
x=[7,7]
y=7
d
x = [1,0,3]
y= 1
Program 2 explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.
The statement inside the loop returns the index the first time it is reached, we need it to run until meet the last 0.


public static int lastZero (int[] x)
{ 
int index = -1
 for (int i = 0; i < x.length; i++)
{ 
 if (x[i] == 0)
{ 
 index = i;;
} 
}
 return index;
 }

b
 All inputs execute the missing initialization added before the loop. so that, all
inputs execute the fault

program 3
a, explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.
we need to find positive element but in this code, we count 0, and 0 is not a positive number.
public int countPositive (int[] x) 
{ 
int count = 0; 
for (int i=0; i < x.length; i++) 
{ 
if (x[i] > 0) 
{ 
count++; 
} 
} 
return count;
b,
If possible, give a test case that does not execute the fault. If not, briefly explain why not.

x= [1,-2]
c,If possible, give a test case that executes the fault, but does not result in an error state. If not, briefly explain why not.
if we have 0 in the test case, it will always execute it, so it imposible.

program 4
a, explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.
it weong in the logical operator, it must be "&&" while it has "||"  
public static int oddOrPos(int[] x)
{ 
 int count = 0;
for (int i = 0; i < x.length; i++)
{ 
if (x[i]%2 == 1 && x[i] > 0)
{ 
 count++;
} 
} 
 return count;

b,if possible, give a test case that does not execute the fault. If not, briefly explain why not.
x=[2, -2, 1]
