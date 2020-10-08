public class Rectangle {
        double width;
        double heigth;

        public Rectangle (double width, double heigth) {
            this.width = width;
            this.heigth = heigth;
        }

        public double getArea() {
            return this.heigth * this.width;
        }

        public double getPerimeter(){
            return (this.width + this.heigth) * 2;
        }

        public String display(){
            return "Rectangle{" + "width=" + width + ", height=" + heigth + "}";
        }
}
