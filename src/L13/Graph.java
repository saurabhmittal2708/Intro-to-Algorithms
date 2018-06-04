/*
 * L13.Graph
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 3/6/18 9:50 PM
 * Last modified on 3/6/18 9:50 PM
 */

package L13;

import java.util.ArrayList;
import java.util.List;

public interface Graph
{
    List<Vertex> vertices=new ArrayList<Vertex>();
    public void addEdge(Vertex u, Vertex v);
    public void delEdge(Vertex u, Vertex v);
    public void addVertex(Vertex u);
    public void delVertex(Vertex u);
    public List<Vertex> shortestPath(Vertex s, Vertex d);


}
