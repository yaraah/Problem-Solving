
public class ZooSolution{

     public static void main(String []args){
         boolean s=Zoos("zzoooo");
        System.out.println(s);
     }
       public static boolean Zoos(String word)
    {
        int Zcount=0;
        int Ocount=0;
        int ErrorCount=0;
        if(word.length()<20){
        for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
       if(ch=='z'||ch=='o'){
        if(ch=='z')
            Zcount++;
        else if(ch=='o')
            Ocount++;
        }else
        { ErrorCount++;}
        }    
        if(2*Zcount==Ocount&&Zcount!=0&&Ocount!=0&&ErrorCount==0)
           return true;
        }
        return false;
    } 
}
