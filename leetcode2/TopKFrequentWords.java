/* 
Given a non-empty list of words, return the k most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

Example 1:
Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
Output: ["i", "love"]

Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.

Example 2:
Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
Output: ["the", "is", "sunny", "day"]

Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.

Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Input words contain only lowercase letters.
Follow up:
Try to solve it in O(n log k) time and O(n) extra space.

*/

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class TopKFrequentWords {


    public static List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();

        // record word frequencies
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Initialize priority queue, define comparitor behaviour.
        // if the frequency of the words are the same, prioritize the word that occurs earlier alphabetically
        // (positive value if it's word 1, negative value if it's word 2)
        // otherwise, prioritize the word with a smaller frequency.
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override 
            public int compare(String word1, String word2) {
                int freq1 = map.get(word1);
                int freq2 = map.get(word2);
                if(freq1 == freq2) return word2.compareTo(word1);
                return freq1 - freq2;
            }
        });

        // use the priority queue, keeping its size less than k.
        for(String key : map.keySet()){
            pq.add(key); 
            if(pq.size() > k) pq.poll();
        }

        // make list from priority queue strings, reverse them
        List<String> list = new ArrayList<>();
        while(!pq.isEmpty()) list.add(pq.poll());
    
        Collections.reverse(list);
        return list;
    }


    public static void main(String[] args){
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> ans = topKFrequent(words, k);
        System.out.println(ans);
    }

}