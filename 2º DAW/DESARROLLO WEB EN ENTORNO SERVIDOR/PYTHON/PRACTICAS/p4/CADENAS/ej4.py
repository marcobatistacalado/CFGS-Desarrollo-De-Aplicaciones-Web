cadena = input("Introduce palabra: ")
arr = list(cadena)
arr.reverse()

cadena2=""
for i in arr:
    cadena2+=i
    
if (cadena == cadena2):
    print("Son palindromas")
else:
    print("No lo son")