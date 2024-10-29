class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s2 = s + s;
        // Enlever le premier et le dernier caractère de s2
        String modified = s2.substring(1, s2.length() - 1);
        // Vérifier si s existe dans la chaîne modifiée
        return modified.contains(s);
    }
}
