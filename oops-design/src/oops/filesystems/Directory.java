package oops.filesystems;

import java.util.Set;
import java.util.TreeSet;

public class Directory extends Node{

    private Set<Node> nodes;

    public Directory(String path) {
        super(path);
        nodes = new TreeSet<>();
    }

    public void add(Node node) {
        node.setRoot(this);
        nodes.add(node);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    @Override
    public long getLength() {
        long length = 0;
        for (Node node : nodes) {
            length += node.getLength();
        }
        return length;
    }

    public void printTree() {
        int indent = 0;
        StringBuilder sb = new StringBuilder();
        printDirectoryTree(this, indent, sb);
        System.out.println(sb.toString());
    }

    private void printDirectoryTree(Node node, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(node.getName());
        sb.append("/");
        sb.append("\n");

        if (node.isDirectory()) {
            Directory directory = (Directory) node;
            for (Node file : directory.getNodes()) {
                printDirectoryTree(file, indent + 1, sb);
            }
        }
    }

    private static String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        return sb.toString();
    }
    
}
