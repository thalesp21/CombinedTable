public class SingleTable
{
    int seats = 4;
    int height = 70;
    double view = 50.0;

    public SingleTable(int nSeats, double nView, int nHeight)
    {
        seats = nSeats;
        height = nHeight;
        view = nView;
    }

    /** Returns the number of seats at this table. The value is always greater than or equal to 4. */
    public int getNumSeats()
    {
        return seats;
    }

    /** Returns the height of this table in centimeters. */
    public int getHeight()
    {
        return height;
    }

    /** Returns the quality of the view from this table. */
    public double getViewQuality()
    {
        return view;
    }

    /** Sets the quality of the view from this table to value . */
    public void setViewQuality(double value)
    {
        view = value;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}