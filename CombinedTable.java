public class CombinedTable
{
    private SingleTable s1;
    private SingleTable s2;

    public CombinedTable(SingleTable single1, SingleTable single2) {
        s1 = single1;
        s2 = single2;
    }

    public boolean canSeat(int toSeat) {
        return (toSeat <= s1.getNumSeats()+s2.getNumSeats()-2);
    }

    public double getDesirability() {
        if (s1.getHeight()==s2.getHeight()) return (s1.getViewQuality()+s2.getViewQuality())/2;
        return (s1.getViewQuality()+s2.getViewQuality())/2-10;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
}