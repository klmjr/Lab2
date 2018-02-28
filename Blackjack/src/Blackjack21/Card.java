package Blackjack21;


public class Card implements Comparable {
	
	private eRank eRank;
	private eSuit eSuit;
	
	
	
	public Card(eRank eRank, eSuit eSuit) {
		eRank = this.eRank;
		eSuit = this.eSuit;
	}
	
	
	

	

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	public eRank geteRank() {
		return eRank;
	}


	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}


	public eSuit geteSuit() {
		return eSuit;
	}

	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}






	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());
	}

}
	