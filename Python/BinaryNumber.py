Given a base-10 integer,n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

Example

n=125

The binary representation of 125  is1111101 . In base 10 , there are 5 and 1 consecutive ones in two groups. Print the maximum, .

Input Format

A single integer,n .

1<=n<=10^6

Output Format

Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of n.

Sample input
-------
 5
Sample output
 ------
 1

 Sample input
-------
 13
 Sample output
 ------
 2
 

 Ans -Python
 -----------
 #here we need to read a number and find it binary then we need to print the number of maximum ajacent 1 is there
 #i converted it into binary using bin fuction and made it into string and then made an list with spilt via '0', Now we just need print the length of maximum valued binary number


import math
import os
import random
import re
import sys
def fun(n):
    s="".join(bin(n))
    s=s.split('b')
    p="".join(s[1])
    p=p.split('0')
    print(len(max(p)))
     
            
if __name__ == '__main__':
    n = int(input().strip())
    fun(n)
