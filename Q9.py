custo_de_fábrica=float(input("Digite o custo de fábrica do carro: "))
custo_final=custo_de_fábrica+15*custo_de_fábrica/100+30*custo_de_fábrica/100
print(f"O custo final do carro, com a porcentagem do distribuidor e dos impostos, será R${custo_final:.2f}.")