import random, time
listaa = []
for i in range(int(input())):
    listaa.append(random.randint(0,100))
def ordenar(lista):
    wasEdited = True
    while wasEdited:
        wasEdited = False
        for i in range(len(lista) - 1):
            if lista[i] > lista[i+1]:
                a = lista[i]
                lista[i] = lista[i+1]
                lista[i+1] = a
                wasEdited = True

tempo1 = time.time()
ordenar(listaa)
tempo2 = time.time()
deltaTempo = tempo2 - tempo1
print(deltaTempo)
