import java.util.*;

public class Player{

  private String name;
  private ArrayList <Card> hand;

  public Player()
  {
    name = "Player";
    hand = new ArrayList <Card>();
  }

  public Player (String name)
  {
    this.name = name;
    hand = new ArrayList <Card>();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String newName)
  {
    name = newName;
  }
}