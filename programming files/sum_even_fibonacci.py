a, b = 0, 1
sum_even = 0
#Setting limit for b
while b < 4000000:
    #If b is even add it to sum_even
    if b % 2 == 0:
        sum_even += b
    #Set a = b and b = a+b
    a, b = b, a+b

#Print out the total of all the even numbers
print(sum_even)

# answer should be 4613732
