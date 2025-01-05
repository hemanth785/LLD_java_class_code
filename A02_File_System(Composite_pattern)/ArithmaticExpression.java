

public class ArithmaticExpression {

  public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;
  }


  //component
  interface ArithmeticExpression {

    public int evaluate();
  }

  // Leaf
  class Number implements ArithmeticExpression{
    int value;

    public Number(int value){
      this.value = value;
    }

    public int evaluate(){
      System.out.println("Number value is :" + value);
      return value;
    }
  }

  // Composite
  class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftPart, ArithmeticExpression rightPart, Operation operation){
      this.leftExpression = leftPart;
      this.rightExpression = rightPart;
      this.operation = operation;
    }

    public int evaluate(){

      int value = 0;
      switch (operation){

        case ADD:
          value = leftExpression.evaluate() + rightExpression.evaluate();
          break;
        case SUBTRACT:
          value = leftExpression.evaluate() - rightExpression.evaluate();
          break;
        case DIVIDE:
          value = leftExpression.evaluate() / rightExpression.evaluate();
          break;
        case MULTIPLY:
          value = leftExpression.evaluate() * rightExpression.evaluate();
          break;
      }

      System.out.println("Expression value is :" + value);
      return value;
    }


    // Client
    public static void main(String args[]){
      //2*(1+7)

     /*
                       *
                     /   \
                   2      +
                         / \
                        1   7
     */


      ArithmeticExpression two = new Number(2);

      ArithmeticExpression one = new Number(1);
      ArithmeticExpression seven = new Number(7);

      ArithmeticExpression addExpression = new Expression(one,seven, Operation.ADD);
      ArithmeticExpression parentExpression = new Expression(two,addExpression, Operation.MULTIPLY);

      System.out.println(parentExpression.evaluate());

    }

  }
}
