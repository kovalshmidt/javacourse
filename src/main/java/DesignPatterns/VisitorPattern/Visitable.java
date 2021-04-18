package DesignPatterns.VisitorPattern;

public interface Visitable {
    double accept(Visitor visitor);
}
