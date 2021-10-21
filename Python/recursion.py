# Write a fibonacci function, the series starts with 0 index, and its value is 0.

def fib(n):

    # Compute the nth Fibonacci number
    if n < 0:
        raise ValueError('Index was negative.')
        
    elif n in [1, 0]:
        return n
        
    
    prev_prev = 0
    prev = 1
    
    for _ in range(n-1):
        current = prev + prev_prev
        prev_prev = prev
        prev = current

    return current


fib(0)
fib(1)
fib(2)
fib(3)
fib(5)
fib(10)
fib(-1)
