/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacensy.vertex.edge;

/**
 *
 * @author ITCLANBD
 */
public class ADJACENSYVERTEXEDGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("================ADJACENCY LIST=================");
        AdjacencyList2 asl2=new AdjacencyList2();
        asl2.print();
        System.out.println("================ADJACENCY MATIX=================");
        AdjacencyMatrix2 ad2=new AdjacencyMatrix2();
        ad2.print();
    }
    
}
