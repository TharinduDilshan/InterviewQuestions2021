"""
Print the below arrow star pattern for a given size.
height of the arrow should be double the size of the input.

input = 3
  * *
  * *
* * * *
 * * *
  * *
   *

input = 5
  * * * *
  * * * *
  * * * *
  * * * *
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
"""
n = int(input())

for i in range(n - 1):
    print(end="  ")
    for i in range(n - 1):
        print("*", end=' ')
    print()

l = 0
for i in range(n, -1, -1):
    for j in range(l, 0, -1):
        print(end=" ")
    l += 1
    for j in range(0, i + 1):
        print("*", end=' ')
    print()
