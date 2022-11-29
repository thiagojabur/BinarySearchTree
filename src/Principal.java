
public class Principal {
	public static void main(String[] args) {

		
		BinarySearchTree arvoreBinariaTeste = new BinarySearchTree(4);
		arvoreBinariaTeste.insert(3);
		arvoreBinariaTeste.insert(1);
		arvoreBinariaTeste.insert(2);
		arvoreBinariaTeste.insert(3);
		arvoreBinariaTeste.insert(10);
		arvoreBinariaTeste.insert(5);
		
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
		System.out.println("� estritamente bin�ria: ");
		System.out.print(arvoreBinariaTeste.isStrictBinaryTree());
		System.out.println("");
		System.out.println("Quantidade de n�s: ");
		System.out.println(arvoreBinariaTeste.findNodeAmount());

		System.out.println("Quantidade m�xima de n�veis (profundidade): ");
		System.out.println(arvoreBinariaTeste.findDepth());
	
	}

}
