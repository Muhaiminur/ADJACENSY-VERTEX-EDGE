/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacensy.vertex.edge;

/**
 *
 * @author Muhaiminur
 */
public class Node {
    int num=0;
    Node next;
    Node(int n,Node ne){
        num=n;
        next=ne;
    }
}
