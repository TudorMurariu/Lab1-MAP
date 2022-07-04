public class l1
{
    public static void main(String[] args)
    {
        boolean ok = true;
        for(int i=0;i<args.length;i+=2)
        {
            
        }


        for(int i=1;i<args.length;i+=2)
            if(args[i] != "+" && args[i] != "-" && args[i] != "*" && args[i] != "/")
                {
                    ok = false;
                    break;
                }
        
        if(!ok)
        {
            System.out.println("Stringul oferit la tastatura nu este o operatie aritmetica!!!");
            return;
        }
        // else    
        
    }

}