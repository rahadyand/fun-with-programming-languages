# Python Basic Operation

# Operasi Aritmatika
angka1 = 9
angka2 = 15

tambah = angka1 + angka2
kurang = angka1 - angka2
kali = angka1 * angka2
pangkat = angka2 ** angka1
bagi = angka2 / angka1
pembagian_bulat = angka2 // angka1
modulus = angka2 % angka1

pemdas = angka2 - angka1 * (angka2 + angka1) // angka1 + ((angka1 - angka2) ** (angka2 - angka1))

print(tambah)
print(kali)
print(pangkat)
print(bagi)
print(pembagian_bulat)
print(modulus)
print(kali)

print(pemdas)

print('-------------------------------------')


# Operasi Perbandingan
angka1 = 6
angka2 = 4

sama_dengan = angka2 == angka1
tidak_sama_dengan = angka2 != angka1
lebih_besar = angka1 > angka2
lebih_kecil = angka1 < angka2
lebih_besar_sama_dengan = angka2 >= angka1
lebih_kecil_sama_dengan = angka2 <= angka1

print(sama_dengan)
print(tidak_sama_dengan)
print(lebih_besar)
print(lebih_kecil)
print(lebih_besar_sama_dengan)
print(lebih_kecil_sama_dengan)

print('-------------------------------------')


# Operator Logika
mie_ayam = 'enak'
bakso = 'enak'

print((mie_ayam == 'enak') and (bakso == 'tidak enak'))
print((mie_ayam == 'enak') or (bakso == 'enak'))
print(not (bakso == 'enak'))
