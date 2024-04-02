/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Ex1.application;

import Ex1.application.TesteAlunos;

/**
 *
* Author: Kauã de Oliveira Honorato & Daniel Douglas
 */
public class Aluno {
    public static double N1, N2, N3, N4;
    public static String nome;
    public static double  mediaPonderada, somaDeMedidas, media_Alunos;
    public int numero_de_alunos = 3;
    
   public static void calcularMedia () {
      
    mediaPonderada = ((N1 * 1)+(N2 * 2)+(N3 * 3)+(N4 * 4))/10;
   
        somaDeMedidas = somaDeMedidas + mediaPonderada;
        
              
    
}
  
   
 

    public String toString(){
        return "Nome: " + nome + "\n" +
               "Media: " + mediaPonderada;
 
        
        }
    
    public static void mediaAlunos(){
        System.out.printf("Soma das Médias: " + "%.2f", somaDeMedidas);
        somaDeMedidas = somaDeMedidas/3;
        System.out.println();
        System.out.printf("Media Geral dos Alunos: " + "%.2f", somaDeMedidas);
    }
        
       
    }
    
    

