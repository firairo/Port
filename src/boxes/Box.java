package boxes;

public class Box extends AbstractBox {

    public Box(Integer wight, Integer length, Integer height, Integer density, Boolean isBig) {
        this.wight = wight;
        this.length = length;
        this.height = height;
        this.density = density;
        this.isBig = isBig;
    }
}