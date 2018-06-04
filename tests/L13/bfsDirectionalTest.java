/*
 * L13.bfsDirectionalTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 4/6/18 1:43 PM
 * Last modified on 4/6/18 1:42 PM
 */

package L13;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class bfsDirectionalTest
{
    bfsDirectional testClass = new bfsDirectional();

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
        System.out.println(testClass.shortestPath(vertices.get(1), vertices.get(4)));
        //assertTrue(testClass.shortestPath(vertices.get(1), vertices.get(4)).toString().equals("[Vertex{name='5'}, Vertex{name='6'}, Vertex{name='7'}, Vertex{name='2'}]"));

    }

    @Test
    void addEdge()
    {
        addVertex();
        testClass.addVertex(new Vertex("2"));
        testClass.addEdge(testClass.getVertices().get(0), testClass.getVertices().get(1));
        //System.out.println(testClass);
        assertTrue(testClass.getVertices().get(0).getAdj().contains(testClass.getVertices().get(1)));
    }

    @Test
    void delEdge()
    {
        addEdge();
        testClass.delEdge(testClass.getVertices().get(0), testClass.getVertices().get(1));
        assertFalse(testClass.getVertices().get(0).getAdj().contains(testClass.getVertices().get(1)));
    }

    @Test
    void addVertex()
    {
        testClass.addVertex(new Vertex("1"));
        //System.out.println(testClass);
    }

    @Test
    void delVertex()
    {
        addEdge();
        testClass.delVertex(testClass.getVertices().get(1));
        assertEquals(1, testClass.getVertices().size());
    }
}