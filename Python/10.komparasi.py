a=1
b=2
c=2

hasil1 = a>3
hasil2 = b<3
hasil3 = a == 3
hasil4 = b >= 3
hasil5 = a != b
print(a," > ", 3," = ",hasil1)
print(b," < ", 3," = ",hasil2)
print(a," = ", 3," = ",hasil3)
print(b," >= ", 3," = ",hasil4)
print(a," != ", b," = ",hasil5)

print("=========IS / IS NOT=========")
z = 3
x = 5
y = 5
print('nilai x = ',x,'id = ',hex(id(x)))
print('nilai y = ',y,'id = ',hex(id(y)))
cobahasil = x is not y
print('Hasilnya adalah: ',cobahasil)