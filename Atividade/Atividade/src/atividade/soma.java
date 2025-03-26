/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;
public class soma {
    public int valor_um;
    public int valor_dois;
    public int resultado;
    
public int somarIntervalo()
{
    int i;
    this.resultado = 0;
    for (i= valor_um+1; i <= valor_dois; i++)
    {
        this.resultado += 1;
    }
    return this.resultado;
}
}
