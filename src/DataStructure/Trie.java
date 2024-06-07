package DataStructure;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        for (int i=0;i<26;i++) {
            children[i] = null;
        }
        isEndOfWord = false;
    }

}

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(node.children[index] == null) return false;
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(node.children[index] == null) return false;
            node = node.children[index];
        }
        return true;
    }





    public static void main(String[] args) {

    }
}
