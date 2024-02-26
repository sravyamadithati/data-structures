
class Node{
    constructor(data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList {
    constructor(head=null){
        this.head=head
    }
    appendNode(newNode){
        let node=this.head;
        if(node===null){
            this.head=newNode;
            return;
        }
        while(node.next){
            node=node.next;
        }
        node.next=newNode;
    }
    printList(){
        let node=this.head;
        while(node){
            console.log(node.data+'->');
            node=node.next;
        }
    }
}
let list=new LinkedList();
list.appendNode(new Node(1));
list.appendNode(new Node(2));
list.appendNode(new Node(5));
list.printList();
