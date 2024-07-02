import random, time
lista = []
for i in range(10000):
    lista.append(random.randint(0,100))
def ordenacaoSelecao(seq):
    n = len(seq)
    for i in range(n - 1):
        indiceDoMenor = i
        for j in range(i+1,n):
            if seq[j]< seq[indiceDoMenor]:
                indiceDoMenor = j
        if indiceDoMenor != i:
            temp = seq[i]
            seq[i] = seq[indiceDoMenor]
            seq[indiceDoMenor] = temp
    return seq
tempo1 = time.time()
ordenacaoSelecao(lista)
tempo2 = time.time()
deltaTempo = tempo2 - tempo1
print(deltaTempo)
