/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author makst
 */
public class LinkedList {
    
    private LinkedList head;
    private LinkedList next;
    private Object info;
    
    private LinkedList(){
        
    }
    
    public static LinkedList createList(){
       
        LinkedList head = new LinkedList();
        
        head.head=head;
        
        return head;
        
    }
    
    public LinkedList getLast(){
        
        LinkedList list = head;
        while(true){
            
            if(list.next==null){
                return list;
            }else {
                list=list.next;
            }
        }
        
    }
    
    public void Add(Object info){
        
        LinkedList last = getLast();
        last.info=info;
        last.next=new LinkedList();
        last.head=head;
        
        
    }
    
    public void seeList(){
        
        LinkedList list = head;
        
        while(true){
            
            if(list.next==null){
                return;
            }else{
                System.out.println(list.info);
                list=list.next;
            }
            
        }
    }
    
    public static void main(String[] args) {
        
        LinkedList list = LinkedList.createList();
        list.Add(123);
        list.Add(5.23434);
        list.Add("Hello Java");
        list.Add("sss");
        
        list.seeList();
    }
   
    
}
