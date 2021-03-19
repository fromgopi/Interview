package oops.filesystems;

import java.time.LocalDateTime;

public abstract class Node implements Comparable<Node>{

    private Directory root;
    private String name;
    private LocalDateTime created;
    private LocalDateTime lastUpdated;
    private LocalDateTime lastAccessed;

    public Node(String path) {
        this.name = path;
        this.created = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
        this.lastAccessed = LocalDateTime.now();
    }

    public boolean isDirectory() {

        return this instanceof Directory;
    }

    public String getPath() {

        return root != null ? root.getPath() + "/" + name : name;
    }

    public Node getParent() {
        return root;
    }

    public abstract long getLength();

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Node o) {

        return this.getName().compareTo(o.getName());
    }

    public void setRoot(Directory root) {
        this.root = root;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public LocalDateTime getLastAccessed() {
        return lastAccessed;
    }

    @Override
    public String toString() {
        return "root=" + root +
                ", \nname='" + name + '\'' +
                ", \ncreated=" + created +
                ", \nlastUpdated=" + lastUpdated +
                ", \nlastAccessed=" + lastAccessed;

    }
    
}
