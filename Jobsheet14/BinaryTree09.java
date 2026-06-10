package Jobsheet14;

public class BinaryTree09 {
    Node09 root;

    public BinaryTree09() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa09 mahasiswa) {
        Node09 newNode = new Node09(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node09 current = root;
            while (true) {
                Node09 parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Tugas 1
    public void addRekursif(Mahasiswa09 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    private Node09 addRekursif(Node09 current, Mahasiswa09 mahasiswa) {
        if (current == null) {
            return new Node09(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node09 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node09 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // Tugas 2
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node09 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("\nMahasiswa dengan IPK Terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    // Tugas 2
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node09 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("\nMahasiswa dengan IPK Terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    // Tugas 3
    public void tampilMahasiswaIPKdiAtas(double batasIPK) {
        System.out.println("\nMahasiswa dengan IPK di atas " + batasIPK + ":");
        tampilMahasiswaIPKdiAtasRekursif(root, batasIPK);
    }
    private void tampilMahasiswaIPKdiAtasRekursif(Node09 node, double batasIPK) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRekursif(node.left, batasIPK);
            if (node.mahasiswa.ipk > batasIPK) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasRekursif(node.right, batasIPK);
        }
    }

    public Node09 getSuccessor(Node09 del) {
        Node09 successor = del.right;
        Node09 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node09 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();

                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }

    }
    
}