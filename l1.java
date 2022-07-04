public class l1
{
    public static void main(String[] args)
    {
        int real[] = new int[100];
        int img[] = new int[100];
        for(int i=0;i<100;i++)
            img[i] = real[i] = 0;

        boolean ok = true;
        for(int i=0;i<args.length && ok;i+=2)
        {
            int len = args[i].length(), j = 0;
            // trecem prin toate caracterele pana gasim un - sau un +
            while(j < len && args[i].charAt(j) != '+' && args[i].charAt(j) != '-')
            {
                if(!(args[i].charAt(j) >= '0' && args[i].charAt(j) <= '9'))
                {
                    ok = false;
                    break;
                }
                
                real[i] = real[i]*10 + (args[i].charAt(j) - '0');
                j++;
            }

            if(!ok)
                break;

            while(j < len && args[i].charAt(j) != '*')
            {
                if(!(args[i].charAt(j) >= '0' && args[i].charAt(j) <= '9'))
                {
                    ok = false;
                    break;
                }

                img[i] = img[i]*10 + (args[i].charAt(j) - '0');
                j++;
            }
        }


        for(int i=1;i<args.length && ok;i+=2)
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
        
        for(int i=0;i<=args.length/2;i++)
            System.out.println(real[i] + " " + img[i]);
    }

}