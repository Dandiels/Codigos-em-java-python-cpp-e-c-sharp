salário_fixo=float(input("Digite o salário fixo do vendedor: "))
carros_vendidos=int(input("Digite o número de carros vendidos pelo vendedor: "))
valor_carro=float(input("Digite o valor fixo ganho por cada carro vendido: "))
valor_das_vendas=float(input("Digite o valor total das vendas do vendedor: "))
salário_final=salário_fixo+carros_vendidos*valor_carro+3*valor_das_vendas/100
print(f"O salário final do vendedor será R${salário_final:,.2f}.")