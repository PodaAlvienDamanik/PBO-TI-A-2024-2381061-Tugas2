package expressionvsstatement;

public class ExpressionvsStatement {
    public static void main(String[] args) {
        //Expression adalah operasi yang menghasilkan value
        //Statement adalah kumpulan dari 1 atau lebih Expression
        int x = 10;
        if (x > 15){
            System.out.println("x lebih besar dari 15");

        }
        int y = x+5;//ini semua Statement //x+5 itu expression
    }
}
