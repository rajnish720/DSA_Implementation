package DataStructure;

import java.util.*;

public class DisJointSet {
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisJointSet(int n) {
        for(int i=0;i<=n;i++) {
            parent.add(i);
            size.add(1);
        }
    }

    public int getUltimateParent(int node ) {
        if(node == parent.get(node)) return node;

        int ultParent = getUltimateParent(parent.get(node));
        parent.set(node, ultParent);

        return parent.get(node);

    }

    public void unionBySize(int u, int v) {
        int ulp_u = getUltimateParent(u); // UltimateParentOfU
        int ulp_v = getUltimateParent(v);
        
        if(ulp_u == ulp_v) return;
        else if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
        }
        else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }

}
