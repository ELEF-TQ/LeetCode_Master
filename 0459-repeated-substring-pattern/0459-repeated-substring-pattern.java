class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s2 = s + s;
        /* remove first and last caracter*/
        String modified = s2.substring(1, s2.length() - 1);
        return modified.contains(s);
    }
}




// class Solution {
//     public boolean repeatedSubstringPattern(String s) {
//         int n = s.length();
//         for (int i = 1; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 String sub = s.substring(0, i);
//                 StringBuilder sb = new StringBuilder();
//                 for (int j = 0; j < n / i; j++) {
//                     sb.append(sub);
//                 }
//                 if (sb.toString().equals(s)) {
//                     return true;
//                 }
//             }
//         }
//         return false; 
//     }
// }
