# Conditional
nilai = 90

if nilai >= 70:
    print('Lulus')
else:
    print('Tidak Lulus')

# elif - Kondisi yang bercabang
if nilai >= 90:
    print('Grade A')
elif nilai >= 80:
    print('Grade B')
elif nilai >= 70:
    print('Grade C')
elif nilai >= 60:
    print('Grade D')
else:
    print('Grade E')


# Nested if
umur = 18
sim = True
izin_ortu = False

if umur >= 17:
    if sim:
        if izin_ortu:
            print("Boleh")
        else:
            print('Izin dulu')
    else:
        print('Bikin sim dulu')
else:
    print('Tidak Boleh')