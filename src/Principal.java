
public class Principal {
	public static void main(String[] args) {

		BinarySearchTree arvoreBinariaTeste = new BinarySearchTree(4);
		
		arvoreBinariaTeste.insert(3);		
		arvoreBinariaTeste.insert(2);
		arvoreBinariaTeste.insert(14);
		arvoreBinariaTeste.insert(18);
		arvoreBinariaTeste.insert(9);
		arvoreBinariaTeste.insert(19);
		arvoreBinariaTeste.insert(15);
		arvoreBinariaTeste.insert(11);
		
		System.out.println("Grau da Raiz: " +  arvoreBinariaTeste.getRoot().length());
		System.out.print("Pr� ordem: ");
		arvoreBinariaTeste.preOrderPrint();
		System.out.println("");
		System.out.print("Em ordem: ");
		arvoreBinariaTeste.inOrderPrint();
		System.out.println("");
		System.out.print("P�s ordem: ");
		arvoreBinariaTeste.postOrderPrint();
		System.out.println("");
		System.out.print("� estritamente bin�ria: ");
		System.out.print(arvoreBinariaTeste.isStrictBinaryTree());
		System.out.println("");
		System.out.print("Quantidade de n�s: ");
		System.out.println(arvoreBinariaTeste.findNodeAmount());

		System.out.print("Quantidade m�xima de n�veis (profundidade): ");
		System.out.println(arvoreBinariaTeste.findDepth());

		//System.out.println(arvoreBinariaTeste.getSuccessor(18));

		System.out.println(arvoreBinariaTeste.delete(19));
		System.out.print("Quantidade de n�s: ");
		System.out.println(arvoreBinariaTeste.findNodeAmount());

		System.out.print("Em ordem: ");
		arvoreBinariaTeste.inOrderPrint();	
		
		System.out.println();
		System.out.println("Raiz: " + arvoreBinariaTeste.getRoot().getValue());
		
		
	}

}
