package dominio;

public class Calculadora {
    public double num1, num2;

    public Calculadora(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }

    public double somaNum() {
        return num1 + num2;
    }

    public double subNum() {
        return num1 - num2;
    }

    public double multNum() {
        return num1 * num2;
    }

    public double divNum() {
        if(num2 == 0){
            System.out.print("\nErro! Não é possível dividir por 0.");
            return 0;
        }
        return num1 / num2;
    }
}