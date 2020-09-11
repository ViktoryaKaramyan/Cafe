package Area;

public class ServingTable {

   private boolean tableOccupied;

    public ServingTable() {
        tableOccupied = false;
    }

    public boolean isTableOccupied(){
        return tableOccupied;
    }

    public void isBookedTable(){
        tableOccupied = true;
    }

    public void isRealiseTable(){
        tableOccupied = false;
    }
}
