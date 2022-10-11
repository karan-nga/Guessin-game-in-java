public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp))return true;
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }
}
