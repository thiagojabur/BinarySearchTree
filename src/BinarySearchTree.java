public class BinarySearchTree {
	Node root;

	public BinarySearchTree(int value) {
		root = new Node(value);
	}
	
	//chamada
	public void insert(int value) {
		insert(value, root);
	}
	
	//para ser recursivo
	private void insert(int value, Node root) {
		//tem que ter uma condição de parada
		//chegar na folha 
		//criando um novo nó
		
		if (root.getValue() == value) return;
		
		if (root.getNodeLeft() == null 
				&& root.getValue() > value) {		
			Node newNode = new Node(value);
			root.setNodeLeft(newNode);
			return;
	    }	
		else 
		if (root.getNodeRight() == null 
				&& root.getValue() < value) {
			Node newNode = new Node(value);
			root.setNodeRight(newNode);
			return;
	    }
		
		//chamar a função ela mesma com parametros diferentes
		if (value < root.getValue()) 
			insert(value, root.getNodeLeft());
		else 
			insert(value, root.getNodeRight());
		
	}

	public Node getRoot() {
		return root;
	}

	public boolean isStrictBinaryTree() {
		return isStrictBinaryTree(root);
	}
	private boolean isStrictBinaryTree(Node v) {
		if (v == null) //condição de saida, percorreu a arvore toda e não achou filho único
			return true;
		
		//se achou filho único, ou seja, só um lado é null 
		if ((v.getNodeLeft()== null && v.getNodeRight() != null) 
			||
			(v.getNodeLeft() != null && v.getNodeRight() == null)) {
		    return false;
		}
		
		return isStrictBinaryTree(v.getNodeLeft()) &&
			   isStrictBinaryTree(v.getNodeRight());
	
	}
	
	public int findNodeAmount() {
		return findNodeAmount(root); 
	}
	
	//we need a method to find the amount of nodes in the tree
	private int findNodeAmount (Node tree) {
	    if (tree == null) {
	        return 0;
	    } else 
	        return (findNodeAmount(tree.getNodeRight())
	        		+ findNodeAmount(tree.getNodeLeft()) + 1);
	}

	public int findDepth () {
		return findDepth(root); 
	}
	//we'll need a method to find the amount of depths in the tree
	public int findDepth (Node tree) {
	    if (tree == null) {
	        return 0;
	    } else 
	    	return Math.max(findDepth(tree.getNodeLeft()), 
	    			findDepth(tree.getNodeRight()))+1;
	    
	}
	
	void preOrderPrint() {
		preOrderPrint(root);
	}
	
	private void preOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//raiz primeiro
		System.out.print(v.getValue() + " ");
		//subarvore esquerda
		preOrderPrint(v.getNodeLeft());		
		//subarvore direita
		preOrderPrint(v.getNodeRight());
	}

	void inOrderPrint() {
		inOrderPrint(root);
	}
	
	private void inOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//subarvore esquerda
		inOrderPrint(v.getNodeLeft());		
		//raiz no meio
		System.out.print(v.getValue() + " ");
		//subarvore direita
		inOrderPrint(v.getNodeRight());
	}
	
	void postOrderPrint() {
		postOrderPrint(root);
	}
	
	private void postOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//subarvore esquerda
		postOrderPrint(v.getNodeLeft());		
		//subarvore direita
		postOrderPrint(v.getNodeRight());
		//raiz por último 
		System.out.print(v.getValue() + " ");
	}
	
	
}
