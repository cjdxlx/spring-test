package com.lixu;

public class Test4 {
	public static void main(String[] args) {

		Test4 test = new Test4();
		Node head = new Node();
        head.setData(-1);
        head.setNext(null);
        
        //定义指针
        Node p;
        
        p = head;
        
        //初始化链表数据[1~10]
        for(int i=1;i<=10;i++){
            Node q = new Node();
            q.setData(i);
            q.setNext(null);
            p.setNext(q);
            p = q;
        }
        
        //输出原始链表
        Node k = head.getNext();
        System.out.println(head.toString());
        while(k!=null) {
        	System.out.println(k.toString());
        	k = k.getNext();
        }
        
        
        head = test.reverseList(head);
        //输出逆序后的链表
        k = head.getNext();
        System.out.println(head.toString());
        while(k!=null) {
        	System.out.println(k.toString());
        	k = k.getNext();
        }
		
	}

	Node reverseList(Node head) {
		// 如果链表为空或只有一个元素直接返回
		if (head.getNext() == null || head.getNext().getNext() == null) {
			return head;
		}
		Node p = head.getNext();
		Node q = head.getNext().getNext();
		Node t = null;
		while (q != null) {
			t = q.getNext();
			q.setNext(p);
			p = q;
			q = t;
		}
		// 设置链表尾
		head.getNext().setNext(head);
		// 修改链表头
		head.setNext(null);
		return p;
	}

}
