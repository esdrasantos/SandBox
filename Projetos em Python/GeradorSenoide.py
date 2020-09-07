# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import matplotlib.pyplot
import math
import serial

fam = 40000
pi  = 3.1415
class funcao:

    def cria_senoide(senoide,frequencia):
        qvalores = 100
        dominio  = range(0, int(qvalores)+1)
        tabela = []
        print(type(tabela))
        n = 0
        while n <= qvalores:
            valor = math.sin(2 * pi * n / qvalores)
            tabela.append(valor)
            n += 1

        print('A quantidade de pontos eh:', tabela.__len__())
        return(tabela,dominio)

    def soma_funcao(funcao1, funcao2):
        
        superposicao = []
        for i in funcao1:
            superposicao.append(funcao1[i]*funcao2[i])
            print(superposicao[i])
            
    def amostra_funcao(funcao1,frequencia):
        qam = fam/frequencia
        tamanho = funcao1.__len__() # nao da
        tamanho /= qam
        print(tamanho)
        tabela = []

            
        
     #   return(tabela, dominio)


senoide1 = funcao()
(tabela1, dominio1) = senoide1.cria_senoide(1000)
senoide2 = funcao()
(tabela2, dominio2) = senoide2.cria_senoide(5000)

matplotlib.pyplot.plot(dominio1,tabela1)
matplotlib.pyplot.show()
matplotlib.pyplot.plot(dominio2,tabela2)
matplotlib.pyplot.show()