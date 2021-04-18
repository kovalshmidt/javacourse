package DesignPatterns.VisitorPattern;

import java.text.ParseException;

public interface Visitor {
    double visit(Liquor booze) throws ParseException;
    double visit(Tobacco tabak) throws ParseException;
    double visit(Necessity bearnecessity) throws ParseException;

}
