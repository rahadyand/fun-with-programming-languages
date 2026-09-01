# Error Handling
## bagaimana kita menanggapi eror

## pakai try except
# try:
# except Exception:

# try:
#     num = int(input("Masukkan Nilai: "))
#     hasil = 10/num
# except ZeroDivisionError:
#     print('gaboleh dibagi 0')


##
# try: # mencoba suatu program (ada eror atau enggak)
#     num = int(input('Masukkan Nilai: '))
#     hasil = 10/num
# except ZeroDivisionError: # ketika ada eror maka masuk ke except
#     print('gaboleh dibagi 0 woi')
# else: # ketika ga ada eror maka masuk ke else
#     print(f'Hasilnya adalah {hasil}')
# finally: # tereksekusi eror maupun ga eror
#     print('Eror adalah cinta')


## Exception as e (mengambil semua eror yang terjadi di kode)
try: # mencoba suatu program (ada eror atau enggak)
    num = int(input('Masukkan Nilai: '))
    hasil = 10/num
    print(hasil)
except Exception as e: # ketika ada eror maka masuk ke except
    print(f'terjadi eror: {e}')

## nilai e akan merepresentasikan exceptionnya
data = [10, 15, 0,'a', None, True]

for item in data:
    try:
        result = 10/ item 
        print(result)
    except Exception as e:
        print(f'Eror: {e}')

## pass
if True:
    pass

def jumlah():
    pass

# Tujuannya agar kode tidak ngecrash dan terksekusi dengan lancar
## Apakah semua kode pakai try and except?