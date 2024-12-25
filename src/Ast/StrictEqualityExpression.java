package Ast;

public abstract class StrictEqualityExpression extends Expression {
    @Override
    public abstract String toString();
}

class EqualExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public EqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " === " + right.toString();
    }
}

class NotEqualExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public NotEqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " != " + right.toString();
    }
}

class GreaterExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public GreaterExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " > " + right.toString();
    }
}

class GreaterEqualExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public GreaterEqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " >= " + right.toString();
    }
}

class LessExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public LessExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " < " + right.toString();
    }
}

class LessEqualExpression extends StrictEqualityExpression {
    private Expression left;
    private Expression right;

    public LessEqualExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return left.toString() + " <= " + right.toString();
    }
}

class BooleanExpression extends StrictEqualityExpression {
    private boolean value;

    public BooleanExpression(boolean value) {
        this.value = value;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}

