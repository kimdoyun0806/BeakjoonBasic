package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree_num_1991 {

    public static String[][] tree;
    public static StringBuilder sb_preorder = new StringBuilder();
    public static StringBuilder sb_inorder = new StringBuilder();
    public static StringBuilder sb_postorder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Node = st.nextToken().charAt(0) - 'A';
            String leftNode = st.nextToken();
            String rightNode = st.nextToken();

            tree[Node][0] = leftNode;
            tree[Node][1] = rightNode;
        }
        preorder(0);
        inorder(0);
        postorder(0);

        System.out.println(sb_preorder);
        System.out.println(sb_inorder);
        System.out.println(sb_postorder);
    }

    public static void preorder(int x) {
        if (x == -1) return;
        sb_preorder.append((char) (x + 'A'));
        if (!tree[x][0].equals("."))
            preorder(tree[x][0].charAt(0) - 'A');
        if(!tree[x][1].equals("."))
            preorder(tree[x][1].charAt(0) - 'A');
    }

    public static void inorder(int x) {
        if (x == -1) return;
        if (!tree[x][0].equals("."))
            inorder(tree[x][0].charAt(0) - 'A');
        sb_inorder.append((char) (x + 'A'));
        if(!tree[x][1].equals("."))
            inorder(tree[x][1].charAt(0) - 'A');
    }

    public static void postorder(int x) {
        if (x == -1) return;
        if (!tree[x][0].equals("."))
            postorder(tree[x][0].charAt(0) - 'A');
        if(!tree[x][1].equals("."))
            postorder(tree[x][1].charAt(0) - 'A');
        sb_postorder.append((char) (x + 'A'));
    }

}