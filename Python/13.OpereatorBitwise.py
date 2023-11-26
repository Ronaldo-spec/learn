a = 9
b = 5

# bitwise OR (|)

print('========OR========')
c = a | b
print('nilai : ',a, ', binary: ',format(a,'08b'))
print('nilai : ',b, ', binary: ',format(b,'08b'))
print('nilai : ',c, ', binary: ',format(c,'08b'))


print('========AND========')
c = a & b
print('nilai : ',a, ', binary: ',format(a,'08b'))
print('nilai : ',b, ', binary: ',format(b,'08b'))
print('nilai : ',c, ', binary: ',format(c,'08b'))


print('========XOR========')
c = a ^ b
print('nilai : ',a, ', binary: ',format(a,'08b'))
print('nilai : ',b, ', binary: ',format(b,'08b'))
print('nilai : ',c, ', binary: ',format(c,'08b'))


print('========NOT========')
c = ~a
print('nilai : ',a, ', binary: ',format(a,'08b'))
print('nilai : ',c, ', binary: ',format(c,'08b'))
d = 0b00001001
e = 0b11111111
print('nilai: ',e^d,' , binary: ', format(e^d,'08b'))

print('========SHIFTING >>========')
c = a >> 2
print('nilai : ',a, ', binary: ',format(a,'08b'))
print('nilai : ',c, ', binary: ',format(c,'08b'))