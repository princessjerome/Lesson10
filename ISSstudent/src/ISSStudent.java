
public class ISSStudent implements Comparable{
    private String name;
    private String address;
    private int id;
    
    public ISSStudent (String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public int getID(){
        return id;
    }
    public String toString(){
        String str;
        str = "Name:\t" + name + "\nAddress:\t" + address + "\nID:\t" + id;
        return str;
       
    }
    
    public int compareTo(Object o){
        int difference = id- ((ISSStudent)o).getID();
        return difference;
    }
}
