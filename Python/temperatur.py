celcius = float(input("Masukkan suhu dalam Celcius: "))
print("Suhu dalam celcius adalah: ",celcius)

reamur = (4 / 5) * celcius
print("Suhu dalam Reamur adalah: ",reamur)

fahrenheit = ((9/5) * celcius) + 32
print("Suhu dalam Fahrenheit adalah: ",fahrenheit)

kelvin = celcius + 273
print("Suhu dalam Kelvin adalah: ",kelvin)

print("======FAHRENHEIT TO KELVIN======")
fahren = float(input("Masukkan suhu fahrenheit: "))
print("Suhu dalam Fahrenheit adalah: ", fahren)
facel= ((5/9) * (fahren-32))
print("Suhu dalam celius adalah: ", facel)
cekel = facel + 273
print("Suhu dalam Kelvin adalah: ", cekel)

print("======KELVIN TO FAHRENHEIT======")
kelvin = float(input("Masukkan suhu kelvin: "))
celcius = kelvin - 273
celfah = ((9/5) * celcius) + 32
print("Suhu dalam Fahrenheit adalah: ", celfah)