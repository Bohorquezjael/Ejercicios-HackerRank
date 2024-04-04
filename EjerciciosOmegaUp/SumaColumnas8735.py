a, b = input().split()
a = int(a)
b = int(b)

arr = [0] * b
for i in range (a):
    numbers = input().split()
    for j in range (b):
        arr[j] += int(numbers[j])

for i in arr:
    print(i)