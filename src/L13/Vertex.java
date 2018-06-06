/*
 * L13.Vertex
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L13;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    public List<Vertex> getAdj()
    {
        return adj;
    }

    private List<Vertex> adj;
    private String name;

    public Vertex(List<Vertex> adj, String name)
    {
        this.adj = adj;
        this.name= name;
    }

    public Vertex(String name)
    {
        this.adj= new ArrayList<Vertex>();
        this.name= name;
    }

    public void addNbr(Vertex v)
    {
        if(!adj.contains(v))
        {
            adj.add(v);
        }
    }

    public void delNbr(Vertex v)
    {
        if(adj.contains(v))
        {
            adj.remove(v);
        }
    }


    @Override
    public String toString()
    {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}