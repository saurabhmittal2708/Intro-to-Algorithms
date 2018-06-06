/*
 * L15.dijkstra
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:12 PM
 */ //Dictionary<Vertex, Integer>,Dictionary<Vertex, Vertex>

package L15;

import java.util.*;

public class dijkstra
{
    public static Dictionary<Vertex, Integer> dijkstrasAlgo(Graph G, Vertex s)
    {
        List<Vertex> Q= new ArrayList<Vertex>();
        Dictionary<Vertex, Integer> dist= new Hashtable<Vertex, Integer>();

        Enumeration<Vertex> vertices=G.getVertices().elements();
        int i=0;
        while(vertices.hasMoreElements())
        {
            Q.add(vertices.nextElement());
            dist.put(Q.get(i), Integer.MAX_VALUE);
            i++;
        }

        dist.put(s,0);
        while(!Q.isEmpty())
        {
            Vertex u= Q.get(0);
            for(Vertex itr: Q)
            {
                if(dist.get(itr)< dist.get(u))
                {
                    u=itr;
                }
            }
            Q.remove(u);

            for(Vertex v:u.getAdj())
            {
                if(Q.contains(v))
                {
                    int alt= dist.get(u)+G.findEdge(u.getName(), v.getName()).getWeight();
                    if(alt< dist.get(v))
                    {
                        dist.put(v, alt);
                    }
                }
            }

        }

        return dist;
    }
}
