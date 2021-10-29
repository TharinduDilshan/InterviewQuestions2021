#Calculate the Fibonacci Sequence up to a input point using both recursive and non recursive strategy.
#Input: 10
#Output: the 10th element on the sequence(34).


#The Fibonacci Sequence is a mathematical sequence that starts with 0 and 1 and progresses by adding the last two elements.

#On the non recursive strategy we'll use one function with the only parameter being the stop point.
def fibonacci_sequence(stop_point):
    first = 0 #We initialize the variables with the two first elements of the sequence
    second = 1
    result = 0 #We initialize the result variable

    for i in range(stop_point-2): #Then we create a loop that stops once it reaches two positions before the stop point(as we already have the two initial elements of the sequence)
        result = first + second #We add the first two elements
        first = second #Then swap the first with the second
        second = result #Then the second with the result of the sum

    return result #After the loop stops, we return the result

#On the recursive strategy we'll use one function with four parameters, the stop point, the first and second elements, with default values of 0 and 1, and a counter with default value of 1.
def recursive_fibonacci_sequence(stop_point, first = 0, second = 1, i=1):
    result = first + second #We set result to be the sum of the first two elements
    first = second #Then swap the first with the second
    second = result #Then the second with the result of the sum

    if i < (stop_point - 2): #Then we check if the counter is still lesser than the stop_point - 2, in order to know if it's already time to stop the recursion
        i += 1 #If the previous condition is true, we increment the counter
        result = recursive_fibonacci_sequence(stop_point, first, second, i) #And call the function again, passing the incremented counter as argument and setting the returned value to result

    return result #After the recursion stops, we return the result


#To show the desired element, we call the method with the position as argument. We'll be using the input mentioned before
print(fibonacci_sequence(10))
print(recursive_fibonacci_sequence(10))
