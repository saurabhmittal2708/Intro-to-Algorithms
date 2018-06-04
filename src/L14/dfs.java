/*
 * L14.dfs
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 4/6/18 2:01 PM
 * Last modified on 4/6/18 2:01 PM
 */

package L14;

import L13.Vertex;
import L13.directionalGraph;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class dfs extends directionalGraph
{

    @Override
    public List<Vertex> shortestPath(Vertex s, Vertex d)
    {
        List<Vertex> visited = new ArrayList<Vertex>();
        visited.add(s);

        Dictionary<Vertex, Vertex> parent= new Hashtable<>();

        dfsVisit(s, visited, parent);
        for(Vertex v: this.getVertices())
        {
            if(!visited.contains(v))
            {
                visited.add(v);
                dfsVisit(v, visited, parent);
            }
        }

        List<Vertex> path = new ArrayList<Vertex>();
        Vertex current= d;
        while(!current.equals(s))
        {
            if(current==null)
            {
                break;
            }
            path.add(current);
            current=parent.get(current);
        }
        path.add(s);
        return path;
    }

    private void dfsVisit(Vertex s, List<Vertex> visited, Dictionary<Vertex, Vertex> parent)
    {
        for(Vertex v: s.getAdj())
        {
            if(!visited.contains(v))
            {
                visited.add(v);
                parent.put(v,s);
                dfsVisit(v, visited, parent);
            }
        }
    }

}
