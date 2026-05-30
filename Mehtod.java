package Learn_java;

public class Mehtod
{
    public static void main(String[] args)
    {
     computer c = new computer();
     c.playmusic();
     String str = c.getmepen(1);
     System.out.println(str);
    }
}

class computer
{
  public void playmusic()
  {
      System.out.println("playing music");
  }

  public String getmepen(int cost)
  {
      if (cost >4)
      return "pen";
      else
          return "noting";
  }
}
