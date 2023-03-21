#include <iostream>

int main()
{
    int a = 0, b = 1;
    int sum_even = 0;
    //Setting limit
    while (b < 4000000) {
        //Summing even numbers
        if (b % 2 == 0) {
            sum_even += b;
        }
        int temp = b;
        //Resetting b so next loop a is b and b is the last number we calculated
        b = a + b;
        a = temp;
    }
    //Print to screen
    std::cout << sum_even << std::endl;
    return 0;
}

// answer should be 4613732
