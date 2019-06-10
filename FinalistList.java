class FinalistList{
  Node head;
  int numberNodes;

  FinalistList(){
		this.head = null;
		this.numberNodes = 0;
	}

  public void add(Node newNode){
		if(this.head != null){
			newNode.next = this.head;
			this.head = newNode;
		} else{
			this.head = newNode;
		}
    this.numberNodes++;
	}

  public Node del(){
    if(this.head != null){
      Node retNode = this.head;
      this.head = this.head.next;
      this.numberNodes--;
      return retNode;
    }
    return null;
  }

}
