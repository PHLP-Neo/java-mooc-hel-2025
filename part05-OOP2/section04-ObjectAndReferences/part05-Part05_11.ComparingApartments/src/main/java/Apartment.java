
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquare(){
        return this.squares;
    }
    
    public int getPrice(){
        return this.squares * this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.getSquare());
    }
    
    public int priceDifference(Apartment compared){
        int difference = this.getPrice() - compared.getPrice();
        if (difference < 0) {
            return -difference;
        } else {
            return difference;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return (this.getPrice() - compared.getPrice()) > 0;
    }
}
