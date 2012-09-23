package Trietree;
import java.util.ArrayList;

public class Node {

    private char name;
    private ArrayList<Node> lapset;

    public Node() {
        lapset = new ArrayList();
    }

    public boolean containsChild(char c) {
        for (int i = 0; i < lapset.size(); i++) {
            if (lapset.get(i).getName() == c) {
                return true;
            }
        }
        return false;
    }

    public Node add(String sana) {
        Node uusi = this.getChild(sana.charAt(0));
        String loput = sana.substring(1);
        if (uusi == null) {
            uusi.setName(sana.charAt(0));
            uusi.add(loput);
        } else {
            uusi.add(loput);
        }

        return uusi;
    }

    public Node getChild(char c) {
        for (int i = 0; i < lapset.size(); i++) {
            if (lapset.get(i).getName() == c) {
                return lapset.get(i);
            }
        }
        Node tyhja = null;
        return tyhja; // :D
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
