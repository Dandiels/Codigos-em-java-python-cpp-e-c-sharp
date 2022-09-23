eleitores=int(input("Digite o total de eleitores no município: "))
brancos=int(input("Digite o total de votos brancos: "))
nulos=int(input("Digite o total de votos nulos: "))
válidos=int(input("Digite o total de votos válidos: "))
percentual_brancos=brancos*100/eleitores
percentual_nulos=nulos*100/eleitores
percentual_válidos=válidos*100/eleitores
print("O percentual de votos, em relação ao total de eleitores no município, é:")
print(f"{percentual_brancos:.1f}% votos brancos, {percentual_nulos:.1f}% votos nulos e {percentual_válidos:.1f}% votos válidos.")
