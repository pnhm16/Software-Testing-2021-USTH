# Excercise 1.5
## findLast
```Java
public static int findLast (int[] x, int y)
   {
      for (int i = x.length-1; i > 0; i--)
      {
         if (x[i] == y)
         {
            return i;
         }
      }
      return -1;
   }
```

## lastZero
```Java
public static int lastZero (int[] x)
   {
      for (int i = 0; i < x.length; i++)
      {
         if (x[i] == 0)
         {
            return i;
         }
      }
      return -1;
   }
```

## countPositive
```Java
public static int countPositive (int[] x)
   {
      int count = 0;
      for (int i=0; i < x.length; i++)
      {
         if (x[i] >= 0)
         {
            count++;
         }
      }
      return count;
   }
```

## oddOrPos
```Java
public static int oddOrPos (int[] x)
   {  
      int count = 0;
      for (int i = 0; i < x.length; i++)
      {
         if (x[i]%2 == 1 || x[i] > 0)
         {
            count++;
         }
      }
      return count;
   }
```

## a)
* findLast: the condition for the loop is wrong
```Java
for (int i=x.length-1; i >= 0; i--)
```

* countPositive: the condition in the if statement is wrong
```Java
if (x[i] > 0)
```

## b)
* findLast: `int[] x = {2, 3, 5}` and `y = 2`
* lastZero: `int[] x = {0, 1, 2}`
* countPositive: `int[] x = {-4, 2, 3, -8}`
* oddOrPos: `int[] x = {1, 2, 3}`

## c)
* findLast: `int[] x = {2, 2, 5}` and `y = 2`
* lastZero: `int[] x = {0}`
* countPositive: Not Possible
* oddOrPos: `int[] x = {1, 2, 3}`