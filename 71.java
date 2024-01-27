import java.util.Stack;

class Solution {
    public static String simplifyPath(String path) {
        String output = "";
        Stack stack = new Stack();
        
        String[] list = path.split("/");
        int count = 0;
        // System.out.println(list.length);
        for (String thing : list) {
            System.out.print(thing + " ");
            System.out.println();
        }
        // System.out.println("__________");
        while (count < list.length) {
            System.out.println(count);
            System.out.println(list[count]);
            String layer = list[count];
            if (layer.equals(".") || layer.equals("")) {
                count++;
                continue;
            } else if (layer.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            }else {
                stack.push(layer);
            }
            count++;
        }
        int stackSize = stack.size();
        if (stackSize == 0) {
            return "/";
        }
        for (int i = 0; i < stackSize; i++) {
            String temp = (String)stack.pop();
            if (!temp.equals("")) {
                // System.out.println("this layer of stack = " + temp);
                output = "/" + temp + output;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String path = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(path));
    }
}