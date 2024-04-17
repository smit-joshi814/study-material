/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.LinkedList;

class Aaddress {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Aaddress(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;

    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }

}

public class MailList {

    public static void main(String args[]) {
        LinkedList<Aaddress> ml = new LinkedList<Aaddress>();

		// add new Element to link list
        ml.add(new Aaddress("Smit", "Deesa", "Deesa", "Gujarat", "73898"));
        ml.add(new Aaddress("Vijay", "Deesa", "Deesa", "Gujarat", "73898"));
        ml.add(new Aaddress("Aradhya", "Deesa", "Deesa", "Gujarat", "73898"));
        ml.add(new Aaddress("Tabbassum", "Ranuj", "Patan", "Deesa", "73898"));
        ml.add(new Aaddress("Sweety", "Sasam", "Palanpur", "Gujarat", "73898"));
		// display the ml

        for (Aaddress i : ml) {
            System.out.print(i + "\n");
        }
        System.out.println();
    }
}
