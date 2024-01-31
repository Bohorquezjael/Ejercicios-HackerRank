a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)
discriminante = b ** 2 - 4 * a * c;
x1 = (-b + discriminante ** 0.5) / 2 * a
x2 = (-b - discriminante ** 0.5) / 2 * a

print(str(x1) + " " + str(x2))
