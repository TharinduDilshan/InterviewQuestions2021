'''
Problem Statement: Jon is very fond of strings. (Or so he thinks!) But, he does not like strings which have same consecutive letters. No one has any idea why it is so. He calls these strings as Bad strings. So, Good strings are the strings which do not have same consecutive letters. Now, the problem is quite simple. Given a string S, you need to convert it into a Good String.

You simply need to perform one operation - if there are two same consecutive letters, delete one of them.

Input:
The first line contains an integer T, denoting the number of test cases.
The next T lines contains the test cases consisting of a string S, which consists of only lower case letters.

Output:
For each test case, print the answer to the given problem.

Constraints:
1 <= T <= 10
1 <= |S| <= 30

Test Cases:
Sample Input
4                             
abb
aaab
ababa
aabbaa

Sample Output
ab
ab
ababa
aba

'''
def CreateGoodString(input_string, temp, i, output_string):

    if i == len(input_string):

        return output_string

    else:

        if temp == "":

            output_string += input_string[i]
            temp = input_string[i]

        else:

            if temp != input_string[i]:

                output_string += input_string[i]
                temp = input_string[i]

        return CreateGoodString(input_string, temp, i+1, output_string)


#main Method
N = int(input())

for i in range(N):

    input_string = input()
    print(CreateGoodString(input_string, temp="", i=0, output_string=""))
