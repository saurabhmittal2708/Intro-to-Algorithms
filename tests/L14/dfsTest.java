/*
 * L14.dfsTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L14;

import L13.Vertex;
import org.junit.jupiter.api.Test;

import java.util.List;

class dfsTest
{

    dfs testClass = new dfs();
    @Test
    void shortestPath()
    {
        List<Vertex> vertices= testClass.getVertices();

        testClass.addVertex(new Vertex("1"));
        testClass.addVertex(new Vertex("2"));
        testClass.addVertex(new Vertex("3"));
        testClass.addVertex(new Vertex("4"));
        testClass.addVertex(new Vertex("5"));
        testClass.addVertex(new Vertex("6"));
        testClass.addVertex(new Vertex("7"));
        testClass.addVertex(new Vertex("8"));

        testClass.addEdge(vertices.get(0), vertices.get(1));
        testClass.addEdge(vertices.get(1), vertices.get(6));
        testClass.addEdge(vertices.get(0), vertices.get(7));
        testClass.addEdge(vertices.get(6), vertices.get(2));
        testClass.addEdge(vertices.get(5), vertices.get(6));
        testClass.addEdge(vertices.get(2), vertices.get(5));
        testClass.addEdge(vertices.get(2), vertices.get(3));
        testClass.addEdge(vertices.get(5), vertices.get(3));
        testClass.addEdge(vertices.get(3), vertices.get(4));
        testClass.addEdge(vertices.get(5), vertices.get(4));
        //search b/w vertex2(1) and vertex5(4)
        //System.out.println(testClass.shortestPath(vertices.get(1), vertices.get(4)));
    }
}