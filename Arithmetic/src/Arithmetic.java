public class Arithmetic {
    int A = 0;
    int B = 0;
    int sum;
    int mult;

    public Arithmetic(int digit1, int digit2) {
        this.A = digit1;
        this.B = digit2;
    }

    public int plus() {
        sum = A + B;
        return sum;
    }

    public int multiply() {
        mult = A * B;
        return mult;
    }

    public int max() {
        if (A > B){
            return A;
        } else {
            return B;
        }
    }

    public int min() {
        if (A > B){
            return B;
        } else {
            return A;
        }
    }
}