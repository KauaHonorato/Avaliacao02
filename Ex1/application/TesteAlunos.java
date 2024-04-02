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
import java.util.Scanner;

/**
 *
 * Author: Kauã de Oliveira Honorato & Daniel Douglas
 */
public class TesteAlunos {
static int i = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno Aluno = new Aluno();
        
            
        do {
        System.out.println("Informe o Nome do aluno " + i);
        Aluno.nome = sc.next();
        i++;
        
        System.out.println("Informe a N1: ");
        Ex1.application.Aluno.N1 = sc.nextDouble();
        System.out.println("Informe a N2: ");
        Ex1.application.Aluno.N2 = sc.nextDouble();
        System.out.println("Informe a N3: ");
        Ex1.application.Aluno.N3 = sc.nextDouble();
        System.out.println("Informe a N4: ");
        Ex1.application.Aluno.N4 = sc.nextDouble();
            
        
            Aluno.calcularMedia();
        
            System.out.println(Aluno);
        
        } while (i <= 3);
        
        System.out.println("Numero de alunos: " + Aluno.numero_de_alunos);
            
         Aluno.mediaAlunos();
             
        
    }
}
