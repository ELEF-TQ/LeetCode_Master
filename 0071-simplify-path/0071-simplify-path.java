import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        // Split the path by "/"
        String[] components = path.split("/");

        Stack<String> stack = new Stack<>();

        for (String component : components) {
            // Ignore "." or empty components
            if (component.equals("") || component.equals(".")) {
                continue;
            }
            // Go up one directory for ".." by popping the stack if it's not empty
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            // Otherwise, add the valid directory name to the stack
            else {
                stack.push(component);
            }
        }

        // Build the simplified path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        // If the stack is empty, return "/", otherwise return the constructed path
        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
}
