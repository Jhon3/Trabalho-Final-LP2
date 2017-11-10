
import java.util.Collection;
public class DigitalTree<Value> {

   private static int R = 256; // base: tamanho do alfabeto
   private Node root;          // raiz da trie

   private static class Node // veja acima
   {
	   private Object val;
	   private Node[] next = new Node[R]; 
   }

   public Value get(String key) 
   {
	   Node x = get(root, key, 0);
	   if (x == null) return null;
	   return (Value) x.val;
	}

	private Node get(Node x, String key, int d) 
	{ 
		if (x == null) return null;
		if (d == key.length()) return x;
		char c = key.charAt(d);
		return get(x.next[c], key, d+1);
	}
   

	public void put(String key, Value val) 
	{ 
	      root = put(root, key, val, 0); 
	}

	private Node put(Node x, String key, Value val, int d)
	{ 
		if (x == null) x = new Node();
		if (d == key.length())
		{ 
			x.val = val; 
		    return x; 
		}
		char c = key.charAt(d);
		x.next[c] = put(x.next[c], key, val, d+1);
		return x;
	}

	public void delete(String k) 
	{ 
		root = delete(root, k, 0); 
	}
	   
	private Node delete(Node x, String k, int d) 
	{
		if (x == null) return null;
		if (d == k.length())
			x.val = null;
		else {
		     	char c = k.charAt(d);
		        x.next[c] = delete(x.next[c], k, d+1);
		     }
		if (x.val != null) return x;
		for (char c = 0; c < R; c++)
		if (x.next[c] != null) return x;
			return null;
	}  
	
}