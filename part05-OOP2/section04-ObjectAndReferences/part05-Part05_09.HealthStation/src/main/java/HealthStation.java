
public class HealthStation {

    private int weight_time;
    
    public HealthStation(){
        this.weight_time = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weight_time ++;
        return person.getWeight();
        // return -1;
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
        
    public int weighings(){
        return this.weight_time;
    }
    
}
