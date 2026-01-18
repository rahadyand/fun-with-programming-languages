## Looping
## for = sebanyak (countable, iterable) 
# digunakan saat kita sudah tau seberapa banyak melakukan looping

# for [elemen] in [iterable]:

# mengakses list menggunakan for
angka = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

for a in angka:
    print(a)


## range (start, stop, step)
# start - nilai awal
# stop - batas akhir kalau hanya 1 param maka stopnya saja
# step - langkah / loncatan / increment
for i in range(2, 5, 2):
    print(i)


## len() - menghitung jumlah elemen yanga da di list
angka1 = [1,2,1,213, 89, 21,3,12,3,13,12,3,123,1,321,312,3,123,1,3,213,12,3,12,3213,12,3,21,3,12,3]
print(len(angka1)) # lenght

for i in range(len(angka1)):
    print(angka1[i])



## while = selama (Potentially Infinite, conditional)
# melakukan looping selama kondisi bernilai benar