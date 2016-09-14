package me.maweiyi;

/**
 * Created by maweiyi on 9/14/16.
 */
public class NodeData {
    private int id;
    private String data;

    public NodeData(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
