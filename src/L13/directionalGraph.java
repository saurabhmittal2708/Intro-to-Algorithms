/*
 * L13.directionalGraph
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 4/6/18 1:21 PM
 * Last modified on 4/6/18 1:21 PM
 */

package L13;

import java.util.List;

public abstract class directionalGraph implements Graph
{
    public void addEdge(Vertex s, Vertex d)
    {
        if(!s.getAdj().contains(d))
        {
            s.getAdj().add(d);
        }
    }

    public void delEdge(Vertex s, Vertex d)
    {
        if(s.getAdj().contains(d))
        {
            s.getAdj().remove(d);
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
            for (Vertex vertex : this.getVertices())
            {
                if(vertex.getAdj().contains(u))
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
