//leetcode problem number 2
public class AddTwoNumbers {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            String s1 = "";
            String s2 = "";
            while(l1.next!=null){
                s1+=l1.val;
                l1 = l1.next;
            }
            s1+=l1.val;
            while(l2.next!=null){
                s2+=l2.val;
                l2 = l2.next;
            }
            s2+=l2.val;
            StringBuffer sb1 = new StringBuffer(s1);
            StringBuffer sb2 = new StringBuffer(s2);
            s1 = sb1.reverse().toString();
            s2 = sb2.reverse().toString();
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int i3 = i1+i2;
            String s3 = Integer.toString(i3);
            StringBuffer sb3 = new StringBuffer(s3);
            s3 = sb3.reverse().toString();
            ListNode n = new ListNode(Integer.parseInt(String.valueOf(s3.charAt(0))));
            for(int i=1; i<s3.length(); i++){
                char c = s3.charAt(i);
                ListNode n0 = n;
                n = new ListNode(Integer.parseInt(String.valueOf(s3.charAt(i))), n0);
            }
            return n;
        }

        public static void main(String[] args) {
            ListNode node1a = new ListNode(2);
            ListNode node1b = new ListNode(4);
            ListNode node1c = new ListNode(3);
            node1a.next = node1b;
            node1b.next = node1c;
            ListNode node2a = new ListNode(5);
            ListNode node2b = new ListNode(6);
            ListNode node2c = new ListNode(4);
            node2a.next = node2b;
            node2b.next = node2c;
            ListNode retval = addTwoNumbers(node1a, node2a);
            while(retval.next!=null){
                System.out.println(retval.val);
                retval = retval.next;
            }
            System.out.println(retval.val);

        }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
