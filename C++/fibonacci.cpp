#include <iostream>

// Find nth Fibonacci number
int fibonacci(int n){
    int current, prev = 1, prev_prev = 0;
    if (n < 0){
        throw std::invalid_argument("Index negative number for n in fibonacci.");
    } else if (n < 2) {
        return n;
    } else {
        for (int i = 0; i < n-1; ++i){
            current = prev + prev_prev;
            prev_prev = prev;
            prev = current;
        }
        return current;
    }
}

