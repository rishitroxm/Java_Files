class Box{

    float width,depth,heigth;

    Box(){
        width=depth=heigth=1;
    }

    Box(float width, float depth, float heigth)
    {
        this.width = width;
        this.depth = depth;
        this.heigth = heigth;
    }

    Box(Box o){

        this.width = o.width;
        this.depth = o.depth;
        this.heigth = o.heigth;
    }

    float Volume()
    {
        return width*depth*heigth;
    }

    float getWidth(){
        return width;
    }

    void setWidth(float width){
        this.width = width;
    }

    float getHeigth(){
        return heigth;
    }

    void setHeigth(float heigth){
        this.heigth = heigth;
    }

    float getDepth(){
        return depth;
    }

    void setDepth(float depth){
        this.depth = depth;
    }


}

class BoxWeigth extends Box {

    float weigth;

    BoxWeigth(){
        super();
        weigth = 1;
    }

    BoxWeigth(float width, float depth, float heigth, float weigth)
    {
       super(width,depth,heigth);
       this.weigth = weigth;
    }

    BoxWeigth(Box o, BoxWeigth ob){

        super(o);
        ob.weigth = weigth;
    }

    void Displayweigth(){
        System.out.println("weigth of the box is : " +weigth);
    }

    float getWeigth(){
        return weigth;
    }

    void setWeigth(float weigth){
        this.weigth = weigth;
    }

}



public class Answer7{
    public static void main (String[] args) {

    BoxWeigth b1 = new BoxWeigth();
    BoxWeigth b2 = new BoxWeigth(b1);
    BoxWeigth b3 = new BoxWeigth(2,4,6,8);

    System.out.println(b1.Volume());
    System.out.println(b1.getWeigth());
    System.out.println("");
    System.out.println(b2.Volume());
    System.out.println(b2.getWeigth());
    System.out.println("");
    System.out.println(b3.Volume());
    System.out.println(b3.getWeigth());

    }
}
