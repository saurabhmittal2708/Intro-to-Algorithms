/*
 * L15.Vertex
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 6/6/18 5:55 PM
 * Last modified on 6/6/18 4:15 PM
 */

package L15;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    private String name;                                            //private attributes
    private List<Vertex> adj;

    public Vertex(String name)                                      //constructors
    {
        this.name = name;

        this.adj= new ArrayList<Vertex>();
    }

    public Vertex(String name, List<Vertex> adj)
    {
        this.name = name;
        this.adj = adj;
    }

    public List<Vertex> getAdj()                                    //getter methods
    {
        return adj;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()                                        //toString
    {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
