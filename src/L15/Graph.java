/*
 * L15.Graph
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:12 PM
 */

package L15;

import java.util.*;

public class Graph
{
    private Dictionary<String, Vertex> vertices;
    private List<Edge> edges;


    public Graph()
    {
        this.vertices= new Hashtable<String, Vertex>();
        this.edges= new ArrayList<Edge>();
    }

    public Dictionary<String, Vertex> getVertices()
    {
        return vertices;
    }
    public List<Edge> getEdges()
    {
        return edges;
    }

    public void addEdge(String s, String d, int w)
    {
        edges.add(new Edge(vertices.get(s), vertices.get(d), w));
        vertices.get(s).getAdj().add(vertices.get(d));
    }

    public void delEdge (String s, String d)
    {
        edges.remove(findEdge(s,d));
        vertices.get(s).getAdj().remove(vertices.get(d));
    }

    public Edge findEdge(String s, String d)
    {
        for (Edge edge : this.edges)
        {
            if(edge.getS().getName().equals(s) & edge.getD().getName().equals(d))
            {
                return edge;
            }
        }
        return null;
    }

    public void addVertex(Vertex u)
    {
        vertices.put(u.getName(), u);
    }
    public void delVertex(String v)
    {
        Vertex ver= vertices.get(v);
        for(Vertex d: ver.getAdj())
        {
            delEdge(ver.getName(), d.getName());
        }

        vertices.remove(v);
    }

    @Override
    public String toString()
    {
        String str="Graph:\n";
        str+="Vertices: ";
        Enumeration<String> iteratr= vertices.keys();
        while(iteratr.hasMoreElements())
        {
            str+=iteratr.nextElement();
            str+=", ";
        }
        str+="\nEdges: ";
        str+=edges.toString();
        return str;
    }
}
