anos=int(input("Digite a sua idade: "))
meses=int(input("Digite quantos meses se passaram desde seu aniversário: "))
dias=int(input("Digite quantos dias você viveu no mês atual: "))
dias_vividos=anos*365+meses*30+dias
print(f"Você viveu um total de {dias_vividos} dias.")