a)
# Python3 code to demonstrate list
# concatenation using naive method

# Initializing lists
test_list1 = []
test_list2 = []
#Input list
for i in range (0,5):
    temp1 = input("Input list 1: ")
    test_list1.append(temp1)
for i in range (0,5):
    temp2 = input("Input list 2: ")
    test_list2.append(temp2)
# using naive method to concat
for i in test_list2:
    test_list1.append(i)

# Printing concatenated list
print("Concatenated list: " + str(test_list1))
b, c) Some faults exist:
- User want to input each list x elements, however, it’s fixed at 5 elements now.
d) I can update to be:
# Python3 code to demonstrate list
# concatenation using naive method

# Initializing lists
test_list1 = []
test_list2 = []
#No of Elements
no1 = int(input('How many elements in list 1: '))
no2 = int(input('How many elements in list 2: '))
#Input list
for i in range (0,no1):
    temp1 = input("Input list 1: ")
    test_list1.append(temp1)
for i in range (0,no2):
    temp2 = input("Input list 2: ")
    test_list2.append(temp2)
# using naive method to concat
for i in test_list2:
    test_list1.append(i)

# Printing concatenated list
print("Concatenated list: " + str(test_list1))
