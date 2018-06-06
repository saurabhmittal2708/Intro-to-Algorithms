/*
 * L13.bfsNonDirectional
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L13;

import java.util.*;

public class bfsNonDirectional extends nonDirectionalGraph
{
    @Override
    public List<Vertex> shortestPath(Vertex s, Vertex d)
    {
        List<Vertex> visited= new ArrayList<Vertex>();
        visited.add(s);
        Dictionary<Vertex, Vertex> parent= new Hashtable<>();

        List<Vertex> frontier= new ArrayList<Vertex>();
        //parent.put(s, null);
        frontier.add(s);

        int flag=1;
        while(!frontier.isEmpty() & flag==1)
        {
            List<Vertex> next = new ArrayList<Vertex>();
            for(Vertex u: frontier)
            {
                for(Vertex v: u.getAdj())
                {
                    if(!visited.contains(v))
                    {
                        visited.add(v);
                        parent.put(v,u);
                        next.add(v);
                        if(v.equals(d))
                            flag=0;
                    }
                }
            }
            frontier=next;
        }

        List<Vertex> path= new ArrayList<Vertex>();
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
}
