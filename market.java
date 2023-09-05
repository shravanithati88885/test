import java.util.*;
public class collection
{	public static void arr(String s,int l[]){
    HashMap<Character,Integer> m=new HashMap<>();
    HashSet<Character> h=new HashSet<>();
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<s.length();i++)
    h.add(s.charAt(i));
     Character arr[] = new Character[h.size()];
        h.toArray(arr);
    int n=0;
    int k=0;
        	char[] sl = s.toCharArray();
      for (char c : sl){
         if (m.containsKey(c)){
            m.put(c, m.get(c) + 1);
         }else{
            m.put(c, 1);
         }
      }
      int sum=0;
      for (Map.Entry entry : m.entrySet()){
          k=(int)entry.getValue();
          a.add(k);}
          for(int i=0;i<arr.length;i++){
          for( int j=0;j<26;j++){
        if(arr[i]==(char)(65+j)){
            n+=((a.get(i)/3)*2+a.get(i)%3)*l[j];
        }
              
      } } 
System.out.print(n);}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int l[]=new int[26];
	for(int i=0;i<26;i++)
	l[i]=sc.nextInt();



   
	arr(s,l);
	}
}