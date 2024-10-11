package U2T9;

public class CoinFlip 
{
    
    public CoinFlip(){}

    public String Flip()
    {
        int x = (int) (Math.random() * 2) + 1;
        if (x == 1)
        {
            return "heads";
        }
        if (x == 2)
        {
            return "tails";
        }
        return "";
    }

    public double Simulate(int numberofFlips)
    {
        int x = 0;
        String z = "";
        for (int i = 0; i < numberofFlips; i++) 
        {
            z = Flip();
            if (z.equals("heads"))
            {
                x ++;
            }
        }
        return (((double)x/numberofFlips) * 100);
    }

}
