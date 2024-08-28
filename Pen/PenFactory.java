public class PenFactory{
    public Pen getPen(String penType){
        if(penType == null){
            return null;
        }
        if(penType.equalsIgnoreCase("sketch"))
            return new Sketch();
         else if(penType.equalsIgnoreCase("gel"))
            return new Gel();z
        else
            return null;
    }
    }
