package Trie;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class TrieOperations {

    TrieNode root;
    TrieOperations ()
    {
        root = new TrieNode();
    }
    void insert (String word)
    {
        TrieNode current = root;
        for(char c : word.toCharArray())
        {
            current.getChildren().computeIfAbsent(c,key ->new TrieNode());
        }
        current.setEndOfWord(true);
    }

    boolean containsWord(String word)
    {
        TrieNode current = root;
        for(int i = 0; i<= word.length();i++) {
            char ch = word.charAt(i);
            TrieNode node = current.getChildren().get(ch);
            if (node == null) return false;
            current = node;
        }
        return current.isEndOfWord();
    }

    boolean startsWith(String word)
    {
        TrieNode current = root;
        for(int i = 0; i< word.length(); i++)
        {
            char ch = word.charAt(i);
            TrieNode node = current.getChildren().get(ch);
            if(node == null) return false;
            current = node;
        }
        return true;
    }
}


