abstract class Pizza{
    
    String description = "Unkown Pizza";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}