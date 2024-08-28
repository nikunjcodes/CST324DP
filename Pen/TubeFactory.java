public class TubeFactory{
    public Tube getTube(String tubeType){ 
        if(tubeType == null){
            return null;
        }
        if(tubeType.equalsIgnoreCase("metal"))
            return new Metal();
        else if(tubeType.equalsIgnoreCase("fibre"))
            return new Fibre();
        else
            return null;
    }
}