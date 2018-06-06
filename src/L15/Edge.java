/*
 * L15.Edge
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * Copyright generated on 6/6/18 5:55 PM
 * Last modified on 6/6/18 5:07 PM
 */

package L15;

public class Edge
{
    private Vertex s;
    private Vertex d;
    private int Weight;

    public Vertex getS()
    {
        return s;
    }

    public void setS(Vertex s)
    {
        this.s = s;
    }

    public Vertex getD()
    {
        return d;
    }

    public void setD(Vertex d)
    {
        this.d = d;
    }

    public int getWeight()
    {
        return Weight;
    }

    public void setWeight(int weight)
    {
        Weight = weight;
    }


    public Edge(Vertex s, Vertex d, int weight)
    {
        this.s = s;
        this.d = d;
        this.Weight = weight;
    }

    @Override
    public String toString()
    {
        return "Edge{" +
                "s=" + s.getName() +
                ", d=" + d.getName() +
                ", Weight=" + Weight +
                '}';
    }
}
