public class Q42Tile{
    public static void main(String args[]){
        Floor f =new Floor(6f,4f);
        Tile t =new Tile(4f);
        f.totalTiles(t);
    }
}
class Tile {
    private float edgeLength;
    Tile(){}
    Tile(float edgeLength){
        this.edgeLength=edgeLength;
    }
    public float getLength(){
        return edgeLength;
    }
}
class Floor extends Tile{
    private float length;
    private float width;

    Floor(){}
     Floor(float length,float width){
        this.length=length;
        this.width=width;
    }

    public void totalTiles(Tile t){
         float areaTile = t.getLength() * t.getLength();
       // int areaTile = super.edgeLength; // Error
        float areaFloor = length*width;
         float total = areaFloor/areaTile;
        System.out.println(total);
    }
}