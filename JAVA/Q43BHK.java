class OneBHk{
    private int roomArea;
    private int hallArea;
    private double price;
    OneBHk(){
        this.roomArea=0;
        this.hallArea=0;
        this.price=0.0;
    }
    OneBHk(int roomArea ,int hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    public void show(){
        System.out.println("Room Area "+ this.roomArea+ " Hall Area "
        +this.hallArea + " Price "+ this.price);
    }
}
class TwoBHK extends OneBHk{
    private int room2Area;
    TwoBHK(){
        super();
        this.room2Area=0;
    }
    TwoBHK(int roomArea ,int hallArea,double price,int room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
    public void show(){
        super.show();
        System.out.println("Room 2 Area "+ this.room2Area);
    }
}
public class Q43BHK{
    public static void main(String args[]){
        TwoBHK b1 =new TwoBHK(1,3,45000,1);
        TwoBHK b2 =new TwoBHK(2,6,80000,2);
        TwoBHK b3 =new TwoBHK(3,8,34000,3);
        b1.show();
        b2.show();
        b3.show();
    }
}