
public class Principal {
	public static void main(String[] args) {

		
		BinarySearchTree arvoreBinariaTeste = new BinarySearchTree(4);
		arvoreBinariaTeste.insert(3);
		arvoreBinariaTeste.insert(1);
		arvoreBinariaTeste.insert(14);
		arvoreBinariaTeste.insert(3);
		arvoreBinariaTeste.insert(10);
		arvoreBinariaTeste.insert(18);
		arvoreBinariaTeste.insert(11);
		
		System.out.println("Grau da Raiz: " +  arvoreBinariaTeste.getRoot().length());
		System.out.print("Pré ordem: ");
		arvoreBinariaTeste.preOrderPrint();
		System.out.println("");
		System.out.print("Em ordem: ");
		arvoreBinariaTeste.inOrderPrint();
		System.out.println("");
		System.out.print("Pós ordem: ");
		arvoreBinariaTeste.postOrderPrint();
		System.out.println("");
		System.out.println("É estritamente binária: ");
		System.out.print(arvoreBinariaTeste.isStrictBinaryTree());
		System.out.println("");
		System.out.println("Quantidade de nós: ");
		System.out.println(arvoreBinariaTeste.findNodeAmount());

		System.out.println("Quantidade máxima de níveis (profundidade): ");
		System.out.println(arvoreBinariaTeste.findDepth());
		int buscado = 8;
		System.out.println("Buscou o " + buscado + ": " + 
		  arvoreBinariaTeste.search(buscado));
		
		
	}

}
