/*
 * L13.nonDirectionalGraph
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L13;

import java.util.List;

public abstract class nonDirectionalGraph implements Graph
{
    //List<Vertex> vertices=new ArrayList<Vertex>();

    public void addEdge(Vertex u, Vertex v)
    {
        if(!u.getAdj().contains(v))
        {
            u.getAdj().add(v);
            v.getAdj().add(u);
        }
    }

    public void delEdge(Vertex u, Vertex v)
    {
        if(u.getAdj().contains(v))
        {
            u.getAdj().remove(v);
            v.getAdj().remove(u);
        }
    }

    public void addVertex(Vertex u)
    {
        if(!vertices.contains(u))
        {
            vertices.add(u);
        }
    }

    public void delVertex(Vertex u)
    {
        if(vertices.contains(u))
        {
            vertices.remove(u);
            for (Vertex vertex : u.getAdj())
            {
                vertex.getAdj().remove(u);
            }

        }
    }

    public List<Vertex> getVertices()
    {
        return vertices;
    }

    public String toString()
    {
        String str= "bdGraph\n";
        for(Vertex u: vertices)
        {
            str+=u.toString()+" :"+u.getAdj().toString()+"\n";
        }

        return str;
    }

}
