## Looping di dalam looping
# Nested loop

## Keyword Fungsi dalam for loop
# pass = Tidak melakukan apa-apa
# continue = Lompat ke iterasi berikutnya
# break	= Menghentikan loop

# konsepnya
for i in range(1, 11): # outer loop
    for j in range(1, 11): # inner loop
        print(f'Nilai i = {i}, j = {j}')
    print('')


# matriks
A = [[1, 2],
    [3, 4]]

B = [[4, 3],
    [2, 1]]

hasil = [[0, 0],
        [0, 0]]

print(A)

# mengakses baris
for baris in range(len(A)):
    pass

# mengakses kolom
for baris in range(len(A)):
    for kolom in range(len(B[0])):
        hasil[baris][kolom] = A[baris][kolom] + B[baris][kolom]
        # print(f'A[{baris}][{kolom}] = {A[baris][kolom]}')
        print(hasil[baris][kolom], end= ' ')
    print(' ')