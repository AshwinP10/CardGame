import java.util.*;

public class Deck
{
  //fields
  private ArrayList <Card> myDeck;
  
  //constructor(s)
  public Deck()
  {
    myDeck = new ArrayList <Card>();
    setDeck();
  }

  //methods - what kind of methods should go into a deck?

  //methods - getters

  //methods - setters
  public void setDeck()
  {
    String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    String [] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    for(String suit: suits)
    {
      for(String face: faces)
      {
        myDeck.add(new Card(face, suit));
      }
    }
  }

  //tostring?
  public String toString()
  {
    String thisDeck = "";

    for(Card aCard: myDeck)
    {
      thisDeck += aCard.toString() + "\n";
    }

    return thisDeck;
  }
}