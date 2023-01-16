import java.util.Arrays;

public class Daily_148{
     class ListNode{
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) {
               this.val = val; 
          }
          ListNode(int val, ListNode next) { 
               this.val = val; this.next = next; 
          }
     }


     public static ListNode sortList(ListNode head){
          // for(ListNode i = head; i != null; i = i.next){
          //      for(ListNode j = i.next; j != null; j = j.next){
          //           if(j.val < i.val){
          //                int tmp = j.val;
          //                j.val = i.val;
          //                i.val = tmp;
          //           }
          //      }
          // } //TLE: Runtime Errror

          ListNode tmp = head;
          int cnt = 0;
          while(tmp != null){
               cnt++;
               tmp = tmp.next;
          }

          int[] a = new int[cnt];
          cnt = 0;
          tmp = head;

          while(tmp != null){
               a[cnt] = tmp.val;
               cnt++;
               tmp = tmp.next;
          }

          cnt = 0;
          tmp = head;
          Arrays.sort(a);

          while(tmp != null){
               tmp.val = a[cnt];
               cnt++;
               tmp = tmp.next;
          }

          return head;
     }
}
