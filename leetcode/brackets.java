package leetcode;
import java.util.Stack;
public class brackets {
	public static void main(String[] args) {
//		char b=' ';
//		String str="";
//		int a=10;
//		if(a<15) {
//			System.out.println("hello");
//		}
//		if(a<20) {
//			System.out.println("world");
//		}
		
 System.out.print(isValid("()"));
	}
	 public static boolean isValid(String s) {
	        Stack<Character> stack=new Stack <>();
	        char a=' ';
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
	                stack.push(s.charAt(i));
	            }
	            if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')') {
	             if(s.charAt(i)==')'){
	                a=')';          
	            }
	             if(s.charAt(i)==']'){
	                a=']';
	            }
	             if(s.charAt(i)=='}'){
	                a='}';
	            }
	            
	        
	         if(!stack.isEmpty()&&stack.peek()==a){
	                stack.pop();
	            }
	            }
	        }
	        return stack.isEmpty(); 
	    }
}
