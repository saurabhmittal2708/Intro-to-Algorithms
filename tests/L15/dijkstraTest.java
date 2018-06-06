/*
 * L15.dijkstraTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dijkstraTest
{
    Graph testClass = new Graph();


    @Test
    void dijkstrasAlgo()
    {
        testClass.addVertex(new Vertex("A"));
        testClass.addVertex(new Vertex("B"));
        testClass.addVertex(new Vertex("C"));
        testClass.addVertex(new Vertex("D"));
        testClass.addVertex(new Vertex("E"));
        testClass.addEdge("A","B", 1);
        testClass.addEdge("B","E", 4);
        testClass.addEdge("E","D", 2);
        testClass.addEdge("D","A", 2);
        testClass.addEdge("C","B", 3);
        testClass.addEdge("C","E", 1);
        testClass.addEdge("D","C", 1);
        //System.out.println(dijkstra.dijkstrasAlgo(testClass, testClass.getVertices().get("C")));
    }

}