<b>Recursion</b>

<b>Pascal’s Triangle</b>

The following pattern of numbers is called Pascal’s triangle.

	    1
	   1 1
	  1 2 1
	 1 3 3 1
	1 4 6 4 1
       ...

The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of the two numbers above it. Write a function that computes the elements of Pascal’s triangle by means of a recursive process.


<b>Parentheses Balancing</b>

Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String.

For example, the function should return true for the following strings:
(if (zero? x) max (/ 1 x))
I told him (that it’s not (yet) done). (But he wasn’t listening)

The function should return false for the following strings:
:-)
())(

<b>Counting Change</b>

Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

