import java.io.PrintStream;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * @author  Mholi Mncube
 * mncmho001
 * @version  02/03/2016
 * Class that prints BST 
 */

public class SimpleTreeWriterImpl implements SimpleTreeWriter{
	private int level, height;
	private PrintStream outPut;
	private BinaryTreeNode rt;
	private String str;
	
	public SimpleTreeWriterImpl(PrintStream out) {
        outPut = out; 
    }

	@Override
	public void setDestination(PrintStream stream) {		
	}

	@Override
	public void write(BinaryTreeNode tree) {
		outPutTree(tree, tree.getHeight());
	}
	
	public void outPutTree(BinaryTreeNode root, int h){
		level = 0;
		this.height = h;
		this.rt = root;
		List<BinaryTreeNode> nextLevel = new ArrayList<BinaryTreeNode>();
		List<BinaryTreeNode> levelZero = new ArrayList<BinaryTreeNode>();
		levelZero.add(rt);		
		
		while(level<height){
            Iterator<BinaryTreeNode> iter = levelZero.iterator();
            while(iter.hasNext()){ BinaryTreeNode rt = iter.next();
            	if (rt.getItem() == null){nextLevel.add(BinaryTreeNode.EMPTY_NODE); }
            	else
            		if (rt.getRight()!=null){ nextLevel.add(rt.getRight()); }
            		else if (rt.getRight()==null){ nextLevel.add(BinaryTreeNode.EMPTY_NODE); }
					if (rt.getLeft()!=null){ nextLevel.add(rt.getLeft()); }
					else if (rt.getLeft()==null){ nextLevel.add(BinaryTreeNode.EMPTY_NODE); }
					
					
				}level++;
			}System.out(nextLevel.get))
		
	}

}
