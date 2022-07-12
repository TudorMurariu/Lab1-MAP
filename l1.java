public class l1
{
    public static void main(String[] args)
    {
        int real[] = new int[100];
        int img[] = new int[100];
        for(int i=0;i<100;i++)
            img[i] = real[i] = 0;

        boolean ok = true;
        for(int i=0;i < args.length && ok;i+=2)
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
                
                real[i/2] = real[i/2]*10 + (args[i].charAt(j) - '0');
                j++;
            }

            if(args[i].charAt(j) == '+')
                j++;

            if(!ok)
                break;

            while(j < len && args[i].charAt(j) != '*')
            {
                if(!(args[i].charAt(j) >= '0' && args[i].charAt(j) <= '9'))
                {
                    ok = false;
                    break;
                }

                img[i/2] = img[i/2]*10 + (args[i].charAt(j) - '0');
                j++;
            }

        }
        
        for(int i=1;i<args.length && ok;i+=2)
            if(!args[i].equals("+") && !args[i].equals("-") && !args[i].equals("*") && !args[i].equals("/"))
                {
                    ok = false;
                    System.out.println(args[i] + i);
                    break;
                }
        
        System.out.println(args[0] + args[1] + args[2]);
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

class NumarComplex
{
    public double re;
    public double img;

    NumarComplex(double re,double img)
    {
        this.re = re;
        this.img = img;
    }

    public void adunare(NumarComplex ot)
    {
        this.re += ot.re;
        this.img += ot.img;
    }

    public void scadere(NumarComplex ot)
    {
        this.re -= ot.re;
        this.img -= ot.img;
    }

    public void inmultire(NumarComplex ot)
    {
        this.re = this.re*ot.re - this.img*ot.img;
        this.img = this.re*ot.img + this.img*ot.re;
    }

    public void impartire(NumarComplex ot)
    {
        // ?????????????? how
    }

    public void conjugat()
    {
        this.img = -this.img;
    }
}

abstract class ComplexExpression
{

}