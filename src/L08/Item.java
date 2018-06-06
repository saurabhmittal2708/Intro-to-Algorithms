/*
 * L08.Item
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L08;

public class Item
{
    private int key;
    String value;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }


    public Item(int key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public int getKey()
    {
        return key;
    }

    @Override
    public String toString()
    {
        return "Item{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}





















