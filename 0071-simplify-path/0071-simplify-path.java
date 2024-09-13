import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
    
        String[] components = path.split("/");

        Stack<String> stack = new Stack<>();

        for (String component : components) {
          
            if (component.equals("") || component.equals(".")) {
                continue;
            }
            // Go up one directory for ".." 
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            //add the valid directory name to the stack
            else {
                stack.push(component);
            }
        }

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
}
