# masuk = float(input('Masukkan nilai yang bernilai kurang dari 5 atau lebih dari 10: '))
# print(masuk,type(masuk))

# isKurangDari = (masuk < 5)
# print('Apakah bilangan tersebut kurang dari 3? ',isKurangDari)

# isLebihDari = (masuk > 10)
# print('Apakah bilangan tersebut lebih dari 10? ',isLebihDari)

# isAtau = isKurangDari or isLebihDari
# print(isAtau)


#kasus irisan
# masuk = float(input('Masukkan nilai yang bernilai lebih dari 5 dan kurang dari 10: '))
# isLebihDari = (masuk > 5)
# print('Apakah bilangan tersebut lebih dari 5? ',isLebihDari)

# isKurangDari = (masuk < 10)
# print('Apakah bilangan tersebut kurang dari 10? ',isKurangDari)

# isDan = isKurangDari and isLebihDari
# print(isDan)

#coba
masuk = float(input('Masukkan nilai yang bernilai lebih dari 0 dan kurang dari 5: '))
isLebihDari = (masuk > 0 and masuk < 5)
print('Apakah bilangan |',masuk,'| tersebut lebih dari 0 dan kurang dari 5? ',isLebihDari)

masuk1 = float(input('Masukkan nilai yang bernilai lebih dari 8 dan kurang dari 11: '))
isMoreDari = (masuk1 > 8 and masuk1 < 11)
print('Apakah bilangan |', masuk1,'| tersebut lebih dari 8 dan kurang dari 11? ',isMoreDari)

isHasil = isLebihDari or isMoreDari
print(isHasil)