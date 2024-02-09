package BinaryTree;
import java.util.ArrayList;

public class LCAncestor {

	ArrayList<Integer> path1=new ArrayList<>();
	ArrayList<Integer> path2=new ArrayList<>();
														 
	public int ancestor(Node root, int n1, int n2) 
	{											   
		findPath(root,n1,path1);	
		findPath(root,n2,path2);
		System.out.println("Path of "+n1+ ":" + path1);
		System.out.println("Path of "+n2+ ":" + path2);
		int i;
		
		for(i=0;i<path1.size()  && i<path2.size(); i++)
		{
			if(!path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i-1);
	}
						
	private boolean findPath(Node root, int n1, ArrayList<Integer> path) {
		if(root==null)
			return false;
		
		path.add(root.data);
		
		if(root.data== n1)
			return true;
		
		if(root.left!=null && findPath(root.left,n1,path))
			return true;
			
		if(root.right!=null && findPath(root.right,n1,path))
			return true;
		
		path.remove(path.size()-1);
		return false;
		
	}

}
