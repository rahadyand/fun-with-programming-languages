# list = menyimpan data di dalam 1 variable
# list = array, namun berbeda


## Create list, menggunakan bracket[], pisahkan dengan koma
angka = [1, 'dua', 3.0, 4, 5, 6, 7, 8, 9]

# perbedaan antara list dan array = list bisa menyimpan data dalam tipe yang berbeda beda


## Akses element pada list, dimulai dari 0 (index)
print(angka[0])
print(angka[1])
print(angka[8])

# index =-1 maka akan memanggil elemen di paling belakang
print(angka[-1])
print(angka[-9])

# Representrasi matrix (list of list)
matrixA = [[1, 2], 
            [3, 4], 
            [5, 6]]

print(matrixA[0][0])
print(matrixA[1][0])
print(matrixA[2][1])


## Memodifikasi list
angka[3] = 'empat'
angka[4] = 5.0
angka[5] = 'enam'
angka[6] = 7.0

print(angka)


## Menambahkan Element
# .append() - menambahkan elemet di bagian terakhir
angka.append('sepuluh')
print(angka[9])

# .insert() - (index, element baru)
angka.insert(0, 'nol')
angka.insert(5, 'lima' )
print(angka[0]) 
print(angka[5]) 


## Menghapus elemen
# .remove() 
angka.remove(5)
print(angka)
# kalau ada 2 nilai yang sama, maka akan menghapus 1 nilai saja

# .pop() - Menghapus nilai yang paling belakang
angka.pop()
print(angka)

# .clear() - Menghapus semua nilai di list
angka.clear()
print(angka)


# Mengurutkan sebuah list
# .sort
angka2 = [3, 1, 6, 2, 5, 8, 9, 4, 7]
angka2.sort()
print(angka2)