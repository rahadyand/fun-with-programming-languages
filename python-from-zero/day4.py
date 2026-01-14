## Tuple and Dictonary
# turunan dari list

## Tuple = sama kaya list tapi tidak bisa dimodifikasi (imutable)
list = []
tuple = (1, 2, 'tiga', [3, 4, 5])
tuple1 = (1, ) # jika nilainya hanya 1, maka harus dikasih koma seperti <---

print(tuple[0])
print(tuple[3][2])
print(tuple)


## Dictionary {key-value} - curly bracket
# menyimpan sebuah kunci untuk menambahkan sebuah value di dalam list

# dictonary = {'key':'value'}

biodata = {'umur': 18, 'nama' : 'rahadyan'}

# akses dictionary bukan pakai index tapi pakai key
print(biodata['umur'])


# Akses error handling dictionary
print(biodata.get('Umur', 'Not found'))


## Menambahkan atau mengganti key baru
biodata['nama'] = 'hafiz'
biodata['rumah'] = 'magelang'
print(biodata['rumah'])

print(biodata)

# .update()
biodata.update({'negara' : 'Indonesia', 'bb' : 60})
print(biodata)


## Menghapus 
# del
del biodata['bb']
print(biodata)

# .clear()
biodata.clear()
print(biodata)


## Dictionary dalam dictionary
data = {
    '001' : {'nama' : 'ahmad', 'umur' : 18},
    '002' : {'nama' : 'bima', 'umur': 19},
    '003' : {'nama' : 'cantika', 'umur' : 17}
}
print(data['001'])
print(data['002']['nama'])
print(data['003']['umur'])