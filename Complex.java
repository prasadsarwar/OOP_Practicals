class Complex {
    private double real, imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imag * c.imag, this.real * c.imag + this.imag * c.real);
    }

    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        sum.display();
        diff.display();
        prod.display();
    }
}
