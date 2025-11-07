package facul;

// Passo 1: Definição da classe Node
class Node {
    int raiz;
    Node left;
    Node right;

    public Node(int data) {
        this.raiz = data;
        this.left = null;
        this.right = null;
    }
}

// Passo 2: Definição da classe BinaryTree
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Metodo para inserir um nó na árvore
    // (Esta é uma implementação simples e não balanceada)
    public void insert(int data) {
        this.root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.raiz) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.raiz) {
            current.right = insertRecursive(current.right, data);
        }
        return current;
    }

    // Passo 3: Métodos de Travessia (Percorrer a árvore)

    // Travessia In-order (Esquerda -> Raiz -> Direita)
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.raiz + " ");
            traverseInOrder(node.right);
        }
    }

    // Travessia Pre-order (Raiz -> Esquerda -> Direita)
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.raiz + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Travessia Post-order (Esquerda -> Direita -> Raiz)
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.raiz + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construindo a árvore:
        //      50
        //     /  \
        //   30    70
        //  / \    / \
        // 20 40  60 80
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Travessia In-order (Esquerda -> Raiz -> Direita):");
        tree.traverseInOrder(tree.root);
        System.out.println("\n(Note que os valores saem em ordem crescente!)");

        System.out.println("\n\nTravessia Pre-order (Raiz -> Esquerda -> Direita):");
        tree.traversePreOrder(tree.root);

        System.out.println("\n\nTravessia Post-order (Esquerda -> Direita -> Raiz):");
        tree.traversePostOrder(tree.root);
    }
}