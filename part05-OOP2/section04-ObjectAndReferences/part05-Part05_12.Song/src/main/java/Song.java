
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getArtist(){
        return this.artist;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDuration(){
        return this.durationInSeconds;
    }
    
    @Override
    public boolean equals(Object compared) {
        //return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Person object
        Song comparedPerson = (Song) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.artist.equals(comparedPerson.artist) &&
            this.name.equals(comparedPerson.name) &&
            this.durationInSeconds == comparedPerson.durationInSeconds) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
