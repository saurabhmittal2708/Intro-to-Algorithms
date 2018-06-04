/*
 * L15.Vertex
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 4/6/18 3:41 PM
 * Last modified on 4/6/18 3:41 PM
 */

package L15;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    public List<Vertex> getAdj()
    {
        return adj;
    }

    public Vertex(String name)
    {
        this.name = name;

        this.adj= new ArrayList<Vertex>();
    }

    private String name;
    private List<Vertex> adj;

    public Vertex(String name, List<Vertex> adj)
    {
        this.name = name;
        this.adj = adj;
    }

    @Override
    public String toString()
    {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
