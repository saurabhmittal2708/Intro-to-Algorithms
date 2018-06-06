/*
 * L08.universalHashTest
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class universalHashTest
{
    universalHash testClass= new universalHash(97);

    @Test
    void hash()
    {
        //System.out.println(testClass.hash(15));
        //System.out.println(testClass.hash(112));
        assertNotEquals(15, testClass.hash(15));
        assertNotEquals(15, testClass.hash(112));
    }

    @Test
    void insert()
    {
        Item item11= new Item(1, "IITB");
        Item item12= new Item(1, "IITD");
        Item item13= new Item(1, "IITM");
        Item item21= new Item(2, "BITSP");
        Item item22= new Item(2, "BITSG");
        Item item23= new Item(2, "BITSH");
        Item item3= new Item(40, "IISC");

        testClass.insert(item11);
        testClass.insert(item12);
        testClass.insert(item13);
        testClass.insert(item21);
        testClass.insert(item22);
        testClass.insert(item23);
        testClass.insert(item3);

        //System.out.println(testClass);
    }

    @Test
    void search()
    {
        insert();
        assertEquals(new Item(1, "IITB").toString(), testClass.search(1).toString());
        assertEquals(new Item(2, "BITSP").toString(), testClass.search(2).toString());
        assertEquals(new Item(40, "IISC").toString(), testClass.search(40).toString());
    }

    @Test
    void delete()
    {
        insert();
        testClass.delete(new Item(1, "IITD"));
        assertEquals(new Item(1, "IITB").toString(), testClass.search(1).toString());
        //System.out.println(testClass);

        testClass.delete(new Item(40, "IISC"));
        assertNull(testClass.search(40));

    }
}