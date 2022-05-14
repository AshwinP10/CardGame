public class Card
{
  //fields
  private String suit;
  private String face;

  //constructor(s) - SPECIAL METHOD
  //DEFAULT CONSTRUCTOR - default values
  public Card()
  {
    suit = "Clubs";
    face = "Ace";
  }
  //overloaded constructor
  public Card(String face, String suit)
  {
    this.suit = suit;
    this.face = face;
  }

  //methods - what kind of methods should go into a card?

  //methods - getters/ACCESSOR
  public String getSuit()
  {
    return suit;
  }

  public String getFace()
  {
    return face;
  }

  //methods - setters/MODIFIERS

  public void setFace(String newFace)
  {
    face = newFace;
  }

  public void setSuit(String newSuit)
  {
    suit = newSuit;
  }

  public String toString()
  {
    return face + " of " + suit;
  }

}