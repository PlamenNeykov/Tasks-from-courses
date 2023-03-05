package b_classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    //calculateSurfaceArea (): double
    //calculateLateralSurfaceArea (): double
    //calculateVolume (): double

    public double calculateSurfaceArea() {
        return 2 * this.height * this.length + 2 * this.height * this.width + 2 * this.length * this.width;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.height * this.length + 2 * this.height * this.width;
    }

    public double calculateVolume() {
        return this.length*this.width*this.height;
    }

}
