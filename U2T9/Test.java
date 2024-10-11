package U2T9;
public class Test
{
    public static void main(String[] args) 
    {
       
      // LuckyNumbers lottery = new LuckyNumbers();
      // String luckyNums = lottery.getLuckyNumbers();
      // System.out.println(luckyNums);
      
      // Circle c1 = new Circle(5.0);
      // System.out.println(c1.getInfo());
      // c1.setRadius(9.2);
      // System.out.println(c1.getInfo());

      // RightTriangle r1 = new RightTriangle(3, 4);
      // RightTriangle r2 = new RightTriangle(6.5, 10.7);
      // double r1Hypotenuse = r1.hypotenuse();
      // double r2Hypotenuse = r2.hypotenuse();
      // System.out.println(r1Hypotenuse);
      // System.out.println(r2Hypotenuse);

      CoinFlip cf1 = new CoinFlip();
      System.out.println(cf1.Simulate(50));
      System.out.println(cf1.Simulate(100));
      System.out.println(cf1.Simulate(200));
      System.out.println(cf1.Simulate(1000));
      System.out.println(cf1.Simulate(5000));
      System.out.println(cf1.Simulate(10000));

    }
}