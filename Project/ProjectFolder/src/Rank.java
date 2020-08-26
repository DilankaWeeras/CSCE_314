/*
ENUM for Rank, even though it is capable of
taking in ints using constructor it did not work and
instead used a Switch case.
*/
public enum Rank {
	FRESHMAN(1),
	SOPHMORE(2),
	JUNIOR(3),
	SENIOR(4)
	;

	private final int numRank;

	private Rank(int numRank)
	{
		this.numRank = numRank;
	}
	public int getNumRank()
	{
		return this.numRank;
	}
}