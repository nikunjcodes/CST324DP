abstract class Pen{
    private Tube tubeType;
    private Refill refillType;
    private String penType;
    abstract void write();
    abstract String getPenType();
}