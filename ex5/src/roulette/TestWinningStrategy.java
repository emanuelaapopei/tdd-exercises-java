package roulette;

public class TestWinningStrategy implements WinningStrategy{
	int expectedPosition;
	boolean expectedOutcome;
	public TestWinningStrategy(int expectedPosition, boolean expectedOutcome) {
		this.expectedOutcome=expectedOutcome;
		this.expectedPosition=expectedPosition;
	}
	@Override
	public boolean winsOn(int wheelPosition) {
		if (wheelPosition==expectedPosition) return expectedOutcome;
		return false;
	}
	
}
