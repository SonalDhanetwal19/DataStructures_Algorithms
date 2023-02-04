package Trie;

import java.util.HashMap;


public class TrieNode {

    private final HashMap<Character, TrieNode> children = new HashMap<>();
    private boolean endOfWord;

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    boolean isEndOfWord()
    {
        return endOfWord;
    }

    void setEndOfWord(Boolean endOfWord)
    {
        endOfWord = this.endOfWord;
    }
}
