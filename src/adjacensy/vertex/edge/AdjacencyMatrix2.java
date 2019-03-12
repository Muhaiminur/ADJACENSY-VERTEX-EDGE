/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacensy.vertex.edge;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Muhaiminur
 */
public class AdjacencyMatrix2 {
    Vertex2[]list;
    int[][]adj=new int[0][0];
    public AdjacencyMatrix2() {
        try {
            Scanner abir=new Scanner(new File("Input"));
            int c=abir.nextInt();
            int d=abir.nextInt();
            adj=new int[c][c];
            list=new Vertex2[c];
            char x='A';
            for (int i = 0; i < adj.length; i++) {
                String s=Character.toString(x);
                list[i]=new Vertex2(s, null);
                x++;
                
            }
            while(abir.hasNext()){
                int m=index(abir.next());
                int n=index(abir.next());
                add(m,n);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    
    
    public int index(String s){
        for (int c = 0; c < list.length; c++) {
            if (list[c].name.equals(s)) {
                return c;
            }
            
        }
        return -1;
    }
    
    public void add(int c,int d){
        if(c>=0 && d>=0){
            adj[c][d]=1;
            adj[d][c]=1;
        }
    }
    public void print(){
        String s="";
        for (int c = 0; c < adj.length; c++) {
            s=s+"[ "+list[c].name+" ]";
            
        }
        System.out.println("  "+s);
        for (int c = 0; c < adj.length; c++) {
            System.out.print("["+list[c].name+"]");
            System.out.print("[");
            System.out.print(" | ");
            for (int d = 0; d < adj[c].length; d++) {
                System.out.print(adj[c][d]+" | ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    
}
