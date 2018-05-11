package com.lixu;

public class Node {
	private Integer data;//节点数据域
    private Node next;//节点指针域
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
    	if(next != null) {
    		
    		return data+"->"+next.getData();
    	}else {
    		return data+"->null";
    	}
    }
}
