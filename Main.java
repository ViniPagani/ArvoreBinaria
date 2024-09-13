public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        int[] valores = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 9, 5};
        for (int valor : valores) {
            arvore.insert(valor, arvore.raiz);
        }

        System.out.println("\nPre-Ordem:");
        arvore.preOrdem(arvore.raiz);

        System.out.println("\nIn-Ordem:");
        arvore.inOrdem(arvore.raiz);

        System.out.println("\nPos-Ordem");
        arvore.posOrdem(arvore.raiz);

    }
}