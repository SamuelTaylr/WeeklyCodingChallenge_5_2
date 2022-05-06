object circularLinkedList extends App{

  class LinkNode(var data: Int, var next: LinkNode)

  class CircularLinkedList(var head: LinkNode) {

    // Constructor
    def this()
      {
        this(null)
      }

    // Inserts node at the end of the linked list

    def insert(value: Int) = {
      var node: LinkNode = new LinkNode(value, this.head)

      if(this.head == null) {
        this.head = node
        node.next = this.head
      }
      else
        {
          var temp: LinkNode = this.head
          // gets last node
          while(temp.next != this.head)
            {
              // visits next node
              temp = temp.next
            }
            // puts new node at the end
          temp.next = node
        }
    }

    def countNode(): Int = {
      if(this.head == null)
        {
          return 0
        }
        // starts at second node
      var temp: LinkNode = this.head.next

      // counts linked nodes
      var count = 1

      while(temp != this.head)
        {
          count += 1
          temp = temp.next
        }
        return count
    }
  }

  var circularLinked = new CircularLinkedList()

  // inserting values into empty linked list
  circularLinked.insert(1)
  circularLinked.insert(3)
  circularLinked.insert(5)
  circularLinked.insert(7)
  circularLinked.insert(9)
  circularLinked.insert(11)
  circularLinked.insert(13)

  // display results
  println(circularLinked.countNode())

}
