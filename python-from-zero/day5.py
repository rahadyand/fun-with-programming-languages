## Input & Output
# input()
nama = input('Namanya siapa? ')

print('Namanya adalah', nama)

# konversi string ke integer
umur = int(input('Umur berapa? '))
print('umurnya adalah', umur)

# Fungsi ubah ke integer agar bisa di kalkulasi
print(umur + 5)

# konversi string ke float
bb = float(input('BB berapa? '))
print('bbnya adalah', bb)


## String manipulation
# .lower() KAPITAL -> kecil
nama2 = input('Nama lengkap? ').lower()
print('Nama lengkapnya adalah', nama2)

# .upper() kecil -> KAPITAL
nama2 = input('Nama lengkap? ').upper()
print('Nama lengkapnya adalah', nama2)

# digabungkan
nama = 'rahadyan'
nama1 = 'hafiz'
nama2 = nama + ' ' + nama1
print(nama2)


## Output

nama = 'rahadyan'
umur = 18
bb = 55.8

# '\n' digunakan untuk menambahkan line baru, agar tidak di satu line yang sama
print('Nama :', nama, 
        '\nUmur :', umur, 
        '\nbb :', bb)

# end = ' ' digunakan untuk menyambungkan 2 baris menjadi 1
print('Hello World', end = ' ')
print('Hello World')


# bisa juga menggunakan + bukan koma, namun harus di konversi ke string
print('Nama :' + nama, 
        '\nUmur :' + str(umur), 
        '\nbb :' + str(bb))


## Metode yang bagus
# Formated string
print(f'Nama : {nama} \nUmur : {umur}')

pi = 22/7
print(f'Nilai pi : {pi:.2f}') #.2 agar mengambil 2 angka dibelakang koma saja
# .2f - f mengindikasikan float


# ''' ''' 
print('''tes
ya
oke
mantap
''')


## Raw string - string mentah gabisa mengakses new line
# Biasanya dipakai di path file 
print(r'Nama \n rahadyan')