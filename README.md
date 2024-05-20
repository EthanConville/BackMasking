# BackMasking
Project for class. We were given a BKStack.java and BackMasking.java files, the rest were written by me. The clip.dat file was a test file provided to be the input audio file to test that the code is working.


ArrayStack Implementation
ArrayStack.java creates a stack using an array. It implements the methods isEmpty, count, push, and pop,
and peek from BKStack.java. Additionally it has its own method, doubleArray, for when the array reaches
capacity. isEmpty returns a bool value based on whether or not the array is empty. “count” returns the
number of elements in the stack. “push” adds an element to the stack and “pop” takes an element off the
stack. “peek” Looks at the element on the top of the stack without removing it from the stack (unlike
“pop”). The program fills in the array from the back to the front, starting with the last value in the array. It
keeps track of the top of the stack with a variable called “topOfStack” which is initialized to -1.
“doubleArray” works by copying the values from the full array to a new array, then setting the pointer
from the old array to the new one. The new array is twice the size of the old array so it copies the values
in starting halfway through the new array.

ArrayStack Complexity
isEmpty, count, push, pop, peek all have a time complexity of O(1). isEmpty, count, and peek are just
outputting values of variables (array lookup time is constant for peek). Because of the nature of a stack,
pop and push only deal with values at the beginning of the array so the entire array does need to be
moved, making complexity O(1). “doubleArray” has a complexity of O(N) because it has to copy every
value of the array to the new array. However, because it is only called occasionally, its addition to the
overall complexity is amortized. This makes the overall complexity of arrayStack O(1)*

ListStack Implementation
ListStack.java creates a stack using a singly linked list. It implements the methods isEmpty, count, push,
and pop, from BKStack.java. “isEmpty” simply checks if the head of the list is pointing to null to check if
the stack is empty. “count” uses an enhanced for loop to count the number of items in the stack, but a
simple variable could also have been used to reduce the complexity of the operation. “push” adds a new
node at the beginning of the list and makes that one the head, removing the necessity to traverse the list
and lowering complexity. “pop” removes the first node in the list then makes the second node the new
head (if it exists). The top of the stack is always the first node in the linked list.

ListStack Complexity
Every method in listStack except “count” takes O(1) time. “isEmpty” is a simple if statement.
“push” inserts at the beginning of the list so it does not need to traverse, making its time
constant. “pop” is the same, and because it just has to change which node is the head its time is
also constant. “count” takes O(n) time because it uses an enhanced for loop, as opposed to the
O(n^2) it would take if it used a regular for loop. It would generally be better to just use a simple
counter variable which would have complexity O(1) but we were told to implement an enhanced
for loop. Since count is not called often in the BackMasking program that utilizes ListStack, its
addition to complexity is amortized. This makes the overall complexity of ListStack 0(1)*
