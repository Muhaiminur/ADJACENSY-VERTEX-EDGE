/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacensy.vertex.edge;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Muhaiminur
 */
public class AdjacencyList2 {
    Vertex2[]list;

    public AdjacencyList2() {
        try {
            Scanner abir=new Scanner(new File("Input"));
            list=new Vertex2[abir.nextInt()];
            //System.out.println(adjl.length);
            int f=abir.nextInt();
            char x='A';
            for (int c = 0; c < list.length; c++) {
                String s=Character.toString(x);
                list[c]=new Vertex2(s, null);
                x++;
            }
            while (abir.hasNext()) {
                int l1 =index(abir.next());
                int l2=index(abir.next());
                list[l1].adj=new Node(l2, list[l1].adj);
                list[l2].adj=new Node(l1,list[l2].adj);
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
    public void print(){
        for (int c = 0; c < list.length; c++) {
            System.out.print(list[c].name);
            for(Node n=list[c].adj;n!=null;n=n.next){
                System.out.print(" --> "+list[n.num].name);
            }
            System.out.println();
        }
    }
}
