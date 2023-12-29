package hashSet;

import java.util.Objects;

class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        // complete the code here
        if (this == object){
            return true;
        }
        if (object == null || object.getClass() != getClass()){
            return false;
        }
        Point obj = (Point) object;
        return obj.x == this.x && obj.y == this.y;
    }

    @Override
    public int hashCode() {
        // complete the code here
        return Objects.hash(x,y);
    }

//    public static void main(String[] args) {
//        HashSet<Point> x = new HashSet<Point>();
//        x.add(new Point(1,2));
//        x.add(new Point(1,2));
//        System.out.println(Arrays.toString(x.toArray()));
//
//    }

}
