import DataStructure.DisJointSet;
import DataStructure.HashMap;
import DataStructure.Trie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ************* Trie *****************

//        Trie trie = new Trie();
//
//        trie.insert("apple");
//        System.out.println(trie.search("apple"));
//        System.out.println(trie.search("app"));
//        System.out.println(trie.startsWith("app"));
//        trie.insert("app");
//        System.out.println(trie.search("appy"));

//        ************* HashMap *****************

//        HashMap<String, Integer> hst = new HashMap<>();
//
//        hst.put("Mohit", 1500000);
//        hst.put("Rajnish", 1200000);
//
//        System.out.println("Mohit CTC: " + hst.get("Mohit"));
//        System.out.println("Rajnish CTC: " + hst.get("Rajnish"));
//
//        hst.put("Rajnish", 1300000);
//
//        System.out.println("After got hike Rajnish CTC: " + hst.get("Rajnish"));


        DisJointSet ds = new DisJointSet(7);
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);

        // if 3 and 7 same or not
        if(ds.getUltimateParent(3) == ds.getUltimateParent(7)) {
            System.out.println("Same");
        }
        else
            System.out.println("Not Same");

        ds.unionBySize(3, 7);
        if(ds.getUltimateParent(3) == ds.getUltimateParent(7)) {
            System.out.println("Same");
        }
        else
            System.out.println("Not Same");

    }
}