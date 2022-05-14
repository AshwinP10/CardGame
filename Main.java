class Main {
  public static void main(String[] args) {

    //TESTING THAT CARDS CAN BE CONSTRUCTED
    Card first = new Card();
    System.out.print(first.getFace());
    System.out.println(first.getSuit());

    Card second = new Card();
    second.setFace("Ten");
    second.setSuit("Diamonds");
    System.out.print(second.getFace());
    System.out.println(second.getSuit());

    Card third = new Card("Seven", "Clubs");
    System.out.print(third.getFace());
    System.out.println(third.getSuit());

    Card fourth = new Card("Jack", "Spades");
    System.out.println(fourth);

    Deck allTheCards = new Deck();
    System.out.println(allTheCards);


  }
}