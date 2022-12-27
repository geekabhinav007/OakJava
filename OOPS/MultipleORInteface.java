interface Tyre {
    void tyreDiminsion();

    void tyreMaterial();
}

interface Brake {
    void brakeDiminsion();

    void brakeMaterial();
}

class bicycle implements Brake, Tyre {
    public void tyreDiminsion() {
        System.out.println("I am of 10 m diameter");
    }

    public void tyreMaterial() {
        System.out.println("I am of naylon material");
    }

    public void brakeDiminsion() {
        System.out.println("I am of 10 cm long");
    }

    public void brakeMaterial() {
        System.out.println("I am of plastic material");
    }

}

public class MultipleORInteface {
    public static void main(String[] args) {
    bicycle bic = new bicycle();
        bic.tyreDiminsion();
        bic.brakeMaterial();
        bic.brakeDiminsion();
        bic.tyreMaterial();
    }

}
