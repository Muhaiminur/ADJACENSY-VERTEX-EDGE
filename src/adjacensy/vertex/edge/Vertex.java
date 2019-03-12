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
public class Vertex {
    int name;
    Node adj;
    Vertex(int n,Node a){
        name=n;
        adj=a;
    }
}
