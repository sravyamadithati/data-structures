
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
    insertAtBegining(newNode){
        let node=this.head;
        if(node===null){
            this.head=newNode;
        }
        else{
            newNode.next=this.head;
            this.head=newNode;
        }
    }
    insertAt(position,newNode){
        let node=this.head;
        if(position===0){
            newNode.next=node;
            this.head=newNode;
            return;
        }
        while(--position){
            if(node.next!=null){
                node=node.next;
            }
            else{
                throw Error("Index Out of Bound");
            }
        }
        let temp=node.next;
        node.next=newNode;
        newNode.next=temp;
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

list.insertAt(2,new Node(15));
list.printList();
