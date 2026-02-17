## Function

# contohnya
def sapa_orang():
    print('Halo, gimana kabarnya?')

sapa_orang()

# fuction dengan parameter
def sapa_orang1(nama):
    print(f'Halo, gimana kabarnya {nama}?')

sapa_orang1('tungtung')

# dengan input
def sapa_orang2():
    nama = input('Nama = ')
    print(f'Halo, gimana kabarnya {nama}?')

sapa_orang2()


# numerik
def tambah(angka1, angka2):
    hasil = angka1 + angka2
    print(hasil)

tambah(7,9)


# return value - bisa diakses di luar fungsi
def volume_bola(r):
    phi = 3.14
    volume = ((4/3)* phi * r ** 3)
    print(volume)
    return volume, phi

volume_bola(5)

volume_bola_7 = volume_bola(7)

print(volume_bola_7)

print() 

# Unpacking return value
volume_bola_10, nilai_phi = volume_bola(10)
print(f'Volume bola = {volume_bola_10}, nilai phi = {nilai_phi}')



## FUNGSI RETURN dalam DEF

def biodata():
    print('======= BIODATA =======')
    nama = input('Nama = ')
    umur = input('Umur = ')
    TTL = input('Tanggal Lahir =')
    print(f'Halo {nama}!, Selamat Datang')
    print(f'Umur {nama} = {umur}')
    print(f'Tanggal lahir {nama} = {TTL}')
    return nama, umur, TTL

# Memanggil fungsi dan MENANGKAP hasil lemparannya
n, u, t = biodata() 

# Sekarang data itu bisa dipakai di tempat lain di luar fungsi
print(f"Bulan depan, {n} akan berulang tahun!")
if int(u) > 17:
    print("Boleh bikin KTP")
else:
    print('Sabar dulu ya')


