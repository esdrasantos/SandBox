using System;
using Geometria;
using System.Collections.Generic;

namespace Main
{
    class criadorDeRetangulo
    {
        ///<summary>
        ///Metodo que retorna um objeto pertencente a classe forma
        ///</summary>
        public forma criar() 
        {
            forma retangulo = new forma(); // Instancia um novo objeto da classe forma
            retangulo.setLados(4);         // Seta o atributo correspondente a quantidade de lados para 4
            return retangulo;              // Retorna o objeto 
        }

        ///<summary>
        /// Retorna o valor do perimetro de um objeto da classe forma
        ///</summary>
        public void calculaPerimetro( forma objeto )
        {
            objeto.perimetro();
        }
    }      
}