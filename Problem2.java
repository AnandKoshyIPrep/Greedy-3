// TIme COmplexity: O(N)
// Space COmplexity: O(N)
// Passed Leetcode

class Solution {
    public List<Integer> partitionLabels(String S) {
        
        int[] words = new int[26];
        
        for (int i = 0; i < S.length(); i++) {
            
            words[S.charAt(i) - 'a'] = i;
        }
        
        List<Integer> result = new ArrayList<>();
        
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            
            end = Math.max(end, words[S.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
            
        }
        return result;
        
    }
}